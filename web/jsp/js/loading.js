$.subscribe('onBeforeLoading', function(event, data) {
	$("#loading").removeClass('hide');
	$("#indicator").dialog('open');
});

$.subscribe('onCompleteLoading', function(event, data) {
	$("#indicator").dialog('close');
	
});
