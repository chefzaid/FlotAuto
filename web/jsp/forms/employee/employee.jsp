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
				<li><a href="../employee/general.action">Général</a></li>
				<li><a href="../employee/history.action">Véhicules conduits</a></li>
				<li><a href="#">Accidents commis</a></li>
				<li><a href="#">Fichiers joints</a></li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div class="container-fluid">
			<div class="page-header">
				<div class="pull-left">
					<h1>Employé</h1>
				</div>
			</div>
			<div class="breadcrumbs">
				<ul>
					<li><a href="/FlotAuto">FlotAuto</a> <i
						class="icon-angle-right"></i></li>
					<li><a href="/FlotAuto/employee/employee.action">Employé</a> <i
						class="icon-angle-right"></i></li>
					<li><a href="/FlotAuto/employee/employee.action">Général</a></li>
				</ul>
				<div class="close-bread">
					<a href="#"><i class="icon-remove"></i></a>
				</div>
			</div>
			<div class="row-fluid">
				<s:form method="POST" cssClass='form-horizontal form-column'>
					<div class="span12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="icon-edit"></i> Contact
								</h3>
							</div>
							<div class="box-content nopadding">

								<div class="span6">
									<div class="control-group">
										<label for="employee.firstName" class="control-label">Prénom
											:</label>
										<div class="controls">
											<input type="text" name="employee.firstName"
												id="employee.firstName" placeholder="Prénom"
												class="input-large" value="${currentEmployee.firstName}" />
										</div>
									</div>
									<div class="control-group">
										<label for="employee.lastName" class="control-label">Nom
											:</label>
										<div class="controls">
											<input type="text" name="employee.lastName"
												id="employee.lastName" placeholder="NOM" class="input-large"
												value="${currentEmployee.lastName}" />
										</div>
									</div>
									<div class="control-group">
										<label for="employee.occupation" class="control-label">Occupation
											:</label>
										<div class="controls">
											<s:select name="employee.occupation" id="employee.occupation"
												list="@net.sas.model.enums.Occupation@values()"
												listKey="getStatus()" listValue="getStatus()" headerKey=""
												headerValue="%{''}" cssClass="sinput-large" />
										</div>
									</div>
									<div class="control-group">
										<label for="employee.salary" class="control-label">Salaire
											:</label>
										<div class="controls">
											<div class="input-append">
												<input type="text" name="employee.salary"
													id="employee.salary" placeholder="12 345.67"
													class='input-medium'> <span class="add-on">DH</span>
											</div>
										</div>
									</div>
									<div class="control-group">
										<label for="employee.birthDate" class="control-label">Date
											naissance :</label>
										<div class="controls">
											<input type="text" name="employee.birthDate"
												id="employee.birthDate" class="input-large datepick">
											<span class="help-block">Format : jj/mm/aaaa</span>
										</div>
									</div>
									<div class="control-group">
										<label for="employee.hireDate" class="control-label">Date
											embauche :</label>
										<div class="controls">
											<input type="text" name="employee.hireDate"
												id="employee.hireDate" class="input-large datepick">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.phone" class="control-label">Téléphone
											:</label>
										<div class="controls">
											<input type="text" name="employee.phone" id="employee.phone"
												class="input-large mask_phone"> <span
												class="help-block">Format : (123) 456-7890</span>
										</div>
									</div>
									<div class="control-group">
										<label for="employee.email" class="control-label">Email
											:</label>
										<div class="controls">
											<input type="text" name="employee.email" id="employee.email"
												placeholder="nom@domaine.com" class="input-large">
										</div>
									</div>
								</div>
								<div class="span6">
									<div class="control-group">
										<label for="employee.picture" class="control-label">Photo
											:</label>
										<div class="controls">
											<div class="fileupload fileupload-new"
												data-provides="fileupload">
												<div class="fileupload-new thumbnail"
													style="width: 200px; height: 150px;">
													<img src="/FlotAuto/jsp/img/no_image.gif" />
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
										<label for="employee.number" class="control-label">Matricule
											:</label>
										<div class="controls">
											<input type="text" name="employee.number"
												id="employee.number" placeholder="Numéro de l'employé"
												class="input-large">
										</div>
									</div>
									<div class="control-group">
										<label for="employee.cin" class="control-label">CIN :</label>
										<div class="controls">
											<input type="text" name="employee.cin" id="employee.cin"
												placeholder="XX 123 456" class="input-large">
										</div>
									</div>
									<div class="control-group">
										<label for="address.address" class="control-label">Adresse
											:</label>
										<div class="controls">
											<input type="text" name="address.address"
												id="address.address" placeholder="Adresse du domicile"
												class="input-large">
										</div>
									</div>
									<div class="control-group">
										<label for="address.zip" class="control-label">Code
											postal :</label>
										<div class="controls">
											<input type="text" name="address.zip" id="address.zip"
												placeholder="Code postal" class="input-large">
										</div>
									</div>
									<div class="control-group">
										<label for="address.city" class="control-label">Ville
											:</label>
										<div class="controls">
											<input type="text" name="address.city" id="address.city"
												placeholder="Ville" class="input-large">
										</div>
									</div>
									<div class="control-group">
										<label for="address.country" class="control-label">Pays
											:</label>
										<div class="controls">
											<input type="text" name="address.country"
												id="address.country" placeholder="Pays" class="input-large">
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="icon-edit"></i> Permis de conduire
								</h3>
							</div>
							<div class="box-content nopadding">
								<div class="span6">
									<div class="control-group">
										<label for="drivingLicense.number" class="control-label">Numéro
											:</label>
										<div class="controls">
											<input type="text" name="drivingLicense.number"
												id="drivingLicense.number" placeholder="Numéro du permis"
												class="input-large">
										</div>
									</div>
									<div class="control-group">
										<label for="drivingLicense.type" class="control-label">Type
											:</label>
										<div class="controls">
											<input type="text" name="drivingLicense.type"
												id="drivingLicense.type" placeholder="Type du permis"
												class="input-large">
										</div>
									</div>
								</div>
								<div class="span6">
									<div class="control-group">
										<label for="drivingLicense.obtainDate" class="control-label">Date
											obtention :</label>
										<div class="controls">
											<input type="text" name="drivingLicense.obtainDate"
												id="drivingLicense.obtainDate" class="input-large datepick">
										</div>
									</div>
									<div class="control-group">
										<label for="drivingLicense.expireDate" class="control-label">Date
											expiration :</label>
										<div class="controls">
											<input type="text" name="drivingLicense.expireDate"
												id="drivingLicense.expireDate" class="input-large datepick">
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="icon-edit"></i> Examen médical
								</h3>
							</div>
							<div class="box-content nopadding">
								<div class="span6">
									<div class="control-group">
										<label for="healthCheck.visitDate" class="control-label">Date
											visite :</label>
										<div class="controls">
											<input type="text" name="healthCheck.visitDate"
												id="healthCheck.visitDate" class="input-large datepick">
										</div>
									</div>
								</div>
								<div class="span6">
									<div class="control-group">
										<label for="healthCheck.expireDate" class="control-label">Date
											expiration :</label>
										<div class="controls">
											<input type="text" name="healthCheck.expireDate"
												id="healthCheck.expireDate" class="input-large datepick">
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="icon-edit"></i> Complémentaire
								</h3>
							</div>
							<div class="box-content nopadding">
								<div class="span6">
									<div class="control-group">
										<label for="employee.trainings" class="control-label">Formations
											:</label>
										<div class="controls">
											<input type="text" name="employee.trainings" id="textfield"
												class="tagsinput" />
										</div>
									</div>
								</div>
								<div class="span6">
									<div class="control-group">
										<label for="employee.notes" class="control-label">Notes
											:</label>
										<div class="controls">
											<textarea name="employee.notes" placeholder="..."
												id="employee.notes" class="input-large"></textarea>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="form-actions">
						<div class="center">
							<s:submit value="<<" cssClass=" btn btn-primary" />
							<s:submit value="<" cssClass=" btn btn-primary" />
							<s:reset value="Nouveau" cssClass="btn" />
							<s:submit value="Enregistrer" cssClass="btn btn-success" />
							<s:submit value="Supprimer" cssClass="btn btn-danger" />
							<s:submit value=">" cssClass="btn btn-primary" />
							<s:submit value=">>" cssClass="btn btn-primary" />
						</div>
					</div>
				</s:form>
			</div>
			<div class="row-fluid">
				<div class="span12">
					<div class="box box-color box-bordered">
						<div class="box-title">
							<h3>
								<i class="icon-table"></i> Employés
							</h3>
						</div>
						<div class="box-content nopadding">
							<table
								class="table table-nomargin table-striped dataTable dataTable-colvis">
								<thead>
									<tr>
										<th>Matricule</th>
										<th>Prénom</th>
										<th>Nom</th>
										<th>Occupation</th>
										<th class='hidden-350'>Date emabauche</th>
										<th class='hidden-1024'>Phone</th>
										<th class='hidden-480'>Email</th>
										<th class='hidden-480'>Options</th>
									</tr>
								</thead>
								<tbody>
									<s:iterator value="employees">
										<tr>
											<td><s:property value="number" /></td>
											<td><s:property value="firstName" /></td>
											<td><s:property value="lastName" /></td>
											<td><s:property value="occupation.status" /></td>
											<td class='hidden-1024'><s:property value="hireDate" /></td>
											<td class='hidden-350'><s:property value="phone" /></td>
											<td class='hidden-480'><s:property value="email" /></td>
											<td class='hidden-480'><a
												href="view.action?id=<s:property value='id'/>" class="btn"
												rel="tooltip" title="Afficher"><i class="icon-search"></i></a>
												<a href="#" class="btn" rel="tooltip" title="Modifier"><i
													class="icon-edit"></i></a> <a href="#" class="btn"
												rel="tooltip" title="Supprimer"><i class="icon-remove"></i></a>
											</td>
										</tr>
									</s:iterator>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
