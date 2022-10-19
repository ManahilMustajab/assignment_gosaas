define(["binder"], function(_binder) {

	function attachmentPageVM() {
		var self = this;
		self.responseItem = new Object();
		self.AttachmentList = ko.observableArray([]);
		self.deleteAttachmentId = ko.observable();
		self.CorespondingItemId = ko.observable();
		self.AttachmentData = new FormData();

		function RefreshPage() {
			location.reload();
		};
		self.showSuccessModalDelete = function() {
			g_baseviewmodel.setFootNote("success", "<b><u>Sucess</u></b>, Item deleted succesfully!", 3000);
			setTimeout(RefreshPage, 2500);
		};
		self.showModal = function() {
			g_baseviewmodel.setFootNote("error", "<b><u>Error</u></b>, Please select a file!", 3000);
			return;
		};
		self.showSuccessModal = function() {
			g_baseviewmodel.setFootNote("success", "<b><u>Success</u></b>, file added succesfully!", 3000);
			setTimeout(RefreshPage, 2500);
			return;
		};
		self.DownloadFile = function(event) {
			urlToSend = "items/" + self.CorespondingItemId() + "/attachments/" + event.attachmentId;
			System.sendFileDownloadRequestWithJWT(urlToSend, "Downloading FIle",)
		};
		self.getDeleteId = function(event) {
			self.deleteAttachmentId = event.attachmentId;
			$('#deleteModal').modal('show');
		};
		self.DeleteAttachment = function() {
			//Hitting API to delete a specified attachment of an item
			System.sendHTTPRequestWithJWT(
				"DELETE",
				"items/" + self.CorespondingItemId() + "/attachments/" + self.deleteAttachmentId,
				null,
				function(response) {
				},
				// "Deleting Item", null
			);
			$('#deleteModal').modal('hide');
			self.showSuccessModalDelete();
		};
		//uploading an attachment to an item
		self.UploadAttachment = async function(event) {
			var file = $('#fileUpload')[0];
			if ($('#fileUpload').get(0).files.length > 0) {
				$('#createModal').modal('hide');
				self.showSuccessModal();
				self.AttachmentData.append('file', file.files[0]);
				var url = "items/" + self.CorespondingItemId() + "/attachments";
				// API Setting Attachment exists status to true for item
				System.sendHTTPRequestWithJWT(
					"PUT",
					"changeAttachmentStatus/" + self.CorespondingItemId(),
					null,
					function(response) { }, //"...Uploading File", null
				);
				await fetch(url, { method: "POST", body: self.AttachmentData });
			}
			else {
				$('#createModal').modal('hide');
				self.showModal();
			}
		};
		self.onLoad = function() {
			var url = window.location.href;
			var start = url.indexOf('=');
			var baseURL = "";
			baseUrl = url.substring(start);
			self.CorespondingItemId(baseUrl.substring(1));
			//Hitting API to get attachments of an item
			System.sendHTTPRequestWithJWT(
				"GET",
				"items/" + self.CorespondingItemId() + "/attachments",
				null,
				function(response) {
					for (var i = 0; i < response.length; i++) {
						self.AttachmentList.push(response[i]);
					};
				},
				//"Loading ...",null
			);
		};
	}
	return {
		getInstance: function() {
			return new attachmentPageVM();
		}
	}
})