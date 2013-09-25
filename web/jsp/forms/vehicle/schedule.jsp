<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
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
			<s:form id="vehicleForm" method="POST" enctype="multipart/form-data"
				cssClass='form-horizontal form-column' action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Caractéristiques
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="brand" class="control-label">Description :</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentSchedule.id}" /> <input type="text"
											name="brand" id="brand" placeholder="Description du service"
											class="input-large" value="${currentSchedule.description}" />
									</div>
								</div>
								<div class="control-group">
									<label for="technicalCheck.reminder.frequence"
										class="control-label">Fréquence :</label>
									<div class="controls">
										<div class="span4">
											<input type="hidden" name="currentSchedule.frequence.id"
												id="currentSchedule.frequence.id"
												value="${currentSchedule.reminder.id}" /> <input
												type="text" name="technicalCheck.frequence.frequence"
												id="currentSchedule.frequence.frequence"
												placeholder="Chaque..." class="span12"
												value="${currentSchedule.frequence.frequence}" />
										</div>
										<div class="span4">
											<s:select name="currentSchedule.frequence.unit"
												id="currentSchedule.frequence.unit"
												list="@net.sas.model.bo.MeasureUnit@values()"
												listValue="getStatus()" headerKey="-1"
												headerValue="%{'Unité'}" cssClass="chosen-select"
												value="#{currentSchedule.frequence.unit}" />
										</div>
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="currentSchedule.reminder.frequence"
										class="control-label">Rappel (avant) :</label>
									<div class="controls">
										<div class="span4">
											<input type="hidden" name="currentSchedule.reminder.id"
												id="currentSchedule.reminder.id"
												value="${currentVehicle.technicalCheck.reminder.id}" /> <input
												type="text" name="currentSchedule.reminder.frequence"
												id="currentSchedule.reminder.frequence"
												placeholder="Avant..." class="span12"
												value="${currentSchedule.reminder.frequence}" />
										</div>
										<div class="span4">
											<s:select name="currentSchedule.reminder.unit"
												id="currentSchedule.reminder.unit"
												list="@net.sas.model.bo.MeasureUnit@values()"
												listValue="getStatus()" headerKey="-1"
												headerValue="%{'Unité'}" cssClass="chosen-select"
												value="#{currentSchedule.reminder.unit}" />
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
									<th>Description</th>
									<th>Fréquence</th>
									<th>Rappel</th>
									<th>-</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="schedules" status="schedule">
									<tr>
										<td><s:property value="description" /></td>
										<td>Chaque <s:property value="frequence.frequence" /> <s:property
												value="frequence.unit" /></td>
										<td>Avant <s:property value="reminder.frequence" /> <s:property
												value="reminder.unit" /></td>
										<td><s:url id="view" value="view.action">
												<s:param name="index">
													<s:property value="#vehicle.index" />
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
