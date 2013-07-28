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
					<li><a href="more-login.html">FlotAuto</a> <i
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
							<s:form method="POST" cssClass='form-horizontal form-column'>
								<div class="span6">
									<div class="control-group">
										<label for="employee.firstName" class="control-label">Prénom
											:</label>
										<div class="controls">
											<input type="text" name="employee.firstName"
												id="employee.firstName" placeholder="Prénom"
												class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.lastName" class="control-label">Nom
											:</label>
										<div class="controls">
											<input type="text" name="employee.lastname"
												id="employee.lastname" placeholder="NOM"
												class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.birthDate" class="control-label">Date
											naissance :</label>
										<div class="controls">
											<input type="text" name="employee.birthDate"
												id="employee.birthDate" class="input-xlarge datepick">
											<span class="help-block">Format : jj/mm/aaaa</span>
										</div>
									</div>
									<div class="control-group">
										<label for="address.address" class="control-label">Adresse
											:</label>
										<div class="controls">
											<input type="text" name="address.address"
												id="address.address" placeholder="Adresse du domicile"
												class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="address.zip" class="control-label">Code
											postal :</label>
										<div class="controls">
											<input type="text" name="address.zip" id="address.zip"
												placeholder="Code postal" class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="address.city" class="control-label">Ville
											:</label>
										<div class="controls">
											<input type="text" name="address.city" id="address.city"
												placeholder="Ville" class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="address.country" class="control-label">Pays
											:</label>
										<div class="controls">
											<input type="text" name="address.country"
												id="address.country" placeholder="Pays" class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.phone" class="control-label">Téléphone
											:</label>
										<div class="controls">
											<input type="text" name="employee.phone" id="employee.phone"
												class="input-xlarge mask_phone"> <span
												class="help-block">Format : (123) 456-7890</span>
										</div>
									</div>
									<div class="control-group">
										<label for="employee.email" class="control-label">Email
											:</label>
										<div class="controls">
											<input type="text" name="employee.email" id="employee.email"
												placeholder="nom@domaine.com" class="input-xlarge">
										</div>
									</div>
								</div>
								<div class="span6">
									<div class="control-group">
										<label for="employee.cin" class="control-label">CIN :</label>
										<div class="controls">
											<input type="text" name="employee.cin" id="employee.cin"
												placeholder="XX 123 456" class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.number" class="control-label">Matricule
											:</label>
										<div class="controls">
											<input type="text" name="employee.number"
												id="employee.number" placeholder="Numéro de l'employé"
												class="input-xlarge">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.occupation" class="control-label">Occupation
											:</label>
										<div class="controls">
											<s:select name="employee.occupation" id="employee.occupation"
												label="%{getText('Enum.label')}"
												list="@net.sas.model.enums.Occupation@values()"
												listKey="getStatus()" listValue="getStatus()" headerKey=""
												headerValue="%{'Fonction...'}" cssClass="input-xlarge" />
										</div>
									</div>
									<div class="control-group">
										<label for="employee.hireDate" class="control-label">Date
											embauche :</label>
										<div class="controls">
											<input type="text" name="employee.hireDate"
												id="employee.hireDate" class="input-xlarge datepick">
											<span class="help-block">Format : jj/mm/aaaa</span>
										</div>
									</div>
									<div class="control-group">
										<label for="employee.picture" class="control-label">Photo
											:</label>
										<div class="controls">
											<div class="fileupload fileupload-new"
												data-provides="fileupload">
												<div class="fileupload-new thumbnail"
													style="width: 200px; height: 150px;">
													<img src="jsp/img/no_image.gif" />
												</div>
												<div class="fileupload-preview fileupload-exists thumbnail"
													style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
												<div>
													<span class="btn btn-file"><span
														class="fileupload-new">Choisir photo</span><span
														class="fileupload-exists">Changer</span> <input
														type="file" name="employee.picture" id="employee.picture" />
													</span> <a href="#" class="btn fileupload-exists"
														data-dismiss="fileupload">Retirer</a>
												</div>
											</div>
										</div>
									</div>
									<div class="control-group">
										<label for="employee.certificates" class="control-label">Certificats
											:</label>
										<div class="controls">
											<input type="text" name="employee.certificates"
												id="textfield" class="tagsinput" />
										</div>
									</div>
								</div>
							</s:form>
						</div>
					</div>
				</div>
				<div class="form-actions">
					<center>
						<s:submit value="<<" cssClass=" btn btn-primary" />
						<s:submit value="<" cssClass=" btn btn-primary" />
						<s:reset value="Nouveau" cssClass="btn" />
						<s:submit value="Enregistrer" cssClass="btn btn-success" />
						<s:submit value="Supprimer" cssClass="btn btn-danger" />
						<s:submit value=">" cssClass="btn btn-primary" />
						<s:submit value=">>" cssClass="btn btn-primary" />
					</center>
				</div>
			</div>
		</div>
	</div>
</div>
