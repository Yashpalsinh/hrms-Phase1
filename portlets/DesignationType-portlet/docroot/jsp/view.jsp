
<%@ include file="/jsp/init.jsp" %>

<!-- session Messages to display on add update delete success or error by their key -->
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"designation-add-success")){%>
<liferay-ui:success key="designation-add-success" message="Designation has been added successfully." />
<%} %>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"designation-update-success")){%>
<liferay-ui:success key="designation-update-success" message="Designation has been updated successfully." />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"designation-add-error")){%>
<liferay-ui:error key="designation-add-error" message="There is an Error occured while adding Designation please try again" />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"designation-update-error")){%>
<liferay-ui:error key="designation-update-error" message="There is an Error occured while updateing designation please try again" />
<%} %>

<%
String redirect = ParamUtil.getString(request, "redirect");

long employeeDesignationId = ParamUtil.getLong(request, "employeeDesignationId");
String designationName = ParamUtil.getString(request, "designationName");
String status = ParamUtil.getString(request, "status");
EmployeeDesignation employeeDesignation = null;
if (employeeDesignationId > 0) { 
	employeeDesignation = EmployeeDesignationLocalServiceUtil.getEmployeeDesignation(employeeDesignationId);
}
%>

<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<portlet:renderURL  var="adddesURL" >
		<portlet:param name="name" value="add" />
</portlet:renderURL>
<div class="div-add-designation">
	<aui:a href="<%=adddesURL %>" cssClass="add-designation-link" id="addDesignation" label="Add Designation" />	
</div>

<liferay-portlet:renderURL varImpl="SearchURL">
<portlet:param name="action" value="/jsp/view.jsp" />
<portlet:param name="redirect" value="<%= currentURL %>" />
</liferay-portlet:renderURL>

<aui:form action="<%= SearchURL %>" method="get" name="Form">

<liferay-portlet:renderURLParams varImpl="SearchURL" />
<liferay-portlet:renderURL varImpl="iteratorURL">

<portlet:param name="designationNamea" value="<%= designationNamea %>"  />
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
	orderByCol="designationName";
	orderByType="desc";
	sort=false;
} 

if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)) {
portalPrefs.setValue("NAME_SPACE", "order-by-col", orderByCol);
portalPrefs.setValue("NAME_SPACE", "order-by-type", orderByType);

} else {

orderByCol = portalPrefs.getValue("NAME_SPACE", "order-by-col", "designationName");
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
					total = EmployeeDesignationLocalServiceUtil.getSearchEmployeeDesignationsCount(designationNamea,statusa,displayTerms.isAndOperator());
					results=EmployeeDesignationLocalServiceUtil.getSerachEmployeeDesignations(designationNamea,statusa,displayTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd(), new EmployeeDesignationComparator(sort, orderByCol));
					searchContainer.setTotal(total);
					searchContainer.setResults(results);
					indexno=searchContainer.getStart();
					
					} 
				else { 
					String searchkeywords = displayTerms.getKeywords();
					String numbesearchkeywords = Validator.isNumber(searchkeywords) ? searchkeywords : String.valueOf(0);
					total = EmployeeDesignationLocalServiceUtil.getSearchEmployeeDesignationsCount(searchkeywords,"",displayTerms.isAndOperator());					
					results=EmployeeDesignationLocalServiceUtil.getSerachEmployeeDesignations(searchkeywords,"",false, searchContainer.getStart(), searchContainer.getEnd(), new EmployeeDesignationComparator(sort, orderByCol)); 
					searchContainer.setTotal(total);
					searchContainer.setResults(results); 
					indexno=searchContainer.getStart();} 
				
				
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row 
		className="EmployeeDesignation"
		keyProperty="employeeDesignationId"
		modelVar="employeeDesignation1"
	>
	<% indexno=indexno+1; %>
	<liferay-ui:search-container-column-text  name="Sr. no" valign="top"	value="<%= String.valueOf(indexno) %>" />
		
	<liferay-ui:search-container-column-text
		name="Designation Name"
		property="designationName"
		valign="top"
		orderable="<%= true %>"
		orderableProperty="designationName"
	/>
	
	<liferay-ui:search-container-column-text
		name="Status"
		cssClass="designation-status"
		orderable="<%= true %>"
		orderableProperty="status"
		>
		<% if(employeeDesignation1.isStatus()) { %>
			<img class="state-image"  src="<%=request.getContextPath()%>/images/icon-check-green.png" alt="Active" onmouseover="Liferay.Portal.ToolTip.show(this, 'Active');"/>
		<% } else { %>
			<img class="state-image" src="<%=request.getContextPath()%>/images/icon-cross-red.png" 	alt="Inactive" onmouseover="Liferay.Portal.ToolTip.show(this, 'Inactive');"/>
		<% } %>
	</liferay-ui:search-container-column-text>
	
	<portlet:renderURL var="editdURL">
			<portlet:param name="name" value="edit" />
			<portlet:param name="employeeDesignationId" value="${employeeDesignation1.getEmployeeDesignationId()}" />
	</portlet:renderURL>
			<liferay-ui:search-container-column-text name="Edit"
				cssClass="designation-edit-link designation-status" href="<%=editdURL %>">
				<img src="<%=request.getContextPath()%>/images/icon-edit.png"
					class="state-image edit-icon" alt="Edit" />
			</liferay-ui:search-container-column-text>
	
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>
</aui:form>
