
<%@include file="/html/init.jsp"%>

<head>
<style type="text/css">

	.WebHRForm1 {
    font-family: "Titillium Web",sans-serif;
    font-size: 12px;
    font-weight: normal;
    color: rgb(88, 100, 126);
    border-width: 0px 0px 1px;
    border-style: none none solid;
    border-color: -moz-use-text-color -moz-use-text-color rgb(185, 185, 185);
    background-color: transparent;
	}
	.WebHR_Heading2 {
    font-size: 18px;
    font-weight: normal;
    font-family: "Titillium Web",sans-serif;
    color: rgb(0, 51, 102);
	}
</style >
</head>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"jobLibrary-add-success")){%>
<liferay-ui:success key="jobLibrary-add-success" message="jobLibrary has been added successfully." />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"jobLibrary-add-error")){%>
<liferay-ui:error key="jobLibrary-add-error" message="There is an Error occured while adding jobLibrary please try again" />
<%} %>

<% if(SessionMessages.contains(renderRequest.getPortletSession(),"jobLibrary-update-success")){%>
<liferay-ui:success key="jobLibrary-update-success" message="jobLibrary has been updated successfully." />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"jobLibrary-update-error")){%>
<liferay-ui:error key="jobLibrary-update-error" message="There is an Error occured while updating jobLibrary please try again" />
<%} %>

<%
	JobLibrary joblibrary = (JobLibrary) request
			.getAttribute("joblibrary");
%>
<%
	System.out.println(joblibrary);
System.out.println(joblibrary);
%>
<portlet:actionURL var="addRequisitionURL">
	<portlet:param name="action" value="addRequisition" />
</portlet:actionURL>
<portlet:actionURL var="editRequisitionURL">
	<portlet:param name="action" value="updateRequisition" />
	<c:if test="${joblibrary != null}">
		<portlet:param name="jobLibraryId" value="${joblibrary.jobLibraryId }"/>
	</c:if>
</portlet:actionURL>
<table>
<tbody>
<aui:form method="post" action="<%=(joblibrary == null ? addRequisitionURL : editRequisitionURL)%>"
	commandName="reg">
	 <tr>
    <th class="WebHR_Heading2">ADD JOB REQUISITION FORM</th>
    
  </tr>
  <tr align="left">
    <td width="70%"><aui:select name="employeedepartmentList" label="Department-list"
		>
	<<c:forEach
			items="<%=EmployeeDepartmentLocalServiceUtil
								.getEmployeeDepartments(-1, -1)%>"
			var="employeeDepartment">
			<aui:option value="${employeeDepartment.employeeDepartmentId}"
				selected="${jobLibrary.employeeDepartmentId == employeeDepartment.employeeDepartmentId? 'true' : 'false'}">${employeeDepartment.employeeDepartmentName}</aui:option>
		</c:forEach>
	</aui:select></td>
	 <td><aui:select name="employeeList" label="Report-To:" >
	<<c:forEach
			items="<%=EmployeeMstLocalServiceUtil.getEmployeeMsts(
								-1, -1)%>"
			var="employee">
			<aui:option value="${employeemst.employeeId}"
				selected="${joblibrary.reportsToId == employeemst.employeeId? 'true' : 'false'}">${employeemst.employeeName}</aui:option>
		</c:forEach>
	</aui:select></td>
	</tr>
	<tr>
	<td>
   
    <aui:input  name="jobTitle" type="text"
		required="true" value='${joblibrary==null?"":joblibrary.jobTitle }'
		 label="Job Title " cssClass="WebHRForm1"></aui:input></td>
		 <td>
		<aui:input name="numberOfPosition" type="text" class="WebHRForm1"
		required="true"
		value='${joblibrary==null?"":joblibrary.numberOfPosition }'
		placeholder="numberOfPosition" label="NumberOfPosition " ></aui:input>
		</td>
  </tr>
 
  <tr align="left">
 	<td><aui:input  name="salaryStartRange" type="text"
		required="true"
		value='${joblibrary==null?"":joblibrary.salaryStartRange }'
		placeholder="salaryStartRange" label="SalaryStartRange " cssClass="WebHRForm1"></aui:input></td>
		
		<td ><aui:input  name="salaryEndRange" type="text"
		required="true"
		value='${joblibrary==null?"":joblibrary.salaryEndRange }'
		placeholder="salaryEndRange" label="SalaryEndRange " cssClass="WebHRForm1"></aui:input></td>
  </tr>
  <tr>
  
  <td colspan="2"><label>Job Description::<br></label>
  
  <liferay-ui:input-localized name="jobDescription" xml="" type="editor" required="true" 
		value='${joblibrary==null?"":joblibrary.jobDescription }'
		placeholder="jobDescription"/><br>
  </td>
  
 </tr>
 <tr>
  <td colspan="2"><label>Responsibility::<br> </label><liferay-ui:input-localized name="responsibility" xml="" type="editor" required="true"
		value='${joblibrary==null?"":joblibrary.responsibility }'
		placeholder="responsibility" /><br>
  
  </td>
  </tr>
  <tr>
  
  <td colspan="2"><label>Qualifications::<br></label><liferay-ui:input-localized name="qualifications" xml="" type="editor" required="true"
		value='${joblibrary==null?"":joblibrary.qualifications }'
		placeholder="qualifications"/><br>
    </td>
  
  </tr>
  <tr>
  <td colspan="2"><label>Experience::<br></label><liferay-ui:input-localized name="experience" xml="" type="editor" 
		placeholder="experience" /><br>
  
  </td>
  
  </tr>
  <tr>
  
  <td colspan="2"> <label>Benefits::<br></label><liferay-ui:input-localized name="benefits" xml="" type="editor" required="true" value='${joblibrary==null?"":joblibrary.benefits }'
		placeholder="benefits" />
  
  </td>
  
  </tr>
  <tr>
  <td colspan="2" align="center"><aui:button type="submit" name="submit" value="Save" /></td>
  </tr>
	</aui:form>
</tbody>
 
</table>
