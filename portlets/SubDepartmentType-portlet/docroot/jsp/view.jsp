
<%@ include file="/jsp/init.jsp" %>

<!-- session Messages to display on add update delete success or error by their key -->
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"subdepartment-add-success")){%>
<liferay-ui:success key="subdepartment-add-success" message="Sub Department has been added successfully." />
<%} %>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"subdepartment-update-success")){%>
<liferay-ui:success key="subdepartment-update-success" message="Department has been updated successfully." />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"subdepartment-add-error")){%>
<liferay-ui:error key="subdepartment-add-error" message="There is an Error occured while adding Sub Department please try again" />
<%} %>

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"department-update-error")){%>
<liferay-ui:error key="department-update-error" message="There is an Error occured while updateing department please try again" />
<%} %>

<%
String redirect = ParamUtil.getString(request, "redirect");
long employeeSubDepartmentId = ParamUtil.getLong(request, "employeeSubDepartmentId");
long employeeDepartmentId = ParamUtil.getLong(request, "employeeDepartmentId");
String subDepartmentName = ParamUtil.getString(request, "subDepartmentName");
String status = ParamUtil.getString(request, "status");
EmployeeSubDepartment employeeSubDepartment = null;
if (employeeSubDepartmentId > 0) { 
	employeeSubDepartment = EmployeeSubDepartmentLocalServiceUtil.getEmployeeSubDepartment(employeeSubDepartmentId);
}
%>

<portlet:renderURL  var="adddepURL">
		<portlet:param name="name" value="add" />
</portlet:renderURL>
<div class="div-add-department">
	<aui:a href="<%=adddepURL %>" cssClass="add-department-link" id="addSubDepartment" label="Add Sub Department" />	
</div>

<liferay-portlet:renderURL varImpl="SearchURL">
<portlet:param name="action" value="/jsp/view.jsp" />
<portlet:param name="redirect" value="<%= currentURL %>" />
</liferay-portlet:renderURL>
 

<aui:form action="<%= SearchURL %>" method="get" name="Form">

<liferay-portlet:renderURLParams varImpl="SearchURL" />
<liferay-portlet:renderURL varImpl="iteratorURL">

<portlet:param name="subDepartmentNamea" value="<%= subDepartmentNamea %>"  />
<portlet:param name="statusa" value="<%= statusa %>" /> 
<portlet:param name="mvcPath" value="/jsp/view.jsp" />
</liferay-portlet:renderURL>
<%
String orderByCol = ParamUtil.getString(request, "orderByCol");
String orderByType = ParamUtil.getString(request, "orderByType");

boolean sort;
if(orderByType.equals("desc")){
	sort=false;
}
else if(orderByType.equals("asc")){
	sort=true;
}
else{
	orderByCol="subDepartmentName";
	orderByType="desc";
	sort=false;
} 

if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)) {
portalPrefs.setValue("NAME_SPACE", "order-by-col", orderByCol);
portalPrefs.setValue("NAME_SPACE", "order-by-type", orderByType);

} else {

orderByCol = portalPrefs.getValue("NAME_SPACE", "order-by-col", "subDepartmentName");
orderByType = portalPrefs.getValue("NAME_SPACE", "order-by-type", "asc");

}
int indexno=0;
%>

<liferay-ui:search-container displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="no-data-were-found"
		iteratorURL="<%= iteratorURL %>"
		delta="5"
		orderByCol="<%= orderByCol %>" 
		orderByType="<%= orderByType %>" >
				
<liferay-ui:search-form
			page="/jsp/search.jsp"
			servletContext="<%= application %>"/>
		
	<liferay-ui:search-container-results > 
	
	<%		
			  DisplayTerms displayTerms =searchContainer.getDisplayTerms();
			
				if (displayTerms.isAdvancedSearch()) {
					total = EmployeeSubDepartmentLocalServiceUtil.getSearchEmployeeSubDepartmentsCount(subDepartmentNamea,statusa,employeeDepartmentIda,displayTerms.isAndOperator());
					//results=EmployeeSubDepartmentLocalServiceUtil.getSubDepartment(searchContainer.getStart(), searchContainer.getEnd());System.out.println(results); 
					results=EmployeeSubDepartmentLocalServiceUtil.getSerachEmployeeSubDepartments(subDepartmentNamea,statusa,employeeDepartmentIda,displayTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd(), new EmployeeSubDepartmentComparator(sort, orderByCol));
					searchContainer.setTotal(total);
					searchContainer.setResults(results);
					indexno=searchContainer.getStart();
					
					} 
				else { 
					String searchkeywords = displayTerms.getKeywords();
					long did=0;
					String numbesearchkeywords = Validator.isNumber(searchkeywords) ? searchkeywords : String.valueOf(0);
					 
					total = EmployeeSubDepartmentLocalServiceUtil.getSearchEmployeeSubDepartmentsCount(searchkeywords,"",did,displayTerms.isAndOperator());					
					results=EmployeeSubDepartmentLocalServiceUtil.getSerachEmployeeSubDepartments(searchkeywords,"",did,false, searchContainer.getStart(), searchContainer.getEnd(), new EmployeeSubDepartmentComparator(sort, orderByCol));
					searchContainer.setTotal(total);
					searchContainer.setResults(results);
					indexno=searchContainer.getStart();
					   
				}
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row 
		className="EmployeeSubDepartment"
		keyProperty="employeeSubDepartmentId"
		modelVar="employeeSubDepartment1"
	>
	<% indexno=indexno+1; %>
	<liferay-ui:search-container-column-text name="Sr. no" valign="top"	value="<%= String.valueOf(indexno) %>" />
		
	<liferay-ui:search-container-column-text
		name="Sub Department Name"
		property="subDepartmentName"
		valign="top"
		orderable="<%= true %>"
		orderableProperty="subDepartmentName"
	/>
	<liferay-ui:search-container-column-text
		name="Department Name"
		valign="top"
	>
	<%EmployeeDepartment dname = EmployeeDepartmentLocalServiceUtil.findByemployeeDepartmentId(employeeSubDepartment1.getEmployeeDepartmentId()); %>
	<%=dname.getDepartmentName() %>
	</liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text
		name="Status"
		cssClass="department-status"
		orderable="<%= true %>"
		orderableProperty="status"
		>
		<% if(employeeSubDepartment1.isStatus()) { %>
			<img class="state-image"  src="<%=request.getContextPath()%>/images/icon-check-green.png" alt="Active" onmouseover="Liferay.Portal.ToolTip.show(this, 'Active');"/>
		<% } else { %>
			<img class="state-image" src="<%=request.getContextPath()%>/images/icon-cross-red.png" 	alt="Inactive" onmouseover="Liferay.Portal.ToolTip.show(this, 'Inactive');"/>
		<% } %>
	</liferay-ui:search-container-column-text>

			<portlet:renderURL var="editdURL">
				<portlet:param name="name" value="edit" />
				<portlet:param name="employeeSubDepartmentId" value="${employeeSubDepartment1.getEmployeeSubDepartmentId()}" />
			</portlet:renderURL>
			<liferay-ui:search-container-column-text name="Edit"
				cssClass="department-edit-link department-status" href="<%=editdURL %>">
				<img src="<%=request.getContextPath()%>/images/icon-edit.png"
					class="state-image edit-icon" alt="Edit" />
			</liferay-ui:search-container-column-text>
 
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" /> 
</liferay-ui:search-container>
</aui:form>
