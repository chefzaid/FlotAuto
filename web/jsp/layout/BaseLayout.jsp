<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
<head>
<meta charset="utf8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<!-- Apple devices fullscreen -->
<meta name="apple-mobile-web-app-capable" content="yes" />
<!-- Apple devices fullscreen -->
<meta names="apple-mobile-web-app-status-bar-style"
	content="black-translucent" />


<!-- Bootstrap -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/bootstrap.min.css">
<!-- Bootstrap responsive -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/bootstrap-responsive.min.css">
<!-- jQuery UI -->
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/jquery-ui/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">
<!-- Theme CSS -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/style.css">
<!-- Color CSS -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/themes.css">
<!-- Tagsinput -->
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/tagsinput/jquery.tagsinput.css">
<!-- Datepicker -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/plugins/datepicker/datepicker.css">	
<!-- dataTables -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/plugins/datatable/TableTools.css">
<!-- chosen -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/plugins/chosen/chosen.css">


<!-- jQuery -->
<script src="/FlotAuto/jsp/js/jquery.min.js"></script>
<!-- jQuery UI -->
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.spinner.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.slider.js"></script>
<!-- Bootstrap -->
<script src="/FlotAuto/jsp/js/bootstrap.min.js"></script>
<!-- Bootbox -->
<script src="/FlotAuto/jsp/js/plugins/bootbox/jquery.bootbox.js"></script>
<!-- Masked inputs -->
<script src="/FlotAuto/jsp/js/plugins/maskedinput/jquery.maskedinput.min.js"></script>
<!-- TagsInput -->
<script src="/FlotAuto/jsp/js/plugins/tagsinput/jquery.tagsinput.min.js"></script>
<!-- Datepicker -->
<script src="/FlotAuto/jsp/js/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- dataTables -->
<script src="/FlotAuto/jsp/js/plugins/datatable/jquery.dataTables.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/datatable/TableTools.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/datatable/ColReorder.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/datatable/ColVis.min.js"></script>
<!-- Chosen -->
<script src="/FlotAuto/jsp/js/plugins/chosen/chosen.jquery.min.js"></script>
<!-- slimScroll -->
<script src="/FlotAuto/jsp/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Theme framework -->
<script src="/FlotAuto/jsp/js/eakroko.min.js"></script>
<!-- Theme scripts -->
<script src="/FlotAuto/jsp/js/application.min.js"></script>
<!-- Favicon -->
<link rel="shortcut icon" href="/FlotAuto/jsp/img/favicon.ico" />
<!-- Apple devices Homescreen icon -->
<link rel="apple-touch-icon-precomposed"
	href="/FlotAuto/jsp/img/apple-touch-icon-precomposed.png" />

<title><tiles:insertAttribute name="title" ignore="true" /></title>
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