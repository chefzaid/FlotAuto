<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="form-actions center">
	<s:url id="first" value="first.action" />
	<sj:a href="%{first}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">
		<i class="icon-fast-backward"></i>
	</sj:a>
	<s:url id="previous" value="previous.action" />
	<sj:a href="%{previous}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">
		<i class="icon-backward"></i>
	</sj:a>

	<s:url id="clear" value="clear.action" />
	<sj:a href="%{clear}" targets="home" cssClass="btn"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">
		<i class="icon-refresh"></i> Nouveau</sj:a>

	<sj:submit value="Enregistrer" targets="home"
		cssClass="btn btn-success" onBeforeTopics="onBeforeLoading"
		onCompleteTopics="onCompleteLoading" onSuccessTopics="onAfterLoading" />

	<s:url id="delete" value="delete.action" />
	<sj:a cssClass="hide" targets="home" href="%{delete}"
		listenTopics="confirmDelete" onSuccessTopics="onAfterLoading" />
	<a href="#confirm" class="btn btn-danger" data-toggle="modal"><i
		class="icon-remove"></i> Supprimer</a>

	<s:url id="next" value="next.action" />
	<sj:a href="%{next}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">
		<i class="icon-forward"></i>
	</sj:a>
	<s:url id="last" value="last.action" />
	<sj:a href="%{last}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">
		<i class="icon-fast-forward"></i>
	</sj:a>
</div>