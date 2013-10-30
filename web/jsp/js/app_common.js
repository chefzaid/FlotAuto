
//Change active jsp tab css 
function setActiveTab(tabName) {
	$("#" + tabName).addClass('active');
}

//Loading... Modal
$.subscribe('onBeforeLoading', function(event, data) {
	$(document).load().scrollTop(0);
	$("#loading").removeClass('hide');
	$("#indicator").dialog('open');
});

$.subscribe('onCompleteLoading', function(event, data) {
	$("#indicator").dialog('close');
	
});

//Success Toast
$.subscribe('onAfterLoading', function(event, data) {
	$("#success").removeClass('hide');
	$("#success").fadeOut(4000);
});