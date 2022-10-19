define(["binder"], function(_binder) {

	function exampleVM() {
		{
			var self = this;
			self.createId = ko.observable();
			self.createName = ko.observable();
			self.createDescription = ko.observable();
			self.SyncStatus = ko.observable();
			self.responseItem = new Object();
			self.databaseList = ko.observableArray([]);
			self.cloudList = ko.observableArray([]);
			self.deleteItemParameter = ko.observable();
			self.requestItemCreation = new Object();
			self.EditSafeSyncStatus = ko.observable();
			self.responseEditItem = new Object();
			self.getItemId = ko.observable();
			self.getItemName = ko.observable();
			self.editItemName = ko.observable();
			self.editItemDescription = ko.observable();
			self.changeNotice = ko.observable();
			self.changeName = ko.observable();
			self.changeDescription = ko.observable();
			self.createChangeOrder = new Object();
			self.addAffectedItems = new Object();
			self.affectedItems = ko.observableArray([]);
			self.settingCO = ko.observable();
			self.settingStructureStatus = ko.observable();
			self.RedlineTheStructure = new Object();

			self.onLoad = function(event) {
				//hitting API to get items stored from DB onLoad of page
				System.sendHTTPRequestWithJWT(
					"GET",
					"items",
					JSON.stringify(),
					function(response) {
						for (var i = 0; i < response.length; i++) {
							if (response[i].itemSyncStatus == "false") {
								self.databaseList.push(response[i]);
							}
							else {
								self.cloudList.push(response[i]);
							}
						}
					},
					//"Loading data ...",null
				);
			};
			function RefreshPage() {
				location.reload();
			};
			self.showSuccessModalEdited = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, Data Edited  succesfully!", 3000);
				setTimeout(RefreshPage, 3000);
				return;
			};
			self.showModal = function() {
				g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>, Please enter all required fields!", 3000);
				return;
			};
			self.delayModal = function() {
				g_baseviewmodel.setFootNote("info", "<b><u>Info</u></b>, This operation may take time...", 2000);
				return;
			};
			self.showSuccessModalDelete = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Sucess</u></b>, Item deleted succesfully!", 3000);
				setTimeout(RefreshPage, 3000);
			};
			self.showSuccessModalCreate = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, Item Added succesfully!", 3000);
				setTimeout(RefreshPage, 3000);
			};
			self.showSuccessModalChangeOrder = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, Change Order created  succesfully!", 2000);
			};
			self.showFailModalChangeOrder = function() {
				g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>, Failed in creating Change Order...", 2000);
			};
			self.showRedlineStructure = function() {
				g_baseviewmodel.setFootNote("Info", "<b><u>Info</u></b>, Redlining Structure...", 2000);
			};
			self.showRedlineStructureSuccess = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, Redlining Structure Successful...", 5000);
			};
			self.showRedlineStructureFail = function() {
				g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>, Redlining Structure Failed...", 5000);
			};
			self.showRedlineAttachment = function() {
				g_baseviewmodel.setFootNote("Info", "<b><u>Info</u></b>,Redlining Attachment...", 2000);
			};
			self.showAffectedojectsSuccessModal = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>,Adding Affected object successful...", 2000);
			};
			self.showAffectedojectsFailedModal = function() {
				g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>,Adding Affected object failed...", 2000);
			};
			self.showSyncItemFail = function() {
				g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>,Syncing item on cloud failed...", 2000);
			};
			self.showSyncItemSuccess = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>,Syncing item on cloud successful...", 2000);
			};
			self.showSyncItemSuccessNoData = function() {
				g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>,Syncing item on cloud successful...", 2000);
			};
			self.DeleteItemFunction = function(event) {
				self.deleteItemParameter(event.itemId);
			};
			self.DeleteItemModal = function() {
				$('#deleteModal').modal('hide');
				self.showSuccessModalDelete();
				deleteId = self.deleteItemParameter();
				//hitting API to delete item from DB
				System.sendHTTPRequestWithJWT(
					"DELETE",
					"items/" + deleteId,
					null,
					function(response) { },
					"deleting item...",
					null
				);
			};
			function RefreshPage() {
				location.reload();
			};
			self.EditItemFunction = function(event) {
				self.getItemId(event.itemId);
				self.EditSafeSyncStatus(event.itemSyncStatus);
			};
			self.EditItemModal = function(event) {
				self.responseEditItem.itemId = self.getItemId();
				self.responseEditItem.itemName = self.editItemName();
				self.responseEditItem.itemDescription = self.editItemDescription();
				self.responseEditItem.itemSyncStatus = self.EditSafeSyncStatus();
				if (self.editItemName() && self.editItemDescription()) {
					$('#editModal').modal('hide');
					self.showSuccessModalEdited();
					//hitting API to edit item details in DB
					System.sendHTTPRequestWithJWT(
						"PUT",
						"items/" + self.getItemId(),
						JSON.stringify(self.responseEditItem),
						null,
						//"editing item...",
						//null	
					);
				}
				else {
					$('#editModal').modal('hide');
					self.showModal();
				}
			};
			self.redirectToStructure = function(event) {
				self.getItemId(event.itemId);
				//hitting API to redirect to Structure page
				System.sendHTTPRequestWithJWT(
					"GET",
					"redirectToStructure/" + self.getItemId(),
					null,
					function(response) {
						window.location.href = response.itemName;
					},
					//"editing item..."					
				);
			};
			self.redirectToAttachment = function(event) {
				self.getItemId(event.itemId);
				//hitting API to redirect to attachment page
				System.sendHTTPRequestWithJWT(
					"GET",
					"redirectToAttachment/" + self.getItemId(),
					null,
					function(response) {
						window.location.href = response.itemName;
					},
					//"editing item..."		
				);
			};
			self.CreateItemFunction = function(event) {
				self.responseItem.itemName = self.createName();
				self.responseItem.itemDescription = self.createDescription();
				self.responseItem.itemSyncStatus = "false";
				self.responseItem.changeOrderId = "Null";
				self.SyncStatus(false);
				if (self.createName() && self.createDescription()) {
					$('#createModal').modal('hide');
					self.showSuccessModalCreate();
					//Hiiting API to add an item to DB
					System.sendHTTPRequestWithJWT(
						"POST",
						"items",
						JSON.stringify(self.responseItem),
						function(response) {
						}
					);
				}
				else {
					$('#createModal').modal('hide');
					self.showModal();
				}
			};
			self.createCloudItem = function(event) {
				self.getItemId(event.itemId);
				if (event.attachmentStatus == "true" || event.structureStatus == "true") {
					if (event.structureStatus == "true") self.settingStructureStatus("true");
					console.log("found either attachment or structure within item...");
					self.getItemName(event.itemName);
					self.requestItemCreation.ItemNumber = event.itemName;
					self.requestItemCreation.ItemDescription = event.itemDescription;
					//hitting API to sync DB item to clouds
					System.sendHTTPRequestWithJWT(
						"POST",
						"syncitems",
						JSON.stringify(self.requestItemCreation),
						function(response) {
							if (response == false)
								self.showSyncItemFail();
							else
								self.showSyncItemSuccess();
						},
					);
					System.sendHTTPRequestWithJWT(
						"PUT",
						"changeSyncStatus/" + event.itemId,
						null,
						function(response) {
						},
					);
					$('#changeOrderModal').modal('show');
				} else {
					console.log("no attachments or structure for item exist...")
					self.requestItemCreation.ItemNumber = event.itemName;
					self.requestItemCreation.ItemDescription = event.itemDescription;
					//hitting API to sync DB item to clouds
					System.sendHTTPRequestWithJWT(
						"POST",
						"syncitems",
						JSON.stringify(self.requestItemCreation),
						function(response) {
							if (response == false)
								self.showSyncItemFail();
							else {
								self.showSyncItemSuccessNoData();
								//hitting API to change sync status of Item
								System.sendHTTPRequestWithJWT(
									"PUT",
									"changeSyncStatus/" + event.itemId,
									null,
									function(response) {
									},
								);

							}

						},
					);
				}
			}
			self.CreateChangeOrderRequest = function() {
				$('#changeOrderModal').modal('hide');
				self.delayModal();
				self.createChangeOrder.changeNotice = self.changeNotice();
				self.createChangeOrder.changeName = self.changeName();
				self.createChangeOrder.changeDescription = self.changeDescription();
				self.addAffectedItems.changeNotice = self.changeNotice();
				self.addAffectedItems.changeName = self.changeName();
				self.addAffectedItems.changeDescription = self.changeDescription();
				self.addAffectedItems.affectedItemNumber = self.getItemName();
				//hitting API to create a change order on cloud
				System.sendHTTPRequestWithJWT(
					"POST",
					"createChangeOrderr",
					JSON.stringify(self.createChangeOrder),
					function(response) {
						if (response == true) {
							self.showSuccessModalChangeOrder();
							//hitting API to set Chnageorfer number for the item
							System.sendHTTPRequestWithJWT(
								"PUT",
								"setCONumber/" + self.getItemId(),
								self.changeNotice(),
								function(response) {
								},
							);
							//hitting API to add affected objects to change order
							System.sendHTTPRequestWithJWT(
								"POST",
								"addAffectedObjects",
								JSON.stringify(self.addAffectedItems),
								function(response) {
									if (response == true) {
										self.showAffectedojectsSuccessModal();
										//redling structures if has structure

										if (self.settingStructureStatus() == "true") {
											console.log("item has structure so hitting redlining api for structure...")
											//hitting API to get all structures belonging to an item
											System.sendHTTPRequestWithJWT(
												"GET",
												"items/" + self.getItemId() + "/structures",
												null,
												function(response) {
													self.showRedlineStructure();
													self.RedlineTheStructure.changeNotice = self.changeNotice();
													for (var i = 0; i < response.length; i++) {
														self.RedlineTheStructure.ComponentItemNumber = response[i].structureName;
														self.RedlineTheStructure.structureQuantity = response[i].structureQuantity;
														//hitting API to redline structures of an item on cloud
														System.sendHTTPRequestWithJWT(
															"POST",
															"RedlineStructure/" + self.RedlineTheStructure.ComponentItemNumber,
															JSON.stringify(self.RedlineTheStructure),
															function(response) {
																if (response == true)
																	self.showRedlineStructureSuccess();
																else
																	self.showRedlineStructureFail();
															}
														);
													}
												},
												//"editing item..."		
											);
										} else {
											console.log("item has no structure...")
										}
									} else {
										self.showAffectedojectsFailedModal();
									}
								}
							);
						}
						else {
							console.log("got false response fot creating change order...");
							self.showFailModalChangeOrder();
						}

					});

			};

		};

	}
	return {
		getInstance: function() {
			return new exampleVM();
		}
	};
});