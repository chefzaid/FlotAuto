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
<link rel="stylesheet" href="jsp/css/bootstrap.min.css">
<!-- Bootstrap responsive -->
<link rel="stylesheet" href="jsp/css/bootstrap-responsive.min.css">
<!-- jQuery UI -->
<link rel="stylesheet"
	href="jsp/css/plugins/jquery-ui/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="jsp/css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">
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
<!-- Tagsinput -->
<link rel="stylesheet"
	href="jsp/css/plugins/tagsinput/jquery.tagsinput.css">
<!-- chosen -->
<link rel="stylesheet" href="jsp/css/plugins/chosen/chosen.css">
<!-- multi select -->
<link rel="stylesheet"
	href="jsp/css/plugins/multiselect/multi-select.css">
<!-- timepicker -->
<link rel="stylesheet"
	href="jsp/css/plugins/timepicker/bootstrap-timepicker.min.css">
<!-- colorpicker -->
<link rel="stylesheet"
	href="jsp/css/plugins/colorpicker/colorpicker.css">
<!-- Datepicker -->
<link rel="stylesheet" href="jsp/css/plugins/datepicker/datepicker.css">
<!-- Plupload -->
<link rel="stylesheet"
	href="jsp/css/plugins/plupload/jquery.plupload.queue.css">


<!-- jQuery -->
<script src="jsp/js/jquery.min.js"></script>
<!-- jQuery UI -->
<script src="jsp/js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.spinner.js"></script>
<script src="jsp/js/plugins/jquery-ui/jquery.ui.slider.js"></script>
<!-- Bootstrap -->
<script src="jsp/js/bootstrap.min.js"></script>
<!-- Bootbox -->
<script src="jsp/js/plugins/bootbox/jquery.bootbox.js"></script>
<!-- Masked inputs -->
<script src="jsp/js/plugins/maskedinput/jquery.maskedinput.min.js"></script>
<!-- TagsInput -->
<script src="jsp/js/plugins/tagsinput/jquery.tagsinput.min.js"></script>
<!-- Datepicker -->
<script src="jsp/js/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Timepicker -->
<script src="jsp/js/plugins/timepicker/bootstrap-timepicker.min.js"></script>
<!-- Colorpicker -->
<script src="jsp/js/plugins/colorpicker/bootstrap-colorpicker.js"></script>
<!-- Chosen -->
<script src="jsp/js/plugins/chosen/chosen.jquery.min.js"></script>
<!-- MultiSelect -->
<script src="jsp/js/plugins/multiselect/jquery.multi-select.js"></script>
<!-- CKEditor -->
<script src="jsp/js/plugins/ckeditor/ckeditor.js"></script>
<!-- PLUpload -->
<script src="jsp/js/plugins/plupload/plupload.full.js"></script>
<script src="jsp/js/plugins/plupload/jquery.plupload.queue.js"></script>
<!-- Custom file upload -->
<script src="jsp/js/plugins/fileupload/bootstrap-fileupload.min.js"></script>

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