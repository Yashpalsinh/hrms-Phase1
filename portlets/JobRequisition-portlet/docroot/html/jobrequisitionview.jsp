<%@ include file="/html/init.jsp"%>
<head>
	<style type="text/css">
		
		.imgstate-image {
	width: 20px;
	height: 20px;
}

.requisition-status {
	text-align: center !important;
}

.edit-icon, .delete-icon, .view-icon{
	opacity: 0.09  !important;
	
}

.requisition-edit-link:HOVER>a>img{
	opacity: 1.0  !important;
}

.div-add-requisition>a.add-requisition-link {
	float: right;
	font-weight: 600;
	text-decoration: none;
	COLOR: #C2A27A;
	text-transform: uppercase;
	padding: 7px 16px;
}

.div-add-requisition:HOVER>a.add-requisition-link {
	color: #EEFEEF;
	background: #535353;
	text-transform: uppercase;
}
	</style>
</head>




<% if(SessionMessages.contains(renderRequest.getPortletSession(),"jobLibrary-delete-success")){%>
<liferay-ui:success key="jobLibrary-delete-success" message="jobLibrary has been deleted successfully." />
<%} %>
<% if(SessionErrors.contains(renderRequest.getPortletSession(),"jobLibrary-delete-error")){%>
<liferay-ui:error key="jobLibrary-delete-error" message="There is an Error occured while deleting job library please try again" />
<%} %>
<portlet:renderURL var="formURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="render" value="createJobRequisition" />
</portlet:renderURL>
<portlet:renderURL  var="editdURL"  windowState="<%=LiferayWindowState.POP_UP.toString()%>">
		<portlet:param name="render" value="editJobLibraryDisplay"/>
</portlet:renderURL>

<aui:script >

 AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
 Liferay.provide(window, 'editJobLibraryDisplay', function(e) {
	 var ur='<%=editdURL.toString()%>'+'&<portlet:namespace/>jobLibraryId=' + e;
	 	    var editjobLibrary= Liferay.Util.Window.getWindow(
		                {
		                    dialog: {
		                        centered: true,
		                        constrain2view: true,
		                          modal: true,
		                          resizable: true,
		                          width:600,
		                          height:700,
		                    }
		                }).plug(A.Plugin.DialogIframe,
		                     {
		                     autoLoad: false,
		                     iframeCssClass: 'dialog-iframe',
		                     uri:ur
		                     }).render();
	 	  			 editjobLibrary.show();
	 	  			 editjobLibrary.titleNode.html("Edit Requisition");
	});
 });
 </aui:script>

<div align="right" class="div-add-requisition">
		<aui:a href="#" cssClass="div-add-requisition add-requisition-link" title="add-requisition" label="add-requisition" id="addrequisition"/>
	
</div>
<aui:script>
AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
  
    A.one('#<portlet:namespace/>addrequisition').on('click', function(event){
     addrequisition= Liferay.Util.Window.getWindow(
    		
                {
                    dialog: {
                        centered: true,
                        constrain2view: true,
                        modal: true,
                        resizable: true,
                        width:600,
                        height:700,
                        
                    }
                }).plug(A.Plugin.DialogIframe,
                     {
                	
                     autoLoad: false,
                     iframeCssClass: 'dialog-iframe',                     
                     uri:'<%=formURL.toString()%>'
                     }).render();
    				 addrequisition.show();
    				 addrequisition.titleNode.html("Add Requisition");
                    
 
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
 <portlet:renderURL  var="viewURL"  windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="render" value="viewJobLibrary" />
</portlet:renderURL>
<aui:script >

 AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
 Liferay.provide(window, 'viewJobLibrary', function(e) {
	 var ur='<%=viewURL.toString()%>'+'&<portlet:namespace/>jobLibraryId=' + e;
	 	    var viewjobLibrary= Liferay.Util.Window.getWindow(
		                {
		                    dialog: {
		                        centered: true,
		                        constrain2view: true,
		                          modal: true,
		                          resizable: true,
		                          width:600,
		                          height:400,
		                    }
		                }).plug(A.Plugin.DialogIframe,
		                     {
		                     autoLoad: false,
		                     iframeCssClass: 'dialog-iframe',
		                     uri:ur
		                     }).render();
	 	   		viewjobLibrary.show();
	 	  		viewjobLibrary.titleNode.html("Detail Requisition");
	});
 });
 </aui:script>

