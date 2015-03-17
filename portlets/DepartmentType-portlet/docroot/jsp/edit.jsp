


<%@ include file="/jsp/init.jsp" %>


<% if(SessionErrors.contains(renderRequest.getPortletSession(),"department-update-error")){%>
<liferay-ui:error key="department-update-error" message="There is an Error occured while updateing department please try again" />
<%} %>


<portlet:actionURL var="addDepartmentActionURL">
	<portlet:param name="action" value="addDepartment" />
</portlet:actionURL>
<aui:form action="${addDepartmentActionURL}" method="post" name="employeeDepartment">
	
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="employeeDepartmentId" type="hidden" value="${employeeDepartmentDetail.employeeDepartmentId}" />

	<liferay-ui:asset-categories-error />

	<liferay-ui:asset-tags-error />

	<aui:fieldset>
		<aui:input label= "Department Name" name="departmentName"  value="${employeeDepartmentDetail.departmentName}"/>

		<aui:select name="status">
			<option  value="true"	${employeeDepartmentDetail.status == true ? 'selected': ''}>Active</option>
			<option  value="false"	${employeeDepartmentDetail.status != true ? 'selected': ''}>Inactive</option>
		</aui:select>

		
	</aui:fieldset>

	<aui:button-row>
		 <aui:button name="saveForm" value="Save" />
	</aui:button-row>
</aui:form>

<aui:script use="aui-base,aui-io-request">
    A.one('#<portlet:namespace/>saveForm').on('click', function(event) {
        var A = AUI();
        var url = '<%=addDepartmentActionURL.toString()%>';
        A.io.request(
            url,
            {
                method: 'POST',
                form: {id: '<portlet:namespace/>employeeDepartment'},
                on: {
                    success: function() {
                      Liferay.Util.getOpener().refreshPortlet();
                    	
                    } 
                }
            }
        );
    });
</aui:script>
