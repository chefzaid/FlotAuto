<!doctype html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<meta charset="utf8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<!-- Apple devices fullscreen -->
<meta name="apple-mobile-web-app-capable" content="yes" />
<!-- Apple devices fullscreen -->
<meta name="apple-mobile-web-app-status-bar-style"
	content="black-translucent" />

<!-- Bootstrap -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/bootstrap.min.css">
<!-- Bootstrap responsive -->
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/bootstrap-responsive.min.css">
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
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/datepicker/datepicker.css">
<!-- dataTables -->
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/datatable/TableTools.css">
<!-- chosen -->
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/chosen/chosen.css">
<!-- Notify -->
<link rel="stylesheet"
	href="/FlotAuto/jsp/css/plugins/gritter/jquery.gritter.css">
<!-- select2 -->
<!-- <link rel="stylesheet" href="/FlotAuto/jsp/css/plugins/select2/select2.css"> -->
<!-- icheck -->
<!-- <link rel="stylesheet" href="/FlotAuto/jsp/css/plugins/icheck/all.css"> -->


<!-- jQuery / Struts2-jquery-plugin-->
<sj:head jqueryui="true" />
<!-- jQuery UI -->
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
<script
	src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.spinner.js"></script>
<script src="/FlotAuto/jsp/js/plugins/jquery-ui/jquery.ui.slider.js"></script>
<!-- Bootstrap -->
<script src="/FlotAuto/jsp/js/bootstrap.min.js"></script>
<!-- Bootbox -->
<script src="/FlotAuto/jsp/js/plugins/bootbox/jquery.bootbox.js"></script>
<!-- Masked inputs -->
<script
	src="/FlotAuto/jsp/js/plugins/maskedinput/jquery.maskedinput.min.js"></script>
<!-- TagsInput -->
<script src="/FlotAuto/jsp/js/plugins/tagsinput/jquery.tagsinput.min.js"></script>
<!-- Datepicker -->
<script
	src="/FlotAuto/jsp/js/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- dataTables -->
<script
	src="/FlotAuto/jsp/js/plugins/datatable/jquery.dataTables.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/datatable/TableTools.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/datatable/ColReorder.min.js"></script>
<script src="/FlotAuto/jsp/js/plugins/datatable/ColVis.min.js"></script>
<!-- Chosen -->
<script src="/FlotAuto/jsp/js/plugins/chosen/chosen.jquery.min.js"></script>
<!-- slimScroll -->
<script
	src="/FlotAuto/jsp/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<!-- Custom file upload -->
<script
	src="/FlotAuto/jsp/js/plugins/fileupload/bootstrap-fileupload.min.js"></script>
<!-- Notify -->
<script src="/FlotAuto/jsp/js/plugins/gritter/jquery.gritter.min.js"></script>
<!-- select2 -->
<!-- <script src="/FlotAuto/jsp/js/plugins/select2/select2.min.js"></script> -->
<!-- icheck -->
<!-- <script src="/FlotAuto/jsp/js/plugins/icheck/jquery.icheck.min.js"></script> -->

<script src="/FlotAuto/jsp/js/app_common.js"></script>

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
	<div id="confirm" class="modal hide fade" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h3 id="myModalLabel">Confirmation...</h3>
		</div>
		<div class="modal-body">
			<p>Voulez-vous vraiment supprimer cette entrée ?</p>
		</div>
		<div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">Non</button>
			<button onClick="$.publish('confirmDelete');" class="btn btn-primary"
				data-dismiss="modal">Oui</button>
		</div>
	</div>
	<sj:dialog id="indicator" autoOpen="false" modal="true"
		resizable="false">
		<div id="loading" class="center hide">
			<p>Opération en cours...</p>
			<img src="/FlotAuto/jsp/img/loading.gif" />
		</div>
	</sj:dialog>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div class="container-fluid" id="content">
		<tiles:insertAttribute name="body" />
	</div>
	<!-- 	<div id="footer"> -->
	<%-- 		<tiles:insertAttribute name="footer" /> --%>
	<!-- 	</div> -->
</body>
</html>