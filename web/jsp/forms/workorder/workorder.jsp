<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
	setActiveTab('workorder');
</script>

<div id="left">
	<jsp:include page="../../includes/search.jsp" />
	<div class="subnav">
		<div class="subnav-title">
			<a href="#" class='toggle-subnav'><i class="icon-angle-down"></i><span>Informations</span>
			</a>
		</div>
		<ul class="subnav-menu">
			<li><a href="../workorder/list.action">G�n�ral</a></li>
		</ul>
	</div>
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="../../includes/success.jsp" />
			<s:form id="workorderForm" method="POST"
				enctype="multipart/form-data" cssClass='form-horizontal form-column'
				action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Ordre de travail
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="description" class="control-label">Description
										:</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentWorkOrder.id}" /> <input type="text"
											name="description" id="description"
											placeholder="Description de la t�che" class="input-large"
											value="${currentWorkOrder.description}" />
									</div>
								</div>
								<div class="control-group">
									<label for="vehicleId" class="control-label">V�hicule :</label>
									<div class="controls  input-large">
										<s:select name="vehicleId" id="vehicleId" list="allVehicles"
											listValue="brand" listKey="id" headerKey="-1"
											headerValue="%{''}" cssClass="chosen-select"
											value="%{currentWorkOrder.vehicle.id}" />
									</div>
								</div>
								<div class="control-group">
									<label for="employeeRequestingId" class="control-label">Employ�
										demandant :</label>
									<div class="controls  input-large">
										<s:select name="employeeRequestingId"
											id="employeeRequestingId" list="allEmployees"
											listValue="lastName + ' ' + firstName" listKey="id"
											headerKey="-1" headerValue="%{''}" cssClass="chosen-select"
											value="%{currentWorkOrder.employeeRequesting.id}" />
									</div>
								</div>
								<div class="control-group">
									<label for="employeesInChargeList" class="control-label">Employ�s
										en charge :</label>
									<div class="controls  input-large">
										<s:select name="employeesInChargeList"
											id="employeesInChargeList" list="allEmployees"
											listValue="lastName + ' ' + firstName" listKey="id"
											headerKey="-1" headerValue="%{''}" cssClass="chosen-select"
											multiple="true"
											value="%{currentWorkOrder.employeesInCharge.{id}}" />
									</div>
								</div>
								<div class="control-group">
									<label for="maintenancesList" class="control-label">Maitnenances
										:</label>
									<div class="controls  input-large">
										<s:select name="maintenancesList" id="maintenancesList"
											list="allMaintenances" listValue="description" listKey="id"
											headerKey="-1" headerValue="%{''}" cssClass="chosen-select"
											multiple="true" value="%{currentWorkOrder.maintenances.{id}}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="createDate" class="control-label">Date
										cr�ation :</label>
									<div class="controls">
										<input type="text" name="createDate" id="createDate"
											class="input-large datepick"
											value="<s:date name="currentWorkOrder.createDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="requireDate" class="control-label">Date
										requise :</label>
									<div class="controls">
										<input type="text" name="requireDate" id="requireDate"
											class="input-large datepick"
											value="<s:date name="currentWorkOrder.requireDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="reference" class="control-label">R�f�rence
										:</label>
									<div class="controls">
										<input type="text" name="reference" id="reference"
											placeholder="R�f�rence de l'ordre" class="input-large"
											value="${currentWorkOrder.reference}" />
									</div>
								</div>
								<div class="control-group">
									<label for="notes" class="control-label">Notes :</label>
									<div class="controls">
										<textarea name="notes" id="notes" placeholder="..."
											class="input-large">${currentEmployee.notes}</textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Odom�tre
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="odometer.counter" class="control-label">Compteur
										: :</label>
									<div class="controls">
										<div class="input-append">
											<input type="hidden" name="odometer.id" id="odometer.id"
												value="${currentWorkOrder.odometer.id}" /> <input
												type="hidden" name="odometer.vehicle.id"
												id="odometer.vehicle.id"
												value="${currentWorkOrder.vehicle.id}" /> <input
												type="text" name="odometer.counter" id="odometer.counter"
												placeholder="123 456 Km" class="input-medium"
												value="${currentWorkOrder.odometer.counter}" /><span
												class="add-on">Km</span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="odometer.readDate" class="control-label">Date
										lecture :</label>
									<div class="controls">
										<input type="text" name="odometer.readDate"
											id="odometer.readDate" class="input-large datepick"
											value="<s:date name="currentWorkOrder.odometer.readDate"
												format="dd/MM/yyyy" />" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="odometer.observations" class="control-label">Observations
										:</label>
									<div class="controls">
										<textarea name="odometer.observations"
											id="odometer.observations" placeholder="..."
											class="input-large">${currentWorkOrder.odometer.observations}</textarea>
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
							<i class="icon-table"></i> Ordres de travail
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Matricule</th>
									<th>Pr�nom</th>
									<th>Nom</th>
									<th>Occupation</th>
									<th>Date emabauche</th>
									<th>Phone</th>
									<th>Email</th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="workOrders" status="entry">
									<tr>
										<td><s:property value="number" /></td>
										<td><s:property value="firstName" /></td>
										<td><s:property value="lastName" /></td>
										<td><s:property value="occupation.status" /></td>
										<td><s:date name="hireDate" format="dd/MM/yyyy" /></td>
										<td><s:property value="phone" /></td>
										<td><s:property value="email" /></td>
										<td><jsp:include page="../../includes/table_options.jsp" /></td>
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