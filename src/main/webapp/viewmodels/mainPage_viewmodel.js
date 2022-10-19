define(["binder"], function(_binder) {

	function mainPageVM() {
		{
		var self = this;
		

		self.DBList = ko.observableArray([]);

		var request = new Object();
		self.onLoad = function() {
			
	

	};

}
}
  return {
	getInstance: function() {
		return new mainPageVM();
	}
};
	});
	
	
	