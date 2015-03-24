
<%@ include file="/jsp/init.jsp" %>
<portlet:actionURL var="addDesignationActionURL">
	<portlet:param name="action" value="addDesignation" />
</portlet:actionURL>
<aui:form action="${addDesignationActionURL}" method="post" name="employeeDesignation">
	
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="employeeDesignationId" type="hidden" value="${employeeDesignationDetail.employeeDesignationId}" />
	<aui:fieldset>
		<aui:input label= "Designation Name" name="designationName"  value="${employeeDesignationDetail.designationName}"/>
		<aui:select name="status">
			<option  value="true"	${employeeDesignationDetail.status == true ? 'selected': ''}>Active</option>
			<option  value="false"	${employeeDesignationDetail.status != true ? 'selected': ''}>Inactive</option>
		</aui:select>
	</aui:fieldset>

	<aui:button-row>
		 <aui:button name="saveForm" value="Save" type="submit"/>
		 <aui:button value="Back" type="button" onClick="javascript: window.history.go(-1)"/>
	</aui:button-row>
</aui:form>

