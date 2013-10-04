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