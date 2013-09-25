<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
	setActiveTab('employee');
</script>

<div id="left">
	<jsp:include page="../../includes/search.jsp" />
	<jsp:include page="../../includes/menu_employee.jsp" />
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<s:form id="employeeForm" method="POST"
				cssClass='form-horizontal form-column' action="select.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Employé
							</h3>
						</div>
						<div class="box-content nopadding"
							style="margin: 0 auto; width: 75%;">
							<div class="span6">
								<div class="control-group">
									<input type="hidden" name="id" id="id"
										value="${currentEmployee.id}" /> <label for="textfield"
										class="control-label">Employé concerné :</label>
									<div class="controls">
										<div class="input-large">
											<select name="select" id="select" class='chosen-select'>
												<option value="1">Option-1</option>
												<option value="2">Option-2</option>
												<option value="3">Option-3</option>
												<option value="4">Option-4</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<sj:submit value="Selectionner" targets="home"
										cssClass="btn btn-success" onBeforeTopics="onBeforeLoading"
										onCompleteTopics="onCompleteLoading"
										onSuccessTopics="onAfterLoading" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</s:form>
			<s:form id="historyForm" method="POST"
				cssClass='form-horizontal form-column' action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Utilisation
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<input type="hidden" name="employeeId" id="employeeId" value="" />
									<input type="hidden" name="vehicleId" id="vehicleId" value="" />
									<label for="vehicule" class="control-label">Véhicule
										conduit :</label>
									<div class="controls">
										<div class="input-large">
											<select name="vehicule" id="vehicule" class='chosen-select'>
												<option value="1">Option-1</option>
												<option value="2">Option-2</option>
												<option value="3">Option-3</option>
												<option value="4">Option-4</option>
											</select>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="notes" class="control-label">Notes :</label>
									<div class="controls">
										<textarea name="notes" placeholder="..." id="notes"
											class="input-large"></textarea>
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="vehicule" class="control-label">Date début
										:</label>
									<div class="controls">
										<input type="text" name="beginDate" id="beginDate"
											class="input-large datepick"
											value="<s:date name=""
												format="dd/MM/yyyy" />" />
									</div>
								</div>
								<div class="control-group">
									<label for="notes" class="control-label">Date fin :</label>
									<div class="controls">
										<input type="text" name="endDate" id="endDate"
											class="input-large datepick"
											value="<s:date name=""
												format="dd/MM/yyyy" />" />
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
							<i class="icon-table"></i> Véhicules conduits
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Matricule</th>
									<th>Marque</th>
									<th>Modèle</th>
									<th>-</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="employees" status="employee">
									<tr>
										<td><s:property value="number" /></td>
										<td><s:property value="brand" /></td>
										<td><s:property value="model" /></td>
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
