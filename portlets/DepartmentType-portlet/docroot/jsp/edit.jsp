
<%@ include file="/jsp/init.jsp" %>
<portlet:actionURL var="addDepartmentActionURL">
	<portlet:param name="action" value="addDepartment" />
</portlet:actionURL>
<aui:form action="${addDepartmentActionURL}" method="post" name="employeeDepartment">
	
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="employeeDepartmentId" type="hidden" value="${employeeDepartmentDetail.employeeDepartmentId}" />
	<aui:fieldset>
		<aui:input label= "Department Name" name="departmentName"  value="${employeeDepartmentDetail.departmentName}"/>
		<aui:select name="status">
			<option  value="true"	${employeeDepartmentDetail.status == true ? 'selected': ''}>Active</option>
			<option  value="false"	${employeeDepartmentDetail.status != true ? 'selected': ''}>Inactive</option>
		</aui:select>
	</aui:fieldset>
	<aui:button-row>
		 <aui:button name="saveForm" value="Save" type="submit"/>
		 <aui:button value="Back" type="button" />
	</aui:button-row>
</aui:form>

