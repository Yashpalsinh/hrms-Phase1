<%@ include file="/jsp/init.jsp"%>
<!-- session Messages to display on add update delete success or error by their key -->

<portlet:actionURL var="addDepartmentActionURL">
	<portlet:param name="action" value="addDepartment" />
</portlet:actionURL>

<aui:form method="post" name="employeeDepartment" action="${addDepartmentActionURL}">

	<aui:input name="redirect" type="hidden" value="<%=currentURL%>" />
	<aui:fieldset>
		<aui:input type="text" label="Department Name" name="departmentName" />
		<aui:select name="status">
			<aui:option label="Active" value="true"></aui:option>
			<aui:option label="Inactive" value="false"></aui:option>
		</aui:select>
	</aui:fieldset>
	<aui:button-row>
		<aui:button name="saveForm" value="Save" type="submit" />
		<aui:button value="Back" type="button" />
	</aui:button-row>

</aui:form>
