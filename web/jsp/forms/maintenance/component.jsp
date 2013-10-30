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
								<i class="icon-edit"></i> Composant
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="label" class="control-label">Description
										:</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentComponent.id}" /> <input type="text"
											name="label" id="label"
											placeholder="Label du composant" class="input-large"
											value="${currentComponent.label}" />
									</div>
								</div>
								<div class="control-group">
									<label for="brand" class="control-label">Marque :</label>
									<div class="controls">
										<input type="text" name="brand" id="brand"
											placeholder="Marque du composant" class="input-large"
											value="${currentComponent.brand}" />
									</div>
								</div>
								<div class="control-group">
									<label for="type" class="control-label">Type :</label>
									<div class="controls input-large">
										<s:select name="type" id="type"
											list="@net.sas.model.bo.ComponentType@values()"
											listValue="getStatus()" headerKey="-1" headerValue="%{''}"
											cssClass="chosen-select" value="#{currentComponent.type}" />
									</div>
								</div>
								<div class="control-group">
									<label for="supplierList" class="control-label">Fournisseur
										:</label>
									<div class="controls  input-large">
										<s:select name="supplierList" id="supplierList"
											list="allSuppliers" listValue="companyName" listKey="id"
											headerKey="-1" headerValue="%{''}" cssClass="chosen-select"
											multiple="true" value="%{currentComponent.suppliers.{id}}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="price" class="control-label">Prix :</label>
									<div class="controls">
										<div class="input-append">
											<input type="text" name="price" id="price"
												placeholder="123.45" class='input-medium'
												value="${currentComponent.price}" /> <span class="add-on">Dh/unité</span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="stockQuantity " class="control-label">Stock
										:</label>
									<div class="controls">
										<div class="input-append">
											<input type="text" name="stockQuantity" id="stockQuantity"
												placeholder="Quantité en stock" class='input-medium'
												value="${currentComponent.stockQuantity}" /> <span
												class="add-on">Unités</span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="reference" class="control-label">Référence
										:</label>
									<div class="controls">
										<input type="text" name="reference" id="reference"
											placeholder="Référence du composant" class="input-large"
											value="${currentComponent.reference}" />
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
												value="${currentComponent.warranty.id}" /> <input
												type="text" name="warranty.beginDate"
												id="warranty.beginDate" class="input-large datepick"
												value="<s:date name="currentComponent.warranty.beginDate"
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
													value="${currentComponent.warranty.validity.id}" /> <input
													type="text" name="warranty.validity.frequence"
													id="warranty.validity.frequence" placeholder="Valeur"
													class="span12"
													value="${currentComponent.warranty.validity.frequence}" />
											</div>
											<div class="span4">
												<s:select name="warranty.validity.unit"
													id="warranty.validity.unit"
													list="@net.sas.model.bo.MeasureUnit@values()"
													listValue="getStatus()" headerKey="-1"
													headerValue="%{'Unité'}" cssClass="chosen-select"
													value="#{currentComponent.warranty.validity.unit}" />
											</div>
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
							<i class="icon-table"></i> Composants
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Label</th>
									<th>Type</th>
									<th>Marque</th>
									<th>Prix</th>
									<th>Stock</th>
									<th>Reference</th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="components" status="entry">
									<tr>
										<td><s:property value="label" /></td>
										<td><s:property value="type.status" /></td>
										<td><s:property value="brand" /></td>
										<td><s:property value="price" /></td>
										<td><s:property value="stockQuantity" /></td>
										<td><s:property value="reference" /></td>
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
