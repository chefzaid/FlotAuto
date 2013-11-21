<!doctype html>
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
<!-- Theme CSS -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/style.css">
<!-- Color CSS -->
<link rel="stylesheet" href="/FlotAuto/jsp/css/themes.css">

<!-- jQuery -->
<script src="/FlotAuto/jsp/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="/FlotAuto/jsp/js/bootstrap.min.js"></script>

<!-- Favicon -->
<link rel="shortcut icon" href="/FlotAuto/jsp/img/favicon.ico" />
<!-- Apple devices Homescreen icon -->
<link rel="apple-touch-icon-precomposed"
	href="/FlotAuto/jsp/img/apple-touch-icon-precomposed.png" />

<title>FlotAuto - Erreur !</title>
</head>
<body class='error'>
	<div class="wrapper">
		<div class="code">
			<span>404</span><i class="icon-warning-sign"></i>
		</div>
		<div class="desc center">Page introuvable !</div>
		<jsp:include page="../../includes/search_error.jsp" />
		<div class="buttons">
			<div class="pull-left">
				<a href="/FlotAuto/vehicle/list.action" class="btn"><i
					class="icon-arrow-left"></i> Retour</a>
			</div>
		</div>
	</div>
</body>
</html>
