

<%@include file="init.jsp"%>

<%if(SessionMessages.contains(renderRequest.getPortletSession(),"leave-added-successfully")){%>
	<liferay-ui:success key="leave-added-succefully" message="leave has been added successfully"/>
<% }%>

<%if(SessionMessages.contains(renderRequest.getPortletSession(),"leave-update-successfully")){%>
	<liferay-ui:success key="leave-update-successfully" message="leave has been updated successfully"/>

<%} %>
<%if(SessionMessages.contains(renderRequest.getPortletSession(), "leave-delete-successfully")){%>
	
	<liferay-ui:success key="leave-delete-successfully" message="leave has been deleted successfully"/>
	<%} %>
<%if(SessionErrors.contains(renderRequest.getPortletSession(),"leave-update-error")){%>
	
	<liferay-ui:error key="leave-update-error" message="leave can't be updated because u have entered wrong value"/>
	<%}%>

<portlet:renderURL var="add" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="add"/>
</portlet:renderURL>


<%-- <aui:form action="${add}" method="post"  style="float: right;"> --%>
<%-- 	<aui:button name="AddLeaveType"  value="Add Leave Type" id="addLeave" type="submit" /> --%>
<%-- </aui:form> --%>

<div id="leave-link">
	<aui:a href="#" cssClass="add-leave-link" id="addLeave" label="Add Leave Type" />
</div>
<aui:script>
 AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
  
    A.one('#<portlet:namespace/>addLeave').on('click', function(event){
     addleave= Liferay.Util.Window.getWindow(
    		
                {
                    dialog: {
                        centered: true,
                        constrain2view: true,
                        modal: true,
                        resizable: true,
                        width: 1000,
                        height:500,
                    }
                }).plug(A.Plugin.DialogIframe,
                     {
                	
                     autoLoad: false,
                     iframeCssClass: 'dialog-iframe',                     
                     uri:'<%=add.toString()%>'
                     }).render();
     				addleave.show();
    				 addleave.titleNode.html("Add Leave");
     });
   
 }); 
 </aui:script>
 <aui:script>
     Liferay.provide(window, 'refreshPortlet', function() {
         var curPortlet = '#p_p_id<portlet:namespace/>';
         window.location.reload();
     },
     ['aui-dialog','aui-dialog-iframe']
     );
 </aui:script>
 

 <portlet:renderURL var="edit" windowState="<%=LiferayWindowState.POP_UP.toString()%>"> 
 	<portlet:param name="action" value="editleaveURL"/> 
 </portlet:renderURL>
 

 <aui:script >

 AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
 Liferay.provide(window, 'editleaveURL', function(e) {
	 alert(e);
	 var ur='<%=edit.toString()%>'+'&<portlet:namespace/>leaveId=' + e;
	 	    var editleave= Liferay.Util.Window.getWindow(
		                {
		                    dialog: {
		                        centered: true,
		                        constrain2view: true,
		                          modal: true,
		                        resizable: true,
		                        width: 800,
		                        height:800
		                    }
		                }).plug(A.Plugin.DialogIframe,
		                     {
		                     autoLoad: false,
		                     iframeCssClass: 'dialog-iframe',
		                     uri:ur
		                     }).render();
	 	   editleave.show();
	 	  editleave.titleNode.html("Edit Leave");
						 	 
	});
 });
 </aui:script>
 
  

<liferay-portlet:renderURL varImpl="leaveSearchURL">
	<portlet:param name="mvcPath" value="/jsp/display.jsp"/>
</liferay-portlet:renderURL>

<aui:form action="<%=leaveSearchURL %>" method="get" name="leavefm" >
	<liferay-portlet:renderURLParams varImpl="leaveSearchURL"/>
	<liferay-portlet:renderURL varImpl="iteratorURL">
	
		<portlet:param name="leaveName" value="<%=leaveName%>" />
		<portlet:param name="leaveType" value="<%=leaveType %>"/>
		<portlet:param name="leavesAllowedPerYear" value="<%=String.valueOf(leavesAllowedPerYear)%>"/>
		<portlet:param name="carryOver" value="<%=String.valueOf(carryOver)%>"/>
		<portlet:param name="encachement" value="<%=String.valueOf( encachement)%>"/>
		<portlet:param name="Status" value="<%=String.valueOf(Status)%>"/>		
		<portlet:param name="jspPage" value="/jsp/display.jsp"/>

	</liferay-portlet:renderURL>
	
	
<liferay-ui:search-container
	displayTerms="<%=new DisplayTerms(renderRequest)%>"
	emptyResultsMessage="no -leaves"
	iteratorURL="<%=iteratorURL %>"
	delta="5"
	deltaConfigurable="true"
	
>

<liferay-ui:search-form page="/WEB-INF/jsp/Search.jsp"
 						servletContext="<%=application %>" ></liferay-ui:search-form> 
