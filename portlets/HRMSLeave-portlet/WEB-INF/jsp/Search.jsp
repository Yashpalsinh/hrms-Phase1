<%@include file="init.jsp" %>

<%
	SearchContainer searchContainer=(SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms=searchContainer.getDisplayTerms();

%>

<liferay-ui:search-toggle
	buttonLabel="Find A Leave"
	displayTerms="<%=displayTerms %>"
	id="toggle_id_search">
</liferay-ui:search-toggle>