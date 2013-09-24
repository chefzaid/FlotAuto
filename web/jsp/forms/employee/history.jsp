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
