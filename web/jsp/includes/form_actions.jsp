<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="form-actions center">
	<s:url id="first" value="first.action" />
	<sj:a href="%{first}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">|&lt;</sj:a>
	<s:url id="previous" value="previous.action" />
	<sj:a href="%{previous}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">&lt;&lt;</sj:a>

	<s:url id="clear" value="clear.action" />
	<sj:a href="%{clear}" targets="home" cssClass="btn"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">Nouveau</sj:a>

	<sj:submit value="Enregistrer" targets="home"
		cssClass="btn btn-success" onBeforeTopics="onBeforeLoading"
		onCompleteTopics="onCompleteLoading" onSuccessTopics="onAfterLoading" />

	<s:url id="delete" value="delete.action" />
	<sj:a cssClass="hide" targets="home" href="%{delete}"
		listenTopics="confirmDelete" onSuccessTopics="onAfterLoading" />
	<a href="#confirm" class="btn btn-danger" data-toggle="modal">Supprimer</a>

	<s:url id="next" value="next.action" />
	<sj:a href="%{next}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">&gt;&gt;</sj:a>
	<s:url id="last" value="last.action" />
	<sj:a href="%{last}" targets="home" cssClass="btn btn-primary"
		onBeforeTopics="onBeforeLoading" onCompleteTopics="onCompleteLoading">&gt;|</sj:a>
</div>