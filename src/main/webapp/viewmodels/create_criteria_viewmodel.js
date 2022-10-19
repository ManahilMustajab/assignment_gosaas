define(["binder"], function(_binder) {
	var binder = _binder;

	function validateVM() {
		var self = this;

		self.metadata = {};

		self.criteriaId = ko.observable(-1);

		self.changeTypes = ko.observableArray([]);
		self.changeType = ko.observable("").extend({ required: true });
		self.wfStatuses = ko.observableArray([]);
		self.wfStatus = ko.observable("").extend({ required: true });
		self.criteria = ko.observable("").extend({ required: true });
		self.internalCriteria = "";
		self.approvers = ko.observableArray([]).extend({
			/*validation: {
			  validator: function(val) {
				return val.length > 0;
			  },
			  message: "This field is required"
			}*/
		});
		self.approverGroups = ko.observableArray([]);
		self.dynamicFields = ko.observableArray([]);
		self.selectedDynamicFields = ko.observableArray([]);
		
		self.optionalApprovers = ko.observableArray([]);
		self.optionalApproverGroups = ko.observableArray([]);
		self.optionalApproversDynamic = ko.observableArray([]);
		self.notifiers = ko.observableArray([]);
		self.notifiersDynamic = ko.observableArray([]);
		
		self.assignedTo = ko.observable("");

		self.criteriaRows = ko.observableArray([]);
		self.scopeList = ko.observableArray(["Change", "Item"]);

		self.jwt = "";

		self.select2Config = {
			theme: "bootstrap",
			width: "100%"
		};

		self.approversSelect2 = {
			ajax: {
				delay: 500,
				url: g_appname + "users",
				headers: {
					"Authorization": "Bearer " + System.getParameterByName("jwt")
				},
				data: function(params) {
					var query = {
						displayName: params.term
					};
					return query;
				},
				processResults: function(data) {
					return {
						results: data
					};
				}
			},
			allowClear: true,
			placeholder: "Select ...",
			theme: "bootstrap",
			width: "100%"
		};

		self.approverGroupsSelect2 = {
			ajax: {
				delay: 500,
				url: g_appname + "roles",
				headers: {
					"Authorization": "Bearer " + System.getParameterByName("jwt")
				},
				data: function(params) {
					var query = {
						displayName: params.term
					};
					return query;
				},
				processResults: function(data) {
					return {
						results: data
					};
				}
			},
			allowClear: true,
			placeholder: "Select ...",
			theme: "bootstrap",
			width: "100%"
		};

		self.onLoad = function(metadata) {
			self.jwt = System.getParameterByName("jwt");
			self.metadata = metadata;
			self.changeTypes(self.metadata.classNames.Change);
			self.dynamicFields(self.metadata.dynamicFields);

			if (metadata.editRow.Id) {
				self.criteriaId(metadata.editRow.Id);

				self.changeType(self.metadata.classNames.Change.filter(type => type.displayName === metadata.editRow.ChangeType)[0]);

				self.wfStatuses(self.metadata.workflows[self.changeType().internalName]);
				self.wfStatus(self.wfStatuses().filter(wfStatus => wfStatus.displayName === metadata.editRow.Status)[0]);

				self.criteria(metadata.editRow.Criteria);
			} else {
				self.criteriaId(-1);
				self.changeType(self.metadata.classNames.Change[0]);
			}
		};

		self.enableCriteriaEdit = function() {
			return (self.criteriaId() == -1);
		};

		self.handleChangeTypeChange = function(entry, event) {
			//Change cannot be updated in Edit mode. Don't perform this event to avoid issues while initializing the value
			if (self.criteriaId() >= 0) {
				return;
			}

			self.wfStatuses(self.metadata.workflows[self.changeType().internalName]);

			self.criteriaRows([]);
			self.criteria("");

			self.criteriaRows.push(
				new condition({
					scope: "",
					classList: self.metadata.classNames.Change,
					className: self.changeType(),
					attributeGroupList:
						self.metadata.attributeGroups[self.changeType().internalName],
					attributeGroup: "",
					attributeList: [],
					attribute: "",
					operatorList: [],
					operator: "",
					lov: [],
					value: "",
					conjunction: ""
				})
			);
		};

		self.create = function() {
			var result = ko.validation.group(self, { deep: true });
			if (result().length > 0) {
				result.showAllMessages(true);
				return false;
			}

			var httpMethod = "POST";
			var httpEndpoint = "approvalMatrixConfigurations";
			var req = new Object();
			if(self.criteriaId() > 0) {
				httpMethod = "PUT";
				httpEndpoint += "/" + self.criteriaId();
			}
			
			req.changeType = self.changeType().internalName;
			req.statusCode = self.wfStatus().statusCode;
			req.criteria = self.internalCriteria;
			req.approvers = self
				.approvers()
				.concat(self.approverGroups())
				.concat(self.selectedDynamicFields())
				.map(e => e.id)
				.join("; ");
			if(req.approvers.length == 0) req.approvers = null;
			
			req.optionalApprovers = self
				.optionalApprovers()
				.concat(self.optionalApproverGroups())
				.concat(self.optionalApproversDynamic())
				.map(e => e.id)
				.join("; ");
			if(req.optionalApprovers.length == 0) req.optionalApprovers = null;
				
			req.notifiers = self
				.notifiers()
				.concat(self.notifiersDynamic())
				.map(e => e.id)
				.join("; ");
			if(req.notifiers.length == 0) req.notifiers = null;
				
			req.assignedTo = self.assignedTo() ? self.assignedTo()[0].id : "";

			let jsonEntry = {};
			jsonEntry.ChangeType = self.changeType().displayName;
			jsonEntry.Status = self.wfStatus().displayName;
			jsonEntry.Criteria = self.criteria();
			jsonEntry.ApproverName = self
				.approvers()
				.concat(self.approverGroups())
				.concat(self.selectedDynamicFields())
				.map(e => e.text)
				.join("; ");
			jsonEntry.optionalApprovers = self
				.optionalApprovers()
				.concat(self.optionalApproverGroups())
				.concat(self.optionalApproversDynamic())
				.map(e => e.text)
				.join("; ");
			jsonEntry.notifiers = self
				.notifiers()
				.concat(self.notifiersDynamic())
				.map(e => e.text)
				.join("; ");
			jsonEntry.AssignedTo = self.assignedTo() ? self.assignedTo()[0].text : "";
			req.jsonEntry = jsonEntry;
			
			System.sendHTTPRequestWithJWT(
				httpMethod,
				httpEndpoint,
				JSON.stringify(req),
				function() {
					setTimeout(() => {
						g_baseviewmodel.showAdminPage({
							criteriaCreated: true,
							metadata: self.metadata
						});
					}, 1500);
				},
				"Creating criteria..."
			);
		};

		self.cancel = function() {
			g_baseviewmodel.showAdminPage({
				criteriaCreated: false,
				metadata: self.metadata
			});
		};

		/**
		 * Modal Functions
		 * */
		self.editCriteria = function() {
			self.internalCriteria = "";
			let criteriaString = "";
			let itemClassConditionAdded = false;

			for (let i = 0; i < self.criteriaRows().length; i++) {
				let row = self.criteriaRows()[i];

				if (i > 0) {
					self.internalCriteria += " && ";
					criteriaString += " And ";
				}

				if (
					!itemClassConditionAdded &&
					row.scope() === "Item" &&
					row.className().internalName !== "$any"
				) {
					self.internalCriteria +=
						"[Item.ItemClass] = '" + row.className().displayName + "'";
					criteriaString +=
						"[Item.Class] = '" + row.className().displayName + "'";

					itemClassConditionAdded = true;
					if (!row.attributeGroup()) {
						continue;
					} else {
						self.internalCriteria += " && ";
						criteriaString += " And ";
					}
				}

				self.internalCriteria += "[" + row.scope() + ".";
				criteriaString += "[" + row.scope() + ".";

				if (
					row.attributeGroup().internalName !== "OOTBChange" &&
					row.attributeGroup().internalName !== "OOTBItem" &&
					row.attributeGroup().internalName !== "ChangeLine"
				) {
					if (row.scope() === "Item") {
						self.internalCriteria +=
							"ItemEffCategory." + row.attributeGroup().internalName + ".";
					} else {
						self.internalCriteria += row.attributeGroup().internalName + ".";
					}
				}

				self.internalCriteria +=
					row.attribute().internalName +
					"] " +
					row.operator().internalName +
					" '" +
					row.value() +
					"'";

				criteriaString +=
					row.attribute().displayName +
					"] " +
					row.operator().internalName +
					" '" +
					row.value() +
					"'";
			}
			self.criteria(criteriaString);

			$("#edit_criteria").modal("hide");
		};

		self.enableClassName = function(i) {
			if (self.criteriaRows()[i].scope() === "Change") {
				return false;
			}

			for (var j = 0; j < i; j++) {
				if (self.criteriaRows()[j].scope() === "Item") {
					return false;
				}
			}

			return true;
		};

		self.enableModalRowDelete = function(i) {
			return i > 0;
		};

		self.enableModalRowAdd = function(i) {
			return i == self.criteriaRows().length - 1;
		};

		self.deleteModalRow = function(entry) {
			self.criteriaRows.remove(entry);
			self.criteriaRows()[self.criteriaRows().length - 1].conjunction("");
		};

		self.addModalRow = function(entry) {
			entry.conjunction("And");
			self.criteriaRows.push(
				new condition({
					scope: "",
					classList: self.metadata.classNames.Change,
					className: self.changeType(),
					attributeGroupList:
						self.metadata.attributeGroups[self.changeType().internalName],
					attributeGroup: "",
					attributeList: [],
					attribute: "",
					operatorList: [],
					operator: "",
					lov: [],
					value: "",
					conjunction: ""
				})
			);
		};

		self.handleScopeChange = function(entry, event) {
			entry.classList(self.metadata.classNames[entry.scope()]);

			if (entry.scope() === "Change") {
				entry.className(self.changeType());
				entry.attributeGroupList(
					self.metadata.attributeGroups[entry.className().internalName]
				);
			} else {
				let index = self.criteriaRows().indexOf(entry);
				for (var i = 0; i < index; i++) {
					if (self.criteriaRows()[i].scope() === "Item") {
						entry.className(self.criteriaRows()[i].className());
						if (entry.className()) {
							entry.attributeGroupList(
								self.metadata.attributeGroups[entry.className().internalName]
							);
						} else {
							entry.attributeGroupList([]);
						}
						break;
					}
				}
			}
		};

		self.handleClassChange = function(entry, event) {
			if (entry.className()) {
				entry.attributeGroupList(
					self.metadata.attributeGroups[entry.className().internalName]
				);
			} else {
				entry.attributeGroupList([]);
			}

			if (entry.scope() === "Item") {
				let index = self.criteriaRows().indexOf(entry);
				for (var i = index + 1; i < self.criteriaRows().length; i++) {
					if (self.criteriaRows()[i].scope() === "Item") {
						self.criteriaRows()[i].className(entry.className());
						if (entry.className()) {
							self
								.criteriaRows()
							[i].attributeGroupList(
								self.metadata.attributeGroups[entry.className().internalName]
							);
						} else {
							self.criteriaRows()[i].attributeGroupList([]);
						}
					}
				}
			}
		};

		self.handleAttrGroupChange = function(entry, event) {
			if (entry.attributeGroup())
				entry.attributeList(
					self.metadata.attributes[entry.attributeGroup().internalName]
				);
			else entry.attributeList([]);
		};

		self.handleAttrChange = function(entry, event) {
			if (entry.attribute()) {
				entry.operatorList(self.metadata.operators[entry.attribute().type]);

				if (
					entry.attribute().type === "list" &&
					entry.attribute().lov.length > 0
				) {					
					System.sendHTTPRequestWithJWT(
						"GET",
						"valueSetValues/?valueSetCode=" + entry.attribute().lov,
						null,
						function(response) {
							entry.lov(response);
						},
						"Loading ..."
					);
				} else {
					entry.lov([]);
					entry.value("");
				}
			} else {
				entry.operatorList([]);
			}
		};
	}

	function condition(data) {
		var self = this;

		self.scope = ko.observable(data.scope);
		self.classList = ko.observableArray(data.classList);
		self.className = ko.observable(data.className);
		self.attributeGroupList = ko.observableArray(data.attributeGroupList);
		self.attributeGroup = ko.observable(data.attributeGroup);
		self.attributeList = ko.observableArray(data.attributeList);
		self.attribute = ko.observable(data.attribute);
		self.operatorList = ko.observableArray(data.operatorList);
		self.operator = ko.observable(data.operator);
		self.lov = ko.observableArray(data.lov);
		self.value = ko.observable(data.value);

		self.conjunction = ko.observable(data.conjunction);
	}

	return {
		getInstance: function() {
			return new validateVM();
		}
	};
});
