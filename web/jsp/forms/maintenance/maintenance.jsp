<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
	setActiveTab('maintenance');
</script>

<div id="left">
	<jsp:include page="../../includes/search.jsp" />
	<jsp:include page="../../includes/menu_maintenance.jsp" />
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="../../includes/success.jsp" />
			<s:form id="employeeForm" method="POST" enctype="multipart/form-data"
				cssClass='form-horizontal form-column' action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Programme de maintenance
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="description" class="control-label">Description
										:</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentMaintenance.id}" /> <input type="text"
											name="description" id="description"
											placeholder="Description du programme" class="input-xxlarge"
											value="${currentMaintenance.description}" />
									</div>
								</div>
								<div class="control-group">
									<label for="expenseList" class="control-label">Dépenses
										:</label>
									<div class="controls  input-xxlarge">
										<s:select name="expenseList" id="expenseList"
											list="allExpenses"
											listValue="type.status + ' [' + quantity + '] : ' + description"
											listKey="id" headerKey="-1" headerValue="%{''}"
											cssClass="chosen-select" multiple="true"
											value="%{currentMaintenance.expenses.{id}}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="frequency.frequence" class="control-label">Fréquence
										:</label>
									<div class="controls">
										<div class="span4">
											<input type="hidden" name="frequency.id"
												id="frequency.frequence.id"
												value="${currentMaintenance.frequency.id}" /> <input
												type="text" name="frequency.frequence"
												id="frequency.frequence" placeholder="Valeur" class="span12"
												value="${currentMaintenance.frequency.frequence}" />
										</div>
										<div class="span4">
											<s:select name="frequency.unit" id="frequency.unit"
												list="@net.sas.model.bo.MeasureUnit@values()"
												listValue="getStatus()" headerKey="-1"
												headerValue="%{'Unité'}" cssClass="chosen-select"
												value="#{currentMaintenance.frequency.unit}" />
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="reminder.frequence" class="control-label">Rappel
										:</label>
									<div class="controls">
										<div class="span4">
											<input type="hidden" name="reminder.id" id="reminder.id"
												value="${currentMaintenance.reminder.id}" /> <input
												type="text" name="reminder.frequence"
												id="reminder.frequence" placeholder="Valeur" class="span12"
												value="${currentMaintenance.reminder.frequence}" />
										</div>
										<div class="span4">
											<s:select name="reminder.unit" id="reminder.unit"
												list="@net.sas.model.bo.MeasureUnit@values()"
												listValue="getStatus()" headerKey="-1"
												headerValue="%{'Unité'}" cssClass="chosen-select"
												value="#{currentMaintenance.reminder.unit}" />
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
							<i class="icon-table"></i> Programmes
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Programme</th>
									<th>Dépenses</th>
									<th>Fréquence</th>
									<th>-</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="maintenances" status="entry">
									<tr>
										<td><s:property value="description" /></td>
										<td><s:iterator value="expenses" var="expense">
												<s:property
													value="#expense.type.status + ' [' + #expense.quantity + '] : ' + #expense.description" />
												<br />
											</s:iterator></td>
										<td><s:property value="frequency.frequence + ' ' + frequency.unit.status" /></td>
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