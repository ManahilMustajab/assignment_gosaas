define(["binder"], function(_binder) {
	
	function demoVM() {
		var self = this;

		self.errors = ko.observableArray();
		self.validationCompleted = ko.observable(false);
		
		self.onLoad = function() {
			var req = new Object();
			req.changeNotice = System.getParameterByName("changeNotice");
			
			System.sendHTTPRequestWithJWT(
				"POST",
				"approvers",
				JSON.stringify(req),
				function() {
					self.validationCompleted(true);
				},
				"Adding Approvers. Please wait..."
			);
		}
	}
	
	return {
		getInstance: function() {
			return new demoVM();
		}
	}
})