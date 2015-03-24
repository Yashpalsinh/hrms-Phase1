

<%@ include file="/jsp/init.jsp" %>
<portlet:renderURL  var="addregURL" >
		<portlet:param name="name" value="add" />
</portlet:renderURL>


<div class="div-add-registration">

	<aui:a href="<%=addregURL %>" cssClass="add-registration-link" id="addRegistration" label="Employee Registration" />	
</div>




<liferay-portlet:renderURL varImpl="SearchURL">
<portlet:param name="action" value="/jsp/view.jsp" />
<portlet:param name="redirect" value="<%= currentURL %>" />
</liferay-portlet:renderURL>
 
