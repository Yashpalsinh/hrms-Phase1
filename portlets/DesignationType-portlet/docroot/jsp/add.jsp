<%@ include file="/jsp/init.jsp" %>

<portlet:actionURL var="addDesignationActionURL">
	<portlet:param name="action" value="addDesignation" />
</portlet:actionURL>

<aui:form method="post" name="employeeDesignation" action="${addDesignationActionURL}">
	
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:fieldset>
		<aui:input type="text" label= "Designation Name" name="designationName" />
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

