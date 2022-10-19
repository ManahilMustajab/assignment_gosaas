define(["binder"], function(_binder) {

	function structurePageVM() {
		{
			var self = this;
			self.createStructureName = ko.observable();
			self.createStructureDescription = ko.observable();
			self.createStructureQuantity = ko.observable();
			self.response = new Object();
			self.structureList = ko.observableArray([]);
			self.requestToCloud = new Object();
			self.CorespondingItemId = ko.observable();
			self.getStructureId = ko.observable();
			function RefreshPage() {
				location.reload();
			};
			self.showModal = function() {
				g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>, Please enter all required fields!", 3000);
				return;
			};
			self.showSuccessModalDelete = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, Structure Deleted succesfully!", 3000);
				setTimeout(RefreshPage, 3000);
			};
			self.showSuccessModalCreate = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, Structure Added succesfully!", 3000);
				setTimeout(RefreshPage, 3000);
			};
			self.DeleteStructureFunction = function(event) {
				self.getStructureId(event.structureId);
			};
			self.onLoad = function() {
				var url = window.location.href;
				var start = url.indexOf('=');
				var baseURL = "";
				baseUrl = url.substring(start);
				self.CorespondingItemId(baseUrl.substring(1));
				//hitting API to get all structures of an item
				System.sendHTTPRequestWithJWT(
					"GET",
					"items/" + self.CorespondingItemId() + "/structures",
					null,
					function(response) {
						for (var i = 0; i < response.length; i++) {
							self.structureList.push(response[i]);
						};
					},
					//"Loading ...",null
				);
			};
			self.DeleteStructureModal = function() {
				$('#deleteModal').modal('hide');
				self.showSuccessModalDelete();
				System.sendHTTPRequestWithJWT(
					//hitting API to delete a specified structure of an item
					"DELETE",
					"items/" + self.CorespondingItemId() + "/structures/" + self.getStructureId(),
					null,
					function(response) { },
					"deleting item...",
					null
				);
				$('#deleteModal').modal('hide');
			}
			self.CreateStructureFunction = function(event) {
				self.response.structureName = self.createStructureName();
				self.response.structureDescription = self.createStructureDescription();
				self.response.structureQuantity = self.createStructureQuantity();
				if (self.createStructureName() && self.createStructureDescription() && self.createStructureQuantity()) {
					$('#createModal').modal('hide');
					self.showSuccessModalCreate();
					//hitting API to create a structure of an item
					System.sendHTTPRequestWithJWT(
						"POST",
						"items/" + self.CorespondingItemId() + "/structures",
						JSON.stringify(self.response),
						null
					);
					//hitting Api to create structure on Cloud
					self.requestToCloud.ItemNumber = self.createStructureName();
					self.requestToCloud.ItemDescription = self.createStructureDescription();
					System.sendHTTPRequestWithJWT(
						"POST",
						"syncitems",
						JSON.stringify(self.requestToCloud),
						function(response) {
						},
					);
					// This api Setting the Attachment Status for the item to True
					System.sendHTTPRequestWithJWT(
						"PUT",
						"changeStructureStatus/" + self.CorespondingItemId(),
						null,
						function(response) { }, "...Creating Structure", null
					);
				} else {
					$('#createModal').modal('hide');
					self.showModal();
				}
			};
		}
	}
	return {
		getInstance: function() {
			return new structurePageVM();
		}
	};
});
