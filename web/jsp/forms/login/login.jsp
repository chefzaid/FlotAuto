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
<script src="/FlotAuto/jsp/js/eakroko.js"></script>

<!-- Favicon -->
<link rel="shortcut icon" href="img/favicon.ico" />
<!-- Apple devices Homescreen icon -->
<link rel="apple-touch-icon-precomposed"
	href="/FlotAuto/jsp/img/apple-touch-icon-precomposed.png" />

</head>

<body class='login'>
	<div class="wrapper">
		<h1>
			<a href="index.html"><img src="/FlotAuto/jsp/img/logo-big.png"
				alt="" class='retina-ready' width="59" height="49">FlotAuto</a>
		</h1>
		<div class="login-body">
			<h2>Authentification...</h2>
			<form action="login.action" method='post'>
				<div class="email">
					<input type="text" name='username' placeholder="Nom d'utilisateur"
						class='input-block-level'>
				</div>
				<div class="pw">
					<input type="password" name="password" placeholder="Mot de passe"
						class='input-block-level'>
				</div>
				<div class="submit">
					<input type="submit" value="Connexion" class='btn btn-primary'>
				</div>
			</form>
			<div class="forget">
				<a href="#"><span>Mot de passe perdu ?</span></a>
			</div>
		</div>
	</div>
</body>
</html>