<liferay-ui:search-container-results>
<%
	total=LeaveLocalServiceUtil.getLeavesCount();
	searchContainer.setTotal(total);
	results=LeaveLocalServiceUtil.getLeaves(searchContainer.getStart(), searchContainer.getEnd());
	searchContainer.setResults(results);	
	
	DisplayTerms displayTerms=searchContainer.getDisplayTerms();
	
 	 if(displayTerms.isAdvancedSearch())
 		{	 
 		total=LeaveLocalServiceUtil.getSearchLeavesCount(leaveName, leaveType, leavesAllowedPerYear, carryOver, encachement, Status, displayTerms.isAndOperator(),searchContainer.getStart(),searchContainer.getEnd());
		searchContainer.setTotal(total);
		searchContainer.setResults(LeaveLocalServiceUtil.getSearchLeaves(leaveName, leaveType, leavesAllowedPerYear, carryOver, encachement, Status, displayTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd()));
		
		} 
	 
 	 else
 		 {
	 		
		 		String searchkeywords=displayTerms.getKeywords();
		 		//String numbersearchkeywords=Validator.isNumber(searchkeywords)?searchkeywords;
				String numbersearchkeywords=Validator.isNumber(searchkeywords)?searchkeywords:String.valueOf(0);
				//String boolsearchkeywords=Validator.isNotNull(searchkeywords)?searchkeywords:String.valueOf(0);
				total=LeaveLocalServiceUtil.getSearchLeavesCount(searchkeywords, searchkeywords, Integer.parseInt(numbersearchkeywords), Boolean.parseBoolean(numbersearchkeywords), Boolean.parseBoolean(numbersearchkeywords),Boolean.parseBoolean(numbersearchkeywords),displayTerms.isAndOperator(),searchContainer.getStart(),searchContainer.getEnd());
				//total=SoftEngineerLocalServiceUtil.getSearchEngineersCount(searchkeywords, searchkeywords, searchkeywords, Long.parseLong(numbersearchkeywords), displayTerms.isAndOperator());
				//searchContainer.setResults(SoftEngineerLocalServiceUtil.getSearchEngineers(searchkeywords, searchkeywords, searchkeywords, Long.parseLong(numbersearchkeywords), false, searchContainer.getStart(),searchContainer.getEnd()));
 				searchContainer.setResults(LeaveLocalServiceUtil.getSearchLeaves(searchkeywords, searchkeywords,  Integer.parseInt(numbersearchkeywords), Boolean.parseBoolean(numbersearchkeywords), Boolean.parseBoolean(numbersearchkeywords),Boolean.parseBoolean(numbersearchkeywords),false,searchContainer.getStart(), searchContainer.getEnd()));
 		 }
	

// //   	 
%>

</liferay-ui:search-container-results>
<liferay-ui:search-container-row
 className="Leave"
 keyProperty="leaveId"
 modelVar="currentLeave">



<%-- <% System.out.println("value for currentUser is"+value);%>  --%>
<%--  <liferay-portlet:renderURL varImpl="rowURL"> --%>
 
<%--  	<portlet:param name="backURL" value="<%=currentURL %>"/> --%>
<%--  	<portlet:param name="mvcPath" value="/jsp/display.jsp"/> --%>
<%--  	<portlet:param name="redirect" value="<%=currentURL %>"/> --%>
<%--  	<portlet:param name="leaveId" value="<%=String.valueOf(currentLeave.getLeaveId()) %>"/> --%>
 	
<%-- </liferay-portlet:renderURL> --%>

<liferay-portlet:renderURL var="rowURL">
<portlet:param name="action" value="editleaveURL"/>
<portlet:param name="ID" value="<%=String.valueOf(currentLeave.getLeaveId()) %>"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="deleteleaveURL" var="del">
	<portlet:param name="action" value="deleteleaveURL"/>
	<portlet:param name="ID" value="<%=String.valueOf(currentLeave.getLeaveId()) %>"/>
</liferay-portlet:actionURL>

<liferay-ui:search-container-column-text
	
	name="Title"
	value="<%=currentLeave.getLeaveName()  %>"
	/>

 <liferay-ui:search-container-column-text
	
	name="LeaveType"
	value="<%=currentLeave.getLeaveType()%>"
	  
	/>
  	<liferay-ui:search-container-column-text
    	 
    	name="LeavesAllowedPerYear"   
   	value="<%=String.valueOf(currentLeave.getLeavesAllowedPerYear()) %>" />   
   	
   	 <liferay-ui:search-container-column-text
    	   
    	name="CarryOver"   
   	value="<%=String.valueOf(currentLeave.getCarryOver())%>" />  
   	
   	 <liferay-ui:search-container-column-text
    	  
    	name="Encachement"   
   	value="<%=String.valueOf(currentLeave.getEncachement()) %>" />  
  	
  	<liferay-ui:search-container-column-text
    	   
    	name="Status"   
   	value="<%=String.valueOf(currentLeave.getStatus()) %>" /> 
   	
    	<liferay-ui:search-container-column-text 
    		 
    		href="${rowURL }" >
    			<div id="aui-img">
    				<img src="<%=request.getContextPath()%>/image/edit.png" alt="Edit" onclick="editleaveURL(${currentLeave.getLeaveId()});"/>
    			</div> 
    		</liferay-ui:search-container-column-text> 
   	<liferay-ui:search-container-column-text
   		
   		href="${del }">
   		<div id="aui-img">
   			<img src="<%=request.getContextPath()%>/image/delete.png"  /> 
   		</div>
   		</liferay-ui:search-container-column-text>
   		
	
 </liferay-ui:search-container-row>
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>"></liferay-ui:search-iterator>
</liferay-ui:search-container>
</aui:form>



<style>
	#aui-img{
		max-width:13px;
	}
	#leave-link{
		float:right;
	}
</style>

 

