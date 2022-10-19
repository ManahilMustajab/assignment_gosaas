define(["binder"], function(_binder) {
	function criteriaGridVM() {
		var self = this;

		self.metadata = {};

		self.Criterias = ko.observableArray();
		self.recordToDelete = ko.observable();

		self.onLoad = function(init) {
			if (init) {
				if (init.criteriaCreated) {
					g_baseviewmodel.setFootNote(
						"success",
						"Criteria created successfully",
						5000
					);
				}

				self.metadata = init.metadata;
			} else {
				System.sendHTTPRequestWithJWT(
					"GET",
					"metadata",
					null,
					function(response) {
						self.metadata = response;
					},
					"Loading ..."
				);
			}

			System.sendHTTPRequestWithJWT(
				"GET",
				"approvalMatrixConfigurations",
				null,
				function(response) {
					for (var index in response) { 
						var entry = response[index].jsonEntry;
						entry.Id = response[index].id;
						self.Criterias.push(entry);
					};
				},
				"Loading ..."
			);
		};

		self.CreateCriteria = function() {
			self.metadata.editRow = {};
			g_baseviewmodel.showCreateCriteriaPage(self.metadata);
		};

		self.editCriteria = function(data) {
			self.metadata.editRow = data;
			g_baseviewmodel.showCreateCriteriaPage(self.metadata);
		}

		self.removeCriteria = function(data) {
			self.recordToDelete("");
			self.recordToDelete(data);
			$("#ConfirmationModal").modal("show");
		};

		self.warning_no = function() {
			self.recordToDelete("");
		};

		self.warning_yes = function() {
			self.deleteRecord();
		};

		self.deleteRecord = function() {		
			System.sendHTTPRequestWithJWT(
				"DELETE",
				"approvalMatrixConfigurations/" + self.recordToDelete().Id,
				null,
				function() {
					self.Criterias.remove(v => v.Id === self.recordToDelete().Id);
					self.recordToDelete("");
				},
				"Deleting ..."
			);
		};
	}

	return {
		getInstance: function() {
			return new criteriaGridVM();
		}
	};
});
