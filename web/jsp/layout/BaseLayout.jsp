<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
<head> <!-- optimize js/css, delete unused -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<!-- Apple devices fullscreen -->
<meta name="apple-mobile-web-app-capable" content="yes" />
<!-- Apple devices fullscreen -->
<meta name="apple-mobile-web-app-status-bar-style"
	content="black-translucent" />
	
<!-- Bootstrap -->
<link rel="stylesheet" href="jsp/css/bootstrap.min.css">
<!-- Bootstrap responsive -->
<link rel="stylesheet" href="jsp/css/bootstrap-responsive.min.css">
<!-- jQuery UI -->
<link rel="stylesheet"
	href="jsp/css/plugins/jquery-ui/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="jsp/css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">

<!-- Datepicker -->
<link rel="stylesheet" href="jsp/css/plugins/datepicker/datepicker.css">

<!-- PageGuide -->
<link rel="stylesheet" href="jsp/css/plugins/pageguide/pageguide.css">
<!-- Fullcalendar -->
<link rel="stylesheet"
	href="jsp/css/plugins/fullcalendar/fullcalendar.css">
<link rel="stylesheet"
	href="jsp/css/plugins/fullcalendar/fullcalendar.print.css"
	media="print">
<!-- Theme CSS -->
<link rel="stylesheet" href="jsp/css/style.css">
<!-- Color CSS -->
<link rel="stylesheet" href="jsp/css/themes.css">


<!-- jQuery -->
<script src="jsp/js/jquery.min.js"></script>
<!-- jQuery UI -->
<script src="jsp/js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.draggable.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
<!-- Touch enable for jquery UI -->
<script src="jsp/js/plugins/touch-punch/jquery.touch-punch.min.js"></script>
<!-- slimScroll -->
<script src="jsp/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<!-- Bootstrap -->
<script src="jsp/js/bootstrap.min.js"></script>
<!-- vmap -->
<script src="jsp/js/plugins/vmap/jquery.vmap.min.js"></script>
<script src="jsp/js/plugins/vmap/jquery.vmap.world.js"></script>
<script src="jsp/js/plugins/vmap/jquery.vmap.sampledata.js"></script>
<!-- Bootbox -->
<script src="jsp/js/plugins/bootbox/jquery.bootbox.js"></script>
<!-- Flot -->
<script src="jsp/js/plugins/flot/jquery.flot.min.js"></script>
<script src="jsp/js/plugins/flot/jquery.flot.bar.order.min.js"></script>
<script src="jsp/js/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="jsp/js/plugins/flot/jquery.flot.resize.min.js"></script>
<!-- imagesLoaded -->
<script src="jsp/js/plugins/imagesLoaded/jquery.imagesloaded.min.js"></script>
<!-- PageGuide -->
<script src="jsp/js/plugins/pageguide/jquery.pageguide.js"></script>
<!-- FullCalendar -->
<script src="jsp/js/plugins/fullcalendar/fullcalendar.min.js"></script>

<!-- Theme framework -->
<script src="jsp/js/eakroko.min.js"></script>
<!-- Theme scripts -->
<script src="jsp/js/application.min.js"></script>
<!-- Just for demonstration -->
<script src="jsp/js/demonstration.min.js"></script>
<!-- Favicon -->
<link rel="shortcut icon" href="jsp/img/favicon.ico" />
<!-- Apple devices Homescreen icon -->
<link rel="apple-touch-icon-precomposed"
	href="jsp/img/apple-touch-icon-precomposed.png" />

<!-- Datepicker -->	
<script src="jsp/js/plugins/datepicker/bootstrap-datepicker.js"></script>

<title><tiles:insertAttribute name="title" ignore="true" />
</title>
</head>
<body id="home">
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="wrap">
		<div id="content">
			<tiles:insertAttribute name="body" />
		</div>
		<!-- 
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
		 -->
	</div>
</body>
</html>