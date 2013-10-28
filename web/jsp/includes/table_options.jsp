<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:url id="view" value="view.action">
	<s:param name="index">
		<s:property value="#entry.index" />
	</s:param>
</s:url>
<sj:a href="%{view}" targets="home" cssClass="btn" rel="tooltip"
	title="Afficher" onBeforeTopics="onBeforeLoading"
	onCompleteTopics="onCompleteLoading">
	<i class="icon-search"></i>
</sj:a>