function syncVehicleId(){
	var id = $("#vehicleId").val();
	$("#odometer.vehicle.id").val(id);
};

$.subscribe('triggerChange', function(event, data) {
	$("#vehicleId").trigger("onchange");
});