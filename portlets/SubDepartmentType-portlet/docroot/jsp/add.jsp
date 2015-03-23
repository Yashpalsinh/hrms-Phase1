<%@ include file="/jsp/init.jsp" %>

<portlet:actionURL var="addSubDepartmentActionURL">
	<portlet:param name="action" value="addSubDepartment" />
</portlet:actionURL>

<aui:form method="post" name="employeeSubDepartment" action="${addSubDepartmentActionURL}">
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:fieldset>
		<aui:input type="text" label= "Sub Department Name" name="subDepartmentName" />
		<aui:select name="employeeDepartmentId" label="Department Name">
		<c:forEach items="${departmentList}" var="department">
			<option  value="${department.employeeDepartmentId}">${department.departmentName}</option>
		</c:forEach>
		</aui:select> 
		<aui:select name="status">
			<aui:option label="Active" value="true"></aui:option>
			<aui:option label="Inactive" value="false"></aui:option>
		</aui:select>
	</aui:fieldset>

<aui:button-row>
       <aui:button name="saveForm" value="Save" type="submit"/>
       <aui:button value="Back" type="button" />
</aui:button-row>

</aui:form>

<aui:script use="aui-base,aui-io-request">
    A.one('#<portlet:namespace/>saveForm').on('click', function(event) {
        var A = AUI();
        var url = '<%=addSubDepartmentActionURL.toString()%>';
        A.io.request(
            url,
            {
                method: 'POST',
                form: {id: '<portlet:namespace/>employeeSubDepartment'},
                on: {
                    success: function() {
                        Liferay.Util.getOpener().refreshPortlet();
                    	
                    }
                }
            }
        );
    });
</aui:script>
