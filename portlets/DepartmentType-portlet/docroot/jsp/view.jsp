
<%@ include file="/jsp/init.jsp"%>

<!-- session Messages to display on add update delete success or error by their key -->
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"department-add-success")){%>
<liferay-ui:success key="department-add-success"
	message="Department has been added successfully." />
<%} %>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"department-update-success")){%>
<liferay-ui:success key="department-update-success"
	message="Department has been updated successfully." />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"department-update-error")){%>
<liferay-ui:error key="department-update-error"
	message="There is an Error occured while updateing department please try again" />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"department-add-error")){%>
<liferay-ui:error key="department-add-error"
	message="There is an Error occured while adding Department please try again" />
<%} %>

<%
String redirect = ParamUtil.getString(request, "redirect");

long employeeDepartmentId = ParamUtil.getLong(request, "employeeDepartmentId");
String departmentName = ParamUtil.getString(request, "departmentName");
String status = ParamUtil.getString(request, "status");
EmployeeDepartment employeeDepartment = null;
if (employeeDepartmentId > 0) { 
	employeeDepartment = EmployeeDepartmentLocalServiceUtil.getEmployeeDepartment(employeeDepartmentId);
}
%>


<portlet:renderURL var="adddepURL">
	<portlet:param name="name" value="add" />
</portlet:renderURL>

<div class="div-add-department">
	<aui:a href="<%=adddepURL %>" cssClass="add-department-link"
		id="addDepartment" label="Add Department" />
</div>



<liferay-portlet:renderURL varImpl="SearchURL">
	<portlet:param name="action" value="/jsp/view.jsp" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</liferay-portlet:renderURL>


<aui:form action="<%= SearchURL %>" method="get" name="Form">

	<liferay-portlet:renderURLParams varImpl="SearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="departmentNamea" value="<%= departmentNamea %>" />
		<portlet:param name="statusa" value="<%= statusa %>" />
		<portlet:param name="mvcPath" value="/jsp/view.jsp" />
	</liferay-portlet:renderURL>
	<%  String orderByCol = ParamUtil.getString(request, "orderByCol");
		String orderByType = ParamUtil.getString(request, "orderByType");
		
		boolean sort;
		if(orderByType.equals("desc")){
			sort=false;
		}
		else if(orderByType.equals("asc")){
			sort=true;
		}
		else{
			orderByCol="departmentName";
			orderByType="desc";
			sort=false;
		} 

		if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)) {
		portalPrefs.setValue("NAME_SPACE", "order-by-col", orderByCol);
		portalPrefs.setValue("NAME_SPACE", "order-by-type", orderByType);
		
		} else {
		
		orderByCol = portalPrefs.getValue("NAME_SPACE", "order-by-col", "departmentName");
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

		<liferay-ui:search-form page="/jsp/search.jsp"  servletContext="<%=application%>" />

		<liferay-ui:search-container-results>

			<%
				DisplayTerms displayTerms = searchContainer
									.getDisplayTerms();

							if (displayTerms.isAdvancedSearch()) {
								total = EmployeeDepartmentLocalServiceUtil
										.getSearchEmployeeDepartmentsCount(
												departmentNamea, statusa,
												displayTerms.isAndOperator());
								results = EmployeeDepartmentLocalServiceUtil
										.getSerachEmployeeDepartments(
												departmentNamea, statusa,
												displayTerms.isAndOperator(),
												searchContainer.getStart(),
												searchContainer.getEnd(),
												new EmployeeDepartmentComparator(
														sort, orderByCol));
								searchContainer.setTotal(total);
								searchContainer.setResults(results);
								indexno = searchContainer.getStart();

							} else {
								String searchkeywords = displayTerms.getKeywords();
								String numbesearchkeywords = Validator
										.isNumber(searchkeywords) ? searchkeywords
										: String.valueOf(0);
								total = EmployeeDepartmentLocalServiceUtil
										.getSearchEmployeeDepartmentsCount(
												searchkeywords, "",
												displayTerms.isAndOperator());
								results = EmployeeDepartmentLocalServiceUtil
										.getSerachEmployeeDepartments(
												searchkeywords, "", false,
												searchContainer.getStart(),
												searchContainer.getEnd(),
												new EmployeeDepartmentComparator(
														sort, orderByCol));
								searchContainer.setTotal(total);
								searchContainer.setResults(results);
								indexno = searchContainer.getStart();
							}
			%>
		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row className="EmployeeDepartment"
			keyProperty="employeeDepartmentId" modelVar="employeeDepartment1">
			<%
				indexno = indexno + 1;
			%>
			<liferay-ui:search-container-column-text name="Sr. no" valign="top"
				value="<%=String.valueOf(indexno)%>" />

			<liferay-ui:search-container-column-text name="Department Name"
				property="departmentName" valign="top" orderable="<%=true%>"
				orderableProperty="departmentName" />

			<liferay-ui:search-container-column-text name="Status"
				cssClass="department-status" orderable="<%=true%>"
				orderableProperty="status">
				<%
					if (employeeDepartment1.isStatus()) {
				%>
				<img class="state-image"
					src="<%=request.getContextPath()%>/images/icon-check-green.png"
					alt="Active"
					onmouseover="Liferay.Portal.ToolTip.show(this, 'Active');" />
				<%
					} else {
				%>
				<img class="state-image"
					src="<%=request.getContextPath()%>/images/icon-cross-red.png"
					alt="Inactive"
					onmouseover="Liferay.Portal.ToolTip.show(this, 'Inactive');" />
				<%
					}
				%>
			</liferay-ui:search-container-column-text>
			<portlet:renderURL var="editdURL">
				<portlet:param name="name" value="edit" />
				<portlet:param name="employeeDepartmentId" value="${employeeDepartment1.getEmployeeDepartmentId()}" />
			</portlet:renderURL>
			<liferay-ui:search-container-column-text name="Edit"
				cssClass="department-edit-link department-status" href="<%=editdURL %>">
				<img src="<%=request.getContextPath()%>/images/icon-edit.png"
					class="state-image edit-icon" alt="Edit" />
			</liferay-ui:search-container-column-text>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>
</aui:form>
