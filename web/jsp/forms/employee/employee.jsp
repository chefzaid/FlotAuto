<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
	setActiveTab('employee');
</script>

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
			<li><a href="../employee/list.action">Général</a></li>
			<li><a href="../employee/history.action">Véhicules conduits</a></li>
			<li><a href="../employee/accidents.action">Accidents commis</a></li>
			<li><a href="../employee/files.action">Fichiers joints</a></li>
		</ul>
	</div>
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<s:form id="employeeForm" method="POST" enctype="multipart/form-data"
				cssClass='form-horizontal form-column' action="save.action">
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
									<label for="firstName" class="control-label">Prénom :</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentEmployee.id}" /> <input type="text"
											name="firstName" id="firstName" placeholder="Prénom"
											class="input-large" value="${currentEmployee.firstName}" />
									</div>
								</div>
								<div class="control-group">
									<label for="lastName" class="control-label">Nom :</label>
									<div class="controls">
										<input type="text" name="lastName" id="lastName"
											placeholder="NOM" class="input-large"
											value="${currentEmployee.lastName}" />
									</div>
								</div>
								<div class="control-group">
									<label for="occupation" class="control-label">Occupation
										:</label>
									<div class="controls">
										<div class="input-large">
											<s:select name="occupation" id="occupation"
												list="@net.sas.model.bo.Occupation@values()"
												listValue="getStatus()" headerKey="-1" headerValue="%{''}"
												cssClass="chosen-select"
												value="#{currentEmployee.occupation}" />
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="salary" class="control-label">Salaire :</label>
									<div class="controls">
										<div class="input-append">
											<input type="text" name="salary" id="salary"
												placeholder="12 345.67" class='input-medium'
												value="${currentEmployee.salary}" /> <span class="add-on">DH</span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="birthDate" class="control-label">Date
										naissance :</label>
									<div class="controls">
										<input type="text" name="birthDate" id="birthDate"
											class="input-large datepick"
											value="<s:date name="currentEmployee.birthDate"
												format="dd/MM/yyyy" />" />
										<span class="help-block">Format : jj/mm/aaaa</span>
									</div>
								</div>
								<div class="control-group">
									<label for="hireDate" class="control-label">Date
										embauche :</label>
									<div class="controls">
										<input type="text" name="hireDate" id="hireDate"
											class="input-large datepick"
											value="<s:date name="currentEmployee.hireDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="phone" class="control-label">Téléphone :</label>
									<div class="controls">
										<input type="text" name="phone" id="phone"
											class="input-large mask_phone"
											value="${currentEmployee.phone}" /> <span class="help-block">Format
											: (123) 456-7890</span>
									</div>
								</div>
								<div class="control-group">
									<label for="email" class="control-label">Email :</label>
									<div class="controls">
										<input type="text" name="email" id="email"
											placeholder="nom@domaine.com" class="input-large"
											value="${currentEmployee.email}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="image" class="control-label">Photo :</label>
									<div class="controls">
										<div class="fileupload fileupload-new"
											data-provides="fileupload">
											<div class="fileupload-new thumbnail"
												style="width: 200px; height: 150px;">
												<s:if test="#{currentEmployee.picture != null}">
													<img
														src="/FlotAuto/ImageAction?entity=employee&id=${currentEmployee.id}" />
												</s:if>
												<s:else>
													<img src="/FlotAuto/jsp/img/no_image.gif" />
												</s:else>
											</div>

											<div class="fileupload-preview fileupload-exists thumbnail"
												style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
											<div>
												<span class="btn btn-file"><span
													class="fileupload-new">Choisir photo</span><span
													class="fileupload-exists">Changer</span> <input type="file"
													name="image" id="image" /> </span> <a href="#"
													class="btn fileupload-exists" data-dismiss="fileupload">Retirer</a>
											</div>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="number" class="control-label">Matricule :</label>
									<div class="controls">
										<input type="text" name="number" id="number"
											placeholder="Numéro de l'employé" class="input-large"
											value="${currentEmployee.number}" />
									</div>
								</div>
								<div class="control-group">
									<label for="cin" class="control-label">CIN :</label>
									<div class="controls">
										<input type="text" name="cin" id="cin"
											placeholder="XX 123 456" class="input-large"
											value="${currentEmployee.cin}" />
									</div>
								</div>
								<div class="control-group">
									<label for="address.address" class="control-label">Adresse
										:</label>
									<div class="controls">
										<input type="hidden" name="address.id" id="address.id"
											value="${currentEmployee.address.id}" /> <input type="text"
											name="address.address" id="address.address"
											placeholder="Adresse du domicile" class="input-large"
											value="${currentEmployee.address.address}" />
									</div>
								</div>
								<div class="control-group">
									<label for="address.zip" class="control-label">Code
										postal :</label>
									<div class="controls">
										<input type="text" name="address.zip" id="address.zip"
											placeholder="Code postal" class="input-large"
											value="${currentEmployee.address.zip}" />
									</div>
								</div>
								<div class="control-group">
									<label for="address.city" class="control-label">Ville :</label>
									<div class="controls">
										<input type="text" name="address.city" id="address.city"
											placeholder="Ville" class="input-large"
											value="${currentEmployee.address.city}" />
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
						<s:if test="%{currentEmployee.drivingLicense == null}">
							<h6 class="center">Employé sans permis ! Veuillez en saisir
								un, s'il l'a.</h6>
						</s:if>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="drivingLicense.number" class="control-label">Numéro
										:</label>
									<div class="controls">
										<input type="hidden" name="drivingLicense.id"
											id="drivingLicense.id"
											value="${currentEmployee.drivingLicense.id}" /> <input
											type="text" name="drivingLicense.number"
											id="drivingLicense.number" placeholder="Numéro du permis"
											class="input-large"
											value="${currentEmployee.drivingLicense.number}" />
									</div>
								</div>
								<div class="control-group">
									<label for="drivingLicense.type" class="control-label">Type
										:</label>
									<div class="controls">
										<input type="text" name="drivingLicense.type"
											id="drivingLicense.type" placeholder="Type du permis"
											class="input-large"
											value="${currentEmployee.drivingLicense.type}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="drivingLicense.obtainDate" class="control-label">Date
										obtention :</label>
									<div class="controls">
										<input type="text" name="drivingLicense.obtainDate"
											id="drivingLicense.obtainDate" class="input-large datepick"
											value="<s:date name="currentEmployee.drivingLicense.obtainDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="drivingLicense.expireDate" class="control-label">Date
										expiration :</label>
									<div class="controls">
										<input type="text" name="drivingLicense.expireDate"
											id="drivingLicense.expireDate" class="input-large datepick"
											value="<s:date name="currentEmployee.drivingLicense.expireDate"
												format="dd/MM/yyyy" />" />
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
										<input type="hidden" name="healthCheck.id" id="healthCheck.id"
											value="${currentEmployee.healthCheck.id}" /> <input
											type="text" name="healthCheck.visitDate"
											id="healthCheck.visitDate" class="input-large datepick"
											value="<s:date name="currentEmployee.healthCheck.visitDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="notes" class="control-label">Observations :</label>
									<div class="controls">
										<textarea name="healthCheck.observations"
											placeholder="Rapport santé..." id="notes" class="input-large">${currentEmployee.healthCheck.observations}</textarea>
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="healthCheck.expireDate" class="control-label">Date
										expiration :</label>
									<div class="controls">
										<input type="text" name="healthCheck.expireDate"
											id="healthCheck.expireDate" class="input-large datepick"
											value="<s:date name="currentEmployee.healthCheck.expireDate"
												format="dd/MM/yyyy" />" />
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
									<label for="trainings" class="control-label">Formations
										:</label>
									<div class="controls">
										<input type="text" name="trainings" id="textfield"
											class="tagsinput" value="${currentEmployee.trainings}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="notes" class="control-label">Notes :</label>
									<div class="controls">
										<textarea name="notes" placeholder="..." id="notes"
											class="input-large">${currentEmployee.notes}</textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="form-actions center">
					<s:url id="first" value="first.action" />
					<sj:a href="%{first}" targets="home" cssClass="btn btn-primary"
						onBeforeTopics="onBeforeLoading"
						onCompleteTopics="onCompleteLoading">&lt;&lt;</sj:a>
					<s:url id="previous" value="previous.action" />
					<sj:a href="%{previous}" targets="home" cssClass="btn btn-primary"
						onBeforeTopics="onBeforeLoading"
						onCompleteTopics="onCompleteLoading">&lt;</sj:a>

					<s:url id="clear" value="clear.action" />
					<sj:a href="%{clear}" targets="home" cssClass="btn"
						onBeforeTopics="onBeforeLoading"
						onCompleteTopics="onCompleteLoading">Nouveau</sj:a>

					<sj:submit value="Enregistrer" targets="home"
						cssClass="btn btn-success" onBeforeTopics="onBeforeLoading"
						onCompleteTopics="onCompleteLoading"
						onSuccessTopics="onAfterLoading" />

					<s:url id="delete" value="delete.action" />
					<sj:a cssClass="hide" targets="home" href="%{delete}"
						listenTopics="confirmDelete" onSuccessTopics="onAfterLoading" />
					<a href="#confirm" class="btn btn-danger" data-toggle="modal">Supprimer</a>

					<s:url id="next" value="next.action" />
					<sj:a href="%{next}" targets="home" cssClass="btn btn-primary"
						onBeforeTopics="onBeforeLoading"
						onCompleteTopics="onCompleteLoading">&gt;</sj:a>
					<s:url id="last" value="last.action" />
					<sj:a href="%{last}" targets="home" cssClass="btn btn-primary"
						onBeforeTopics="onBeforeLoading"
						onCompleteTopics="onCompleteLoading">&gt;&gt;</sj:a>
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
									<th>Date emabauche</th>
									<th>Phone</th>
									<th>Email</th>
									<th>-</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="employees" status="employee">
									<tr>
										<td><s:property value="number" /></td>
										<td><s:property value="firstName" /></td>
										<td><s:property value="lastName" /></td>
										<td><s:property value="occupation.status" /></td>
										<td><s:date name="hireDate" format="dd/MM/yyyy" /></td>
										<td><s:property value="phone" /></td>
										<td><s:property value="email" /></td>
										<td><s:url id="view" value="view.action">
												<s:param name="index">
													<s:property value="#employee.index" />
												</s:param>
											</s:url> <sj:a href="%{view}" targets="home" cssClass="btn"
												rel="tooltip" title="Afficher"
												onBeforeTopics="onBeforeLoading"
												onCompleteTopics="onCompleteLoading">
												<i class="icon-search"></i>
											</sj:a></td>
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
