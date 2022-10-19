define(["binder"], function(_binder) {
		var binder = _binder;

		function formpageVM() {
			var self = this;
			self.changeNameError = ko.observable('');
			self.attatchmentFileContent = ko.observable("");
			self.attatchmentFileName = ko.observable("");
			self.changeMethodTypeSelect = ko.observable("new");
			self.createChangeNotice = ko.observable("")
			self.changeTypeSelect = ko.observable()
			self.changeTypeOptions = ko.observableArray([]);
			self.changeNotice = ko.observable("");
			self.changeName = ko.observable("");
			self.isNewChangeSelected = ko.observable(true);
			self.isExistingChangeSelected = ko.observable(false);
			self.errors = ko.observableArray([]);

			self.onLoad = function() {
				System.sendHTTPRequestWithJWT(
					"GET",
					"changeTypes",
					null,
					function(response) {
						if (response.success) {
							self.changeTypeOptions(response.data);
						}
					},
					"Loading ..."
				);
			}

			self.onChangeMethodEvent = function(data, event) {
				if (self.isNewChangeSelected()) {
					self.isExistingChangeSelected(true);
					self.isNewChangeSelected(false);
				} else {
					self.isExistingChangeSelected(false);
					self.isNewChangeSelected(true);
				}
				return true;
			}

			self.changeNoticeSelect2 = {
				ajax: {
					delay: 500,
					url: g_appname + "search",
					data: function(params) {
						var query = {
							changeType: self.changeTypeSelect().internalName,
							changeNotice: params.term,
							jwt: System.getParameterByName("jwt")
						};
						return query;
					},
					processResults: function(result) {
						var data = result.data;
						if (data.status !== "success") {
							g_baseviewmodel.setFootNote("error", data.message);
							$("#changeNoticeSearch").select2("close");
							$('#createChangeRequest').modal('hide');
							return {
								results: []
							};
						}

						var options = [];
						data = data.options.map(opt => {
							options.push({
								id: opt,
								text: opt
							})
						});

						return {
							results: options
						};
					}
				},
				dropdownParent: $('#exampleModal'),
				placeholder: "Select ...",
				dropdownAutoWidth: true,
				theme: "bootstrap",
				width: "100%",
				allowClear: false,
				minimumInputLength: 3
			};

			self.fileUpload = function(data, e) {
				var file = e.target.files[0];
				var reader = new FileReader();
				reader.onloadend = function(onloadend_e) {
					var result = reader.result;
					self.attatchmentFileContent(result);
				};
				if (file) {
					reader.readAsBinaryString(file);
					self.attatchmentFileName(file.name);
				}
			};

			self.sendRequest = function() {
				self.errors([]);
				var req = new Object();
				var data = new FormData();

				//Required Field
				if (self.changeMethodTypeSelect() === "new" && self.changeName().length === 0) {
					return;
				}

				if (self.changeMethodTypeSelect() !== "new" && !self.changeNotice()) {
					return;
				}



				var file = $('#attachmentFile')[0];
				req.changeName = self.changeMethodTypeSelect() === "new" ? self.changeName() : self.changeNotice();
				req.jwt = System.getParameterByName("jwt");
				req.changeType = self.changeTypeSelect().internalName;
				req.createNewChange = self.changeMethodTypeSelect() === "new";
				const blob = new Blob([JSON.stringify(req)], {
					type: 'application/json'
				});

				data.append('file', file.files[0]);
				data.append('request', blob);

				System.sendFileHTTPRequestWithJWT(
					"POST",
					"ImportFile",
					data,
					function(response) {
						var jsonResponse = JSON.parse(response);
						if (jsonResponse.success) {
							g_baseviewmodel.setFootNote("success", jsonResponse.data);
						} else {
							var responseData = jsonResponse.data;
							for (var i = 0; i < responseData.length; i++)
								self.errors.push(responseData[i]);
							g_baseviewmodel.setFootNote("error", "Please resolve data validation issues!");
						}
						$("#exampleModal").modal('hide');
					},
					"Processing Request ..."
				);

				$("#exampleModal").modal('hide');
			}


			self.showModal = function() {
				//Check if file selected or not
				if ($('#attachmentFile').get(0).files.length == 0) {
					$("#exampleModal").modal('hide');
					g_baseviewmodel.setFootNote("error", "Please select a file!");
					return;
				}

				$('#exampleModal').modal('show');
			}

			//Reset all fields on modal close
			$('#exampleModal').on('hidden.bs.modal', function() {
				self.changeName("");
				$('#changeNoticeSearch').val("").trigger('change');
				self.changeNotice("");
			});


		}

		return {
			getInstance: function() {
				return new formpageVM();
			}
		};
	});
