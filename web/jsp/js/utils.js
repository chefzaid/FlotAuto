function setActiveTab(tabName){
	document.getElementById(tabName).classList.add('active');
}

$.subscribe('onBeforeLoading', function(event, data) {
	$(document).load().scrollTop(0);
	$("#loading").removeClass('hide');
	$("#indicator").dialog('open');
});

$.subscribe('onCompleteLoading', function(event, data) {
	$("#indicator").dialog('close');
});

$.subscribe('onAfterLoading', function(event, data) {
	$("#success").removeClass('hide');
	$("#success").fadeOut(4000);
});
