<script>
	document.getElementById('employee').classList.add('active');
</script>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container-fluid" id="content">
	<div id="left">
		<form action="http://www.eakroko.de/flat/search-results.html"
			method="GET" class='search-form'>
			<div class="search-pane">
				<input type="text" name="search" placeholder="Rechercher...">
				<button type="submit">
					<i class="icon-search"></i>
				</button>
			</div>
		</form>
		<div class="subnav">
			<div class="subnav-title">
				<a href="#" class='toggle-subnav'><i class="icon-angle-down"></i><span>Informations</span>
				</a>
			</div>
			<ul class="subnav-menu">
				<li><a href="#">Général</a>
				</li>
				<li><a href="#">Véhicules</a>
				</li>
				<li><a href="#">Accidents</a>
				</li>
				<li><a href="#">Fichiers</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div class="container-fluid">
			<div class="page-header">
				<div class="pull-left">
					<h1>Employé</h1>
				</div>
				<div class="pull-right">
					<ul class="minitiles">
						<li class='teal'><a href="#"><i class="icon-inbox"></i> </a>
						</li>
						<li class='red'><a href="#"><i class="icon-cogs"></i> </a></li>
						<li class='lime'><a href="#"><i class="icon-globe"></i> </a>
						</li>
					</ul>
					<ul class="stats">
						<li class='blue'><i class="icon-shopping-cart"></i>
							<div class="details">
								<span class="big">175</span> <span>New orders</span>
							</div></li>
						<li class='green'><i class="icon-money"></i>
							<div class="details">
								<span class="big">$324,12</span> <span>Balance</span>
							</div></li>
						<li class='orange'><i class="icon-calendar"></i>
							<div class="details">
								<span class="big">February 22, 2013</span> <span>Wednesday,
									13:56</span>
							</div></li>
					</ul>
				</div>
			</div>
			<div class="breadcrumbs">
				<ul>
					<li><a href="more-login.html">Home</a> <i
						class="icon-angle-right"></i></li>
					<li><a href="index.html">Employé</a></li>
				</ul>
				<div class="close-bread">
					<a href="#"><i class="icon-remove"></i> </a>
				</div>
			</div>
			<!-- 
			<div class="row-fluid">
				<div class="span6">
					<div class="box">
					</div>
				</div>
			</div>
			-->
			<br />
			<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-content nopadding">
							<form action="#" method="POST"
								class='form-horizontal form-column'>
								<div class="span6">
									<div class="control-group">
										<label for="firstName" class="control-label">Prénom :</label>
										<div class="controls">
											<input type="text" name="firstName"
												placeholder="Prénom de l'employé" class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="lastName" class="control-label">Nom :</label>
										<div class="controls">
											<input type="text" name="lastname"
												placeholder="Nom de l'employé" class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="birthDate" class="control-label">Date
											naissance :</label>
										<div class="controls">
											<input type="text" name="birthDate"
												class="input-medium datepick"> <span
												class="help-block">Format : jj/mm/aaaa</span>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="span12">
					<div class="form-actions">
						<button type="submit" class="btn btn-primary">Valider</button>
						<button type="button" class="btn">Annuler</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
