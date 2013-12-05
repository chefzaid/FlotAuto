<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="d" uri="http://displaytag.sf.net/el"%>
<script type="text/javascript">
	setActiveTab('maintenance');
</script>
<script type="text/javascript" src="/FlotAuto/jsp/js/app_expense.js"></script>

<div id="left">
	<jsp:include page="../../includes/search.jsp" />
	<jsp:include page="../../includes/menu_maintenance.jsp" />
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="../../includes/success.jsp" />
			<s:form id="expenseForm" method="POST" enctype="multipart/form-data"
				cssClass='form-horizontal form-column' action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Dépense
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="expenseType" class="control-label">Type :</label>
									<div class="controls input-xlarge">
										<input type="hidden" name="id" id="id"
											value="${currentExpense.id}" />
										<s:select name="expenseType" id="expenseType"
											list="@net.sas.model.bo.ExpenseType@values()"
											listValue="getStatus()" headerKey="-1" headerValue="%{''}"
											cssClass="chosen-select" value="#{currentExpense.type}"
											onChange="showInput()" />
									</div>
								</div>
								<div class="control-group">
									<div id="component" class="hide">
										<label for="componentId" class="control-label">Composant
											:</label>
										<div class="controls input-xxlarge">
											<s:iterator value="allComponents" var="entry">
												<input type="hidden"
													name='cprice_<s:property value="#entry.id" />'
													id='cprice_<s:property value="#entry.id" />'
													value='<s:property value="#entry.price" />' />
											</s:iterator>
											<s:select name="componentId" id="componentId"
												list="allComponents"
												listValue="details"
												listKey="id" headerKey="-1" headerValue="%{''}"
												cssClass="chosen-select"
												value="#{currentExpense.component.id}"
												onChange="updateCost('cprice', id);" />
										</div>
									</div>
									<div id="lubricant" class="hide">
										<label for="lubricantId" class="control-label">Lubrifiant
											:</label>
										<div class="controls input-xxlarge">
											<s:iterator value="allLubricants" var="entry">
												<input type="hidden"
													name='lprice_<s:property value="#entry.id" />'
													id='lprice_<s:property value="#entry.id" />'
													value='<s:property value="#entry.price" />' />
											</s:iterator>
											<s:select name="lubricantId" id="lubricantId"
												list="allLubricants"
												listValue="details"
												listKey="id" headerKey="-1" headerValue="%{''}"
												cssClass="chosen-select"
												value="#{currentExpense.lubricant.id}"
												onChange="updateCost('lprice', id);" />
										</div>
									</div>
									<div id="other" class="hide">
										<label for="description" class="control-label">Description
											:</label>
										<div class="controls">
											<s:textfield name="description" id="description"
												placeholder="Description de la dépense"
												cssClass="input-xlarge"
												value="%{currentExpense.description}" />
										</div>
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="cost" class="control-label">Coût unitaire :</label>
									<div class="controls">
										<div class="input-append">
											<input type="text" name="cost" id="cost" placeholder="123.45"
												class='input-medium' value="${currentExpense.cost}"
												disabled="disabled" /> <span class="add-on">Dh</span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="quantity" class="control-label">Quantité :</label>
									<div class="controls">
										<div class="input-append">
											<input type="text" name="quantity" id="quantity"
												placeholder="123" class='input-medium'
												value="${currentExpense.quantity}"
												onKeyUp="updateTotalCost()" onChange="updateTotalCost()" /><span
												class="add-on">Uts</span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="totalCost" class="control-label">Coût total
										:</label>
									<div class="controls">
										<div class="input-append">
											<input type="text" name="totalCost" id="totalCost"
												placeholder="123.45" class='input-medium'
												disabled="disabled" /> <span class="add-on">Dh</span>
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
							<i class="icon-table"></i> Dépenses
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Type</th>
									<th>Description</th>
									<th>Prix unitaire</th>
									<th>Quantité</th>
									<th>Prix total</th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="expenses" status="entry">
									<tr>
										<td><s:property value="type.status" /></td>
										<td><s:property value="details" /></td>
										<td><s:property value="cost" /></td>
										<td><s:property value="quantity" /></td>
										<td><s:property value="cost * quantity" /></td>
										<td><jsp:include
												page="../../includes/table_options_expense.jsp" /></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
				<!-- generate reports -->
				<div class="center">
					<d:table name="expenses" id="e" export="true" requestURI=""
						class="hide">
						<d:column title="Type">${e.type.status}</d:column>
						<d:column title="Description">${e.details}</d:column>
						<d:column title="Coût">${e.cost}</d:column>
						<d:column title="Quantité">${e.quantity}</d:column>
						<d:column title="Coût total">${e.cost * e.quantity}</d:column>
						<d:setProperty name="export.pdf" value="true" />
						<d:setProperty name="export.pdf.filename" value="expenses.pdf" />
						<d:setProperty name="export.xml.filename" value="expenses.xml" />
						<d:setProperty name="export.excel.filename" value="expenses.xls" />
						<d:setProperty name="export.csv.filename" value="expenses.csv" />
					</d:table>
				</div>
				<!-- /generate reports -->
			</div>
		</div>
	</div>
</div>
