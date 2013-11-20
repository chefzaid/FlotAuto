<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
	setActiveTab('supplier');
</script>

<div id="left">
	<jsp:include page="../../includes/search.jsp" />
	<div class="subnav">
		<div class="subnav-title">
			<a href="#" class='toggle-subnav'><i class="icon-angle-down"></i><span>Informations</span>
			</a>
		</div>
		<ul class="subnav-menu">
			<li><a href="../supplier/list.action">Général</a></li>
		</ul>
	</div>
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="../../includes/success.jsp" />
			<s:form id="supplierForm" method="POST" enctype="multipart/form-data"
				cssClass='form-horizontal form-column' action="save.action">
				<div class="span12">
					<div class="box">
						<div class="box-title">
							<h3>
								<i class="icon-edit"></i> Fournisseur
							</h3>
						</div>
						<div class="box-content nopadding">
							<div class="span6">
								<div class="control-group">
									<label for="companyName" class="control-label">Raison
										sociale :</label>
									<div class="controls">
										<input type="hidden" name="id" id="id"
											value="${currentSupplier.id}" /> <input type="text"
											name="companyName" id="companyName"
											placeholder="Nom du fournisseur" class="input-large"
											value="${currentSupplier.companyName}" />
									</div>
								</div>
								<div class="control-group">
									<label for="type" class="control-label">Type :</label>
									<div class="controls input-large">
										<s:select name="type" id="type"
											list="@net.sas.model.bo.SupplierType@values()"
											listValue="getStatus()" headerKey="-1" headerValue="%{''}"
											cssClass="chosen-select" value="#{currentSupplier.type}" />
									</div>
								</div>
								<div class="control-group">
									<label for="phone" class="control-label">Téléphone :</label>
									<div class="controls">
										<input type="text" name="phone" id="phone"
											class="input-large mask_phone"
											value="${currentSupplier.phone}" />
									</div>
								</div>
								<div class="control-group">
									<label for="fax" class="control-label">Fax :</label>
									<div class="controls">
										<input type="text" name="fax" id="fax"
											class="input-large mask_phone" value="${currentSupplier.fax}" />
									</div>
								</div>
								<div class="control-group">
									<label for="email" class="control-label">Email :</label>
									<div class="controls">
										<input type="text" name="email" id="email"
											placeholder="nom@domaine.com" class="input-large"
											value="${currentSupplier.email}" />
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="address.address" class="control-label">Adresse
										:</label>
									<div class="controls">
										<input type="hidden" name="address.id" id="address.id"
											value="${currentSupplier.address.id}" /> <input type="text"
											name="address.address" id="address.address"
											placeholder="Adresse du domicile" class="input-large"
											value="${currentSupplier.address.address}" />
									</div>
								</div>
								<div class="control-group">
									<label for="address.zip" class="control-label">Code
										postal :</label>
									<div class="controls">
										<input type="text" name="address.zip" id="address.zip"
											placeholder="Code postal" class="input-large"
											value="${currentSupplier.address.zip}" />
									</div>
								</div>
								<div class="control-group">
									<label for="address.city" class="control-label">Ville :</label>
									<div class="controls">
										<input type="text" name="address.city" id="address.city"
											placeholder="Ville" class="input-large"
											value="${currentSupplier.address.city}" />
									</div>
								</div>
								<div class="control-group">
									<label for="notes" class="control-label">Notes :</label>
									<div class="controls">
										<textarea name="notes" placeholder="..." id="notes"
											class="input-large">${currentSupplier.notes}</textarea>
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
							<i class="icon-table"></i> Fournisseurs
						</h3>
					</div>
					<div class="box-content nopadding">
						<table
							class="table table-nomargin table-striped dataTable dataTable-colvis">
							<thead>
								<tr>
									<th>Raison sociale</th>
									<th>Type</th>
									<th>Adresse</th>
									<th>Ville</th>
									<th>Phone</th>
									<th>Email</th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="suppliers" status="entry">
									<tr>
										<td><s:property value="companyName" /></td>
										<td><s:property value="type.status" /></td>
										<td><s:property value="address.address" /></td>
										<td><s:property value="address.city" /></td>
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
