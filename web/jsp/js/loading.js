$.subscribe('onBeforeLoading', function(event, data) {
	$("#indicator").dialog('open');
});

$.subscribe('onCompleteLoading', function(event, data) {
	$("#indicator").dialog('close');
});