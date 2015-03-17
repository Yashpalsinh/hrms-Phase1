<%@ include file="/jsp/init.jsp" %>
<!-- session Messages to display on add update delete success or error by their key -->

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"department-add-error")){%>
<liferay-ui:error key="department-add-error" message="There is an Error occured while adding Department please try again" />
<%} %>
<portlet:actionURL var="addDepartmentActionURL">
	<portlet:param name="action" value="addDepartment" />
</portlet:actionURL>

<aui:form method="post" name="employeeDepartment">
	
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	
	
	

	<aui:fieldset>
		<aui:input type="text" label= "Department Name" name="departmentName" />
		<aui:select name="status">
			<aui:option label="Active" value="true"></aui:option>
			<aui:option label="Inactive" value="false"></aui:option>
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
