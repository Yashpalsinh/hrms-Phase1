<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hrms.service.EmployeeTimesheetLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@include file="init.jsp"%>

<liferay-portlet:renderURL varImpl="timesheetSearchURL" />

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/custom.css" />

<aui:form method="post"> 

	<liferay-portlet:renderURLParams varImpl="timesheetSearchURL" />
	
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<liferay-portlet:param name="taskDescription" value="<%=taskDescription %>"/>
		<liferay-portlet:param name="taskTitle" value="<%=taskTitle %>"/>
	</liferay-portlet:renderURL>
	
	<portlet:renderURL var="addTimesheetURL">
		<portlet:param name="render" value="addTimesheet"/>
	</portlet:renderURL>
	
	<div class="div-add-timesheet">
		<aui:a href="<%=addTimesheetURL%>" cssClass="add-timesheet-link" label="Add Timesheet" />
	</div>
	
	<% SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy"), 
		timeFormat = new SimpleDateFormat("hh:mm a");%>
		
	<liferay-ui:search-container delta="20" deltaConfigurable="true" iteratorURL="<%=iteratorURL%>" 
		displayTerms="<%=new DisplayTerms(renderRequest)%>" emptyResultsMessage="No Timesheets Found">
		<liferay-ui:search-form page="/html/jsp/TimesheetSearch.jsp" servletContext="<%=application %>" />
		<liferay-ui:search-container-results>
		<%
			
// 			System.out.println(EmployeeTimesheetLocalServiceUtil.getEmployeeTimesheetsCount());
			
			DisplayTerms displayTerms = searchContainer.getDisplayTerms();
			if(displayTerms.isAdvancedSearch())
			{	
				total = EmployeeTimesheetLocalServiceUtil.getTimesheetCount(taskTitle, taskDescription, 
						displayTerms.isAndOperator());
				results = EmployeeTimesheetLocalServiceUtil.getTimesheets(taskTitle, taskDescription, displayTerms.isAndOperator(), 
						searchContainer.getStart(), searchContainer.getEnd());
				System.out.println(total + "\n" + results);
						//searchContainer.getStart(), searchContainer.getEnd());
			}
			else
			{
				total = EmployeeTimesheetLocalServiceUtil.getEmployeeTimesheetsCount();
				results = EmployeeTimesheetLocalServiceUtil.getEmployeeTimesheets(searchContainer.getStart(), searchContainer.getEnd());
				System.out.println(total + "\n" + results);
// 						searchContainer.getStart(), searchContainer.getEnd());
			}
			/* total = EmployeeTimesheetLocalServiceUtil.getEmployeeTimesheetsCount();
			results = EmployeeTimesheetLocalServiceUtil.getEmployeeTimesheets(
					searchContainer.getStart(), searchContainer.getEnd()); */
			searchContainer.setTotal(total);
			searchContainer.setResults(results);
			
			/* DisplayTerms displayTerms = searchContainer.getDisplayTerms();
			if(displayTerms.isAdvancedSearch())
			{
				total = EmployeeTimesheetLocalServiceUtil.getTimesheetCount(taskTitle, 
							taskDescription, displayTerms.isAndOperator());
				
				results = EmployeeTimesheetLocalServiceUtil.getTimesheets(taskTitle, 
							taskDescription, displayTerms.isAndOperator(), 
							searchContainer.getStart(), searchContainer.getEnd());
				searchContainer.setTotal(total);
				searchContainer.setResults(results);
			}
			else
			{
				

				/* String searchkeywords = displayTerms.getKeywords();
				total = EmployeeTimesheetLocalServiceUtil.getTimesheetCount(searchkeywords, 
						searchkeywords, false);
				searchContainer.setTotal(total);
				results = EmployeeTimesheetLocalServiceUtil.getTimesheets(searchkeywords, 
							searchkeywords, false,
							searchContainer.getStart(), searchContainer.getEnd());
				searchContainer.setResults(results);
			} */
		%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row
			className="com.hrms.model.EmployeeTimesheet" keyProperty="timesheetId"
			modelVar="currentTimesheet">

			<portlet:renderURL var="editTimesheetURL">
				<portlet:param name="render" value="editTimesheet" />
				<portlet:param name="timesheetId"
					value="<%=String.valueOf(currentTimesheet.getTimesheetId())%>" />
			</portlet:renderURL>

			<portlet:actionURL var="deleteTimesheetURL">
				<portlet:param name="action" value="deleteTimesheet"/>
				<portlet:param name="timesheetId"
					value="<%=String.valueOf(currentTimesheet.getTimesheetId())%>" />
			</portlet:actionURL>

			<liferay-ui:search-container-column-text name="Date">
				<%=dateFormat.format(currentTimesheet.getTaskDate()) %>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="User" 
				value="<%=UserLocalServiceUtil.getUser(currentTimesheet.getUserId()).getFullName()%>" />
			<liferay-ui:search-container-column-text name="Description"
				property="taskTitle" value="<%=currentTimesheet.getTaskTitle()%>" />
			<liferay-ui:search-container-column-text 
				name="Start Time">
				<%=timeFormat.format(currentTimesheet.getTaskStarttime())%>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="End Time">
				<%=timeFormat.format(currentTimesheet.getTaskEndtime())%>
			</liferay-ui:search-container-column-text>
				
			<%-- For Billable --%>
			<liferay-ui:search-container-column-text name="Billable" cssClass="task-billable">
				<% if(currentTimesheet.isBillable()) { %>
					<img class="state-image" src="<%=request.getContextPath()%>/images/icon-check-green.png" 
						alt="Checked" />
				<% } else { %>
					<img class="state-image" src="<%=request.getContextPath()%>/images/icon-cross-red.png" 
						alt="Unchecked" />
				<% } %>
			</liferay-ui:search-container-column-text>
			
			
			<%-- For Billed --%>
			<liferay-ui:search-container-column-text name="Billed" cssClass="task-billed">
				<% if(currentTimesheet.isBilled()) { %>
					<img class="state-image" src="<%=request.getContextPath()%>/images/icon-check-green.png" 
						alt="Checked" />
				<% } else { %>
					<img class="state-image" src="<%=request.getContextPath()%>/images/icon-cross-red.png" 
						alt="Unchecked" />
				<% } %>
			</liferay-ui:search-container-column-text>
			
			<liferay-ui:search-container-column-text name="Time Duration"
				property="duration" value="<%=String.valueOf(currentTimesheet.getDuration())%>" />
			
			<%-- For Task Completion --%>
			<liferay-ui:search-container-column-text name="Completed" cssClass="task-completed">
				<% if(currentTimesheet.isTaskCompleted()) { %>
						<label>Completed</label>
				<% } else { %>
						<aui:a href="#">Complete</aui:a>
				<% } %>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text href="<%=editTimesheetURL%>" cssClass="timesheet-edit-link">
				<img src="<%=request.getContextPath()%>/images/icon-edit.png" class="state-image edit-icon" alt="Edit"/>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text href="<%=deleteTimesheetURL%>" cssClass="timesheet-delete-link">
				<img src="<%=request.getContextPath()%>/images/icon-delete.png" class="state-image delete-icon" alt="Delete"/>
			</liferay-ui:search-container-column-text>
			
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>

</aui:form>