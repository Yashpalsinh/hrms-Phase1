
<%@ include file="/jsp/init.jsp" %>
<portlet:actionURL var="addSubDepartmentActionURL">
	<portlet:param name="action" value="addSubDepartment" />
</portlet:actionURL>
<aui:form action="${addSubDepartmentActionURL}" method="post" name="employeeSubDepartment">
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="employeeSubDepartmentId" type="hidden" value="${employeeSubDepartmentDetail.employeeSubDepartmentId}" />

	<aui:fieldset>
		<aui:input label= "Sub Department Name" name="subDepartmentName"  value="${employeeSubDepartmentDetail.subDepartmentName}"/>
		<aui:select name="employeeDepartmentId" label="Department Name">
		<c:forEach items="${departmentList}" var="department">
			<option  value="${department.employeeDepartmentId}" ${department.employeeDepartmentId == employeeSubDepartmentDetail.employeeDepartmentId ? 'selected' : ''}>${department.departmentName}</option>
		</c:forEach>
		</aui:select> 
		<aui:select name="status">
			<option  value="true"	${employeeSubDepartmentDetail.status == true ? 'selected': ''}>Active</option>
			<option  value="false"	${employeeSubDepartmentDetail.status != true ? 'selected': ''}>Inactive</option>
		</aui:select>
	</aui:fieldset>

	<aui:button-row>
		 <aui:button name="saveForm" value="Save" type="submit"/>
		 <aui:button value="Back" type="button" onClick="javascript: window.history.go(-1)"/>
	</aui:button-row>
</aui:form>

