<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="d" uri="http://displaytag.sf.net/el"%>
<script type="text/javascript">
	setActiveTab('vehicle');
</script>

<div id="left">
	<jsp:include page="../../includes/search.jsp" />
	<jsp:include page="../../includes/menu_vehicle.jsp" />
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="../../includes/success.jsp" />
			<s:form id="vehicleForm" method="POST" enctype="multipart/form-data"
				cssClass='form-horizontal form-column' action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Véhicule
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="brand" class="control-label">Marque :</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentVehicle.id}" /> <input type="text"
											name="brand" id="brand" placeholder="Marque du véhicule"
											class="input-large" value="${currentVehicle.brand}" />
									</div>
								</div>
								<div class="control-group">
									<label for="model" class="control-label">Modèle :</label>
									<div class="controls">
										<input type="text" name="model" id="model"
											placeholder="Modèle de la marque" class="input-large"
											value="${currentVehicle.model}" />
									</div>
								</div>
								<div class="control-group">
									<label for="year" class="control-label">Année :</label>
									<div class="controls">
										<input type="text" name="year" id="year"
											placeholder="Année du modèle" class="input-large"
											value="${currentVehicle.year}" />
									</div>
								</div>
								<div class="control-group">
									<label for="type" class="control-label">Type :</label>
									<div class="controls input-large">
										<s:select name="type" id="type"
											list="@net.sas.model.bo.VehicleType@values()"
											listValue="getStatus()" headerKey="-1" headerValue="%{''}"
											cssClass="chosen-select" value="#{currentVehicle.type}" />
									</div>
								</div>
								<div class="control-group">
									<label for="color" class="control-label">Couleur :</label>
									<div class="controls input-large">
										<s:select name="color" id="color"
											list="@net.sas.model.bo.Color@values()"
											listValue="getStatus()" headerKey="-1" headerValue="%{''}"
											cssClass="chosen-select" value="#{currentVehicle.color}" />
									</div>
								</div>
								<div class="control-group">
									<label for="supplierString" class="control-label">Fournisseur
										:</label>
									<div class="controls input-large">
										<s:select name="supplierString" id="supplierString"
											list="suppliers" listValue="companyName" listKey="id"
											headerKey="-1" headerValue="%{''}" cssClass="chosen-select"
											value="#{currentVehicle.supplier.id}" />
									</div>
								</div>
								<div class="control-group">
									<label for="specs" class="control-label">Caractéristiques
										:</label>
									<div class="controls">
										<textarea name="specs" id="specs"
											placeholder="Spécifications techniques du véhicule"
											class="input-large">${currentVehicle.specs}</textarea>
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
												<s:if test="#{currentVehicle.picture != null}">
													<img
														src="/FlotAuto/ImageAction?entity=vehicle&id=${currentVehicle.id}" />
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
									<label for="registrationNumber" class="control-label">Matricule
										:</label>
									<div class="controls">
										<input type="text" name="registrationNumber"
											id="registrationNumber" placeholder="Immatriculation"
											class="input-large"
											value="${currentVehicle.registrationNumber}" />
									</div>
								</div>
								<div class="control-group">
									<label for="chassisNumber" class="control-label">N°
										Chassis :</label>
									<div class="controls">
										<input type="text" name="chassisNumber" id="chassisNumber"
											placeholder="Numéro de chassis" class="input-large"
											value="${currentVehicle.chassisNumber}" />
									</div>
								</div>
								<div class="control-group">
									<label for="notes" class="control-label">Notes :</label>
									<div class="controls">
										<textarea name="notes" id="notes" placeholder="..."
											class="input-large">${currentVehicle.notes}</textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Garantie
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="warranty.beginDate" class="control-label">Date
										début :</label>
									<div class="controls">
										<input type="hidden" name="warranty.id" id="warranty.id"
											value="${currentVehicle.warranty.id}" /> <input type="text"
											name="warranty.beginDate" id="warranty.beginDate"
											class="input-large datepick"
											value="<s:date name="currentVehicle.warranty.beginDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="warranty.validity.frequence" class="control-label">Validité
										:</label>
									<div class="controls">
										<div class="span4">
											<input type="hidden" name="warranty.validity.id"
												id="warranty.validity.id"
												value="${currentVehicle.warranty.validity.id}" /> <input
												type="text" name="warranty.validity.frequence"
												id="warranty.validity.frequence" placeholder="Valeur"
												class="span12"
												value="${currentVehicle.warranty.validity.frequence}" />
										</div>
										<div class="span4">
											<s:select name="warranty.validity.unit"
												id="warranty.validity.unit"
												list="@net.sas.model.bo.MeasureUnit@values()"
												listValue="getStatus()" headerKey="-1"
												headerValue="%{'Unité'}" cssClass="chosen-select"
												value="#{currentVehicle.warranty.validity.unit}" />
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Vignette
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="tax.fees" class="control-label">Coût :</label>
									<div class="controls">
										<input type="hidden" name="tax.id" id="tax.id"
											value="${currentVehicle.tax.id}" /> <input type="text"
											name="tax.fees" id="tax.fees" placeholder="Coût de la taxe"
											class="input-large" value="${currentVehicle.tax.fees}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="tax.paymentDate" class="control-label">Date
										paiement :</label>
									<div class="controls">
										<input type="text" name="tax.paymentDate" id="tax.paymentDate"
											class="input-large datepick"
											value="<s:date name="currentVehicle.tax.paymentDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Assurance
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="insurance.insurer" class="control-label">Assureur
										:</label>
									<div class="controls">
										<input type="hidden" name="insurance.id" id="insurance.id"
											value="${currentVehicle.insurance.id}" /> <input type="text"
											name="insurance.insurer" id="insurance.insurer"
											placeholder="Raison sociale de l'assureur"
											class="input-large"
											value="${currentVehicle.insurance.insurer}" />
									</div>
								</div>
								<div class="control-group">
									<label for="insurance.policyNumber" class="control-label">Clé
										:</label>
									<div class="controls">
										<input type="hidden" name="insurance.policyNumber"
											id="insurance.policyNumber" value="${currentVehicle.id}" />
										<input type="text" name="insurance.key"
											id="insurance.policyNumber"
											placeholder="N° de police d'assurance" class="input-large"
											value="${currentVehicle.insurance.policyNumber}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="insurance.beginDate" class="control-label">Date
										début :</label>
									<div class="controls">
										<input type="text" name="insurance.beginDate"
											id="insurance.beginDate" class="input-large datepick"
											value="<s:date name="currentVehicle.insurance.beginDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="insurance.endDate" class="control-label">Date
										fin :</label>
									<div class="controls">
										<input type="text" name="insurance.endDate"
											id="insurance.endDate" class="input-large datepick"
											value="<s:date name="currentVehicle.insurance.endDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Visite technique
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="technicalCheck.visitDate" class="control-label">Date
										visite :</label>
									<div class="controls">
										<input type="hidden" name="technicalCheck.id"
											id="technicalCheck.id" value="${currentVehicle.warranty.id}" />
										<input type="text" name="technicalCheck.beginDate"
											id="technicalCheck.visitDate" class="input-large datepick"
											value="<s:date name="currentVehicle.technicalCheck.visitDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="technicalCheck.endDate" class="control-label">Date
										expiration :</label>
									<div class="controls">
										<input type="text" name="technicalCheck.expireDate"
											id="technicalCheck.expireDate" class="input-large datepick"
											value="<s:date name="currentVehicle.technicalCheck.expireDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="technicalCheck.observations" class="control-label">Observations
										:</label>
									<div class="controls">
										<textarea name="technicalCheck.observations"
											placeholder="Etat du véhicule"
											id="technicalCheck.observations" class="input-large">${currentVehicle.technicalCheck.observations}</textarea>
									</div>
								</div>
								<div class="control-group">
									<label for="technicalCheck.reminder.frequence"
										class="control-label">Rappel (avant expiration) :</label>
									<div class="controls">
										<div class="span4">
											<input type="hidden" name="technicalCheck.reminder.id"
												id="technicalCheck.reminder.id"
												value="${currentVehicle.technicalCheck.reminder.id}" /> <input
												type="text" name="technicalCheck.reminder.frequence"
												id="technicalCheck.reminder.frequence" placeholder="Valeur"
												class="span12"
												value="${currentVehicle.technicalCheck.reminder.frequence}" />
										</div>
										<div class="span4">
											<s:select name="technicalCheck.reminder.unit"
												id="technicalCheck.reminder.unit"
												list="@net.sas.model.bo.MeasureUnit@values()"
												listValue="getStatus()" headerKey="-1"
												headerValue="%{'Unité'}" cssClass="chosen-select"
												value="#{currentVehicle.technicalCheck.reminder.unit}" />
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<jsp:include page="../../includes/form_actions.jsp" />
			</s:form>
		</div>
		<div class="row-fluid">
			<div class="span12">
				<div class="box box-color box-bordered">
					<div class="box-title">
						<h3>
							<i class="icon-table"></i> Véhicules
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Marque</th>
									<th>Modèle</th>
									<th>Année</th>
									<th>Type</th>
									<th>Fournisseur</th>
									<th>Matricule</th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="vehicles" status="entry">
									<tr>
										<td><s:property value="brand" /></td>
										<td><s:property value="model" /></td>
										<td><s:property value="year" /></td>
										<td><s:property value="type.status" /></td>
										<td><s:property value="supplier.companyName" /></td>
										<td><s:property value="registrationNumber" /></td>
										<td><jsp:include page="../../includes/table_options.jsp" /></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
				<!-- generate reports -->
				<div class="center">
					<d:table name="vehicles" id="v" export="true" requestURI=""
						class="hide">
						<d:column title="Marque">${v.brand}</d:column>
						<d:column title="Modèle">${v.model}</d:column>
						<d:column title="Année">${v.year}</d:column>
						<d:column title="Type">${v.type.status}</d:column>
						<d:column title="Fournisseur">${v.supplier.companyName}</d:column>
						<d:column title="Matricule">${v.registrationNumber}</d:column>
						<d:setProperty name="export.pdf" value="true" />
					</d:table>
				</div>
				<!-- /generate reports -->
			</div>
		</div>
	</div>
</div>
