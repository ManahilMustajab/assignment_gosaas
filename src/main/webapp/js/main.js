require(["config/config"], function() {
	require(["binder", "globals"], function(loader) {
		var navigationHandler = function() {
			Sammy(function() {
				//Catch all possible patterns of hash.
				this.get(/\#(.*)/, function() {
					var allParams = this.params.splat[0].split("/");
					var url = allParams[0].toLowerCase();
					
					var pathSplit = this.path.split("/");
					if(pathSplit.length > 2) {
						g_appname = "/" + this.path.split("/")[1] + "/";
					} else {
						g_appname = "";
					}
					
					switch (url) {
						case "formpage":
							g_baseviewmodel.showFormPage();
							break;
						case "admin":
							g_baseviewmodel.showAdminPage();
							break;
						case "action":
							g_baseviewmodel.showActionPage();
							break;
						case "item":
							g_baseviewmodel.showItemPage();
							break;
							case "demo":
							g_baseviewmodel.showDemoPage();
							break;
							case "mainpage":
							g_baseviewmodel.showMainPage();
							break;
							case "structurepage":
							g_baseviewmodel.showStructurePage();
							break;
							case "attachmentpage":
							g_baseviewmodel.showAttachmentPage();
							break;
							
							
							
							
						default:
							alert("The URL doesn't exist.");
					}
				});

				//If no #route is given then route to main page
				this.get("", function(url) {
					if (g_baseviewmodel) g_baseviewmodel.showItemPage();
				});
			}).run();
		};

		loader.loadBaseView(false, navigationHandler);
	});
});