<liferay-portlet:renderURL varImpl="joblibrarySearchURL" />
	<aui:form method="post">
		

		<liferay-portlet:renderURLParams varImpl="joblibrarySearchURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
				<portlet:param name="jobTitle" value="<%=jobTitle %>" />
				<portlet:param name="jobDescription" value="<%=jobDescription %>" />
<%-- 				<portlet:param name="responsibility" value="<%=responsibility %>" /> --%>
</liferay-portlet:renderURL>

<liferay-ui:search-container delta="5" iteratorURL="<%=iteratorURL%>" deltaConfigurable="true" displayTerms="<%=new DisplayTerms(renderRequest)%>" emptyResultsMessage="No Requisition Found" 
	total="<%=JobLibraryLocalServiceUtil.getJobLibrariesCount()%>" >
	<liferay-ui:search-form page="/html/joblibrarySearch.jsp" servletContext="<%=application %>">
	
	</liferay-ui:search-form>
	<liferay-ui:search-container-results>
	
 
                     <%
	DisplayTerms displayTerms =searchContainer.getDisplayTerms();
	if (displayTerms.isAdvancedSearch()) {
	total = JobLibraryLocalServiceUtil.getSearchJobLibraryCount(jobTitle,displayTerms.isAndOperator());
	searchContainer.setTotal(total);
	searchContainer.setResults(JobLibraryLocalServiceUtil.getSearchJoblibrary(jobTitle,displayTerms.isAndOperator(),searchContainer.getStart(),searchContainer.getEnd()));
	}
	else {
	String searchkeywords = displayTerms.getKeywords();
	
	total = JobLibraryLocalServiceUtil.getSearchJobLibraryCount(jobTitle,displayTerms.isAndOperator());
	searchContainer.setResults(JobLibraryLocalServiceUtil.getSearchJoblibrary(searchkeywords,false,searchContainer.getStart(),searchContainer.getEnd()));
	}
	
	%> 
    </liferay-ui:search-container-results>
        <liferay-ui:search-container-row
        className="com.hrms.model.JobLibrary"
        keyProperty="jobLibraryId" modelVar="currentJobLibrary" indexVar="loop">
        
       <portlet:actionURL var="deleteURL">
					<portlet:param name="action" value="deleteJobLibrary" />
					<portlet:param name="jobLibraryId"
						value="<%= String.valueOf(currentJobLibrary.getJobLibraryId()) %>" />
				</portlet:actionURL>
<%--          <portlet:renderURL var="viewURL"> --%>
<%-- 					<portlet:param name="render" value="viewJobLibrary" /> --%>
<%-- 					<portlet:param name="jobLibraryId" --%>
<%-- 						value="<%= String.valueOf(currentJobLibrary.getJobLibraryId()) %>" /> --%>
<%-- 				</portlet:renderURL> --%>
   
        <liferay-ui:search-container-column-text name="Sr no."  value="${loop+1}" />        
            <liferay-ui:search-container-column-text name="jobTitle" property="jobTitle" />     
             <liferay-ui:search-container-column-text name="jobDescription" property="jobDescription" />
             
        
			<liferay-ui:search-container-column-text cssClass="requisition-edit-link requisition-status">
			<img src="<%=request.getContextPath()%>/images/icon-edit.png" class="imgstate-image edit-icon" alt="Edit" onclick="editJobLibraryDisplay(${currentJobLibrary.getJobLibraryId()});"/>
					</liferay-ui:search-container-column-text>
		
		
			<liferay-ui:search-container-column-text href="<%=deleteURL %>" cssClass="requisition-edit-link requisition-status">
			<img src="<%=request.getContextPath()%>/images/icon-delete.png" class="imgstate-image delete-icon requisition-edit-link img" />
					</liferay-ui:search-container-column-text>
					
			<liferay-ui:search-container-column-text cssClass="requisition-edit-link requisition-status">
			<img src="<%=request.getContextPath()%>/images/view.jpeg" class="imgstate-image view-icon requisition-edit-link img" onclick="viewJobLibrary(${currentJobLibrary.getJobLibraryId()});"/>
					</liferay-ui:search-container-column-text>
		   </liferay-ui:search-container-row>
    <liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
    
   
</liferay-ui:search-container> 
</aui:form>


 
 
