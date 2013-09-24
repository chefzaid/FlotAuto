<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
	setActiveTab('supplier');
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
			<li><a href="../supplier/list.action">G�n�ral</a></li>
		</ul>
	</div>
</div>
<div id="main">
	<div class="container-fluid">
		<div class="row-fluid">
			<s:form id="supplierForm" method="POST" enctype="multipart/form-data"
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
									<div class="controls">
										<div class="input-large">
											<s:select name="type" id="type"
												list="@net.sas.model.bo.SupplierType@values()"
												listValue="getStatus()" headerKey="-1" headerValue="%{''}"
												cssClass="chosen-select" value="#{currentSupplier.type}" />
										</div>
									</div>
								</div>
								<div class="control-group">
									<label for="phone" class="control-label">T�l�phone :</label>
									<div class="controls">
										<input type="text" name="phone" id="phone"
											class="input-large mask_phone"
											value="${currentSupplier.phone}" /> <span class="help-block">Format
											: (123) 456-7890</span>
									</div>
								</div>
								<div class="control-group">
									<label for="fax" class="control-label">Fax :</label>
									<div class="controls">
										<input type="text" name="fax" id="fax"
											class="input-large mask_phone" value="${currentSupplier.fax}" />
										<span class="help-block">Format : (123) 456-7890</span>
									</div>
								</div>
							</div>
							<div class="span6">
								<div class="control-group">
									<label for="email" class="control-label">Email :</label>
									<div class="controls">
										<input type="text" name="email" id="email"
											placeholder="nom@domaine.com" class="input-large"
											value="${currentSupplier.email}" />
									</div>
								</div>
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
									<th>-</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="suppliers" status="supplier">
									<tr>
										<td><s:property value="companyName" /></td>
										<td><s:property value="type.status" /></td>
										<td><s:property value="address.address" /></td>
										<td><s:property value="address.city" /></td>
										<td><s:property value="phone" /></td>
										<td><s:property value="email" /></td>
										<td><s:url id="view" value="view.action">
												<s:param name="index">
													<s:property value="#supplier.index" />
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