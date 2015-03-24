
<%@ include file="/jsp/init.jsp" %>
<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
	
	buttonLabel="Search" 
	displayTerms="<%= displayTerms %>"
	id="toggle_id_search">
	<aui:input label="Sub Department Name" name="subDepartmentNamea" value="<%=subDepartmentNamea %>" />
	<aui:select name="employeeDepartmentIda" label="Department Name">
	
			<option value="0" >Select</option>
		<c:forEach items="${departmentList}" var="department">
			<option  value="${department.employeeDepartmentId}">${department.departmentName}</option>
			
		</c:forEach>
		</aui:select> 
	<aui:select label="Status" name="statusa">
			<aui:option label="Select" value=""></aui:option>
			<aui:option label="Active" value="true"></aui:option>
			<aui:option label="Inactive" value="false"></aui:option>
	</aui:select>
</liferay-ui:search-toggle>