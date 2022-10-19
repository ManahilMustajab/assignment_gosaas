define(["binder"], function(_binder) {
  var binder = _binder;

  function BaseVM() {
    var self = this;

    ko.validation.init(
      {
        errorElementClass: "has-error",
        errorMessageClass: "help-block",
        decorateInputElement: true
      },
      true
    );

    self.msg = ko.observable();
    self.footerClass = ko.observable("alert alert-info");

    self.onLoad = function() {};

    self.showAdminPage = function(init) {
      binder.loadView(
        "criteria_grid",
        "criteria_grid_viewmodel",
        "criteria_grid_div",
        null,
        init
      );
    };

    self.showStructurePage=function(init){
	   binder.loadView(
        "structurePage",
        "structurePage_viewmodel",
        "structure_div",
        null,
        init
      );
};
  self.showAttachmentPage = function(init) {
      binder.loadView(
        "attachmentPage",
        "attachmentPage_viewmodel",
        "attachment_div",
        null,
        init
      );
    };


	self.showActionPage = function(init) {
      binder.loadView(
        "action",
        "action_viewmodel",
        "action_div",
        null,
        init
      );
    };
    self.showItemPage=function(init){
	  binder.loadView(
        "item",
         "item_viewmodel",
          "item_div",
           null, 
           init
        );
};
    self.showFormPage=function(init){
	binder.loadView(
        "formpage",
        "formpage_viewmodel",
        "FormCreationDiv",
        null,
        init
      );
	
};
 self.showMainPage=function(init){
	  binder.loadView(
        "mainPage",
         "mainPage_viewmodel",
          "mainPage_div",
           null, 
           init
        );
};

    self.showDemoPage = function(init) {
        binder.loadView(
        'demo', 
        'demo_viewmodel', 
        'demo_div',
         null,
         init
        );
    };

    self.showCreateCriteriaPage = function(init) {
      binder.loadView(
        "create_criteria",
        "create_criteria_viewmodel",
        "create_criteria_div",
        null,
        init
      );
    };

    self.setFootNote = function(type, msg, timeout) {
      self.msg(msg);
      switch (type) {
        case "error":
          self.footerClass(
            "alert alert-danger col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2"
          );
          break;
        case "success":
          self.footerClass(
            "alert alert-success col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2"
          );
          break;
        case "warning":
          self.footerClass(
            "alert alert-warning col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2"
          );
          break;
        default:
          self.footerClass(
            "alert alert-info col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2"
          );
      }

      $("#index-errorDiv").fadeIn();

      if (timeout)
        setTimeout(function() {
          $("#index-errorDiv").fadeOut();
        }, timeout);
    };

    self.hideMessage = function() {
      $("#index-errorDiv").slideUp("slow");
    };
  }

  return {
    getInstance: function() {
      return new BaseVM();
    }
  };
});
