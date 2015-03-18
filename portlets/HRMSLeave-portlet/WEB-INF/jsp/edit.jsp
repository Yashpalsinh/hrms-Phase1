<%@ include file="init.jsp" %>

 <%
	String ID=request.getParameter("ID");
	System.out.println(ID);
	Leave leave=LeaveLocalServiceUtil.getLeave(Long.parseLong(ID));
%> 

<portlet:actionURL var="editURL">
	<portlet:param name="action" value="editURL"/>
</portlet:actionURL>

<portlet:renderURL var="displayURL">
	<portlet:param name="action" value="displayURL"/>
</portlet:renderURL>

<aui:form method="Post" action="${editURL}" name="editFm">
	 <aui:layout>
		<aui:column style="float:right;">
			<aui:a href="<%=displayURL  %>" >Back</aui:a>
		
		</aui:column>
		<aui:column style="font-family: monospace;
font-size: 23px; float:left;" >
			Leaves Types	
		</aui:column>
		<br>
			
			<div align="center">Edit Leave Type</div>
		
		
		</aui:layout>
		<aui:layout>
		<aui:column >
			<div id="textBox">
				<aui:input name="ID" type="hidden" value="<%=ID %>"></aui:input>
				<aui:input name="leaveName" value="<%=leave.getLeaveName() %>" label="Title" type="text" inlineLabel="true"/>
			
				<aui:input name="LeavesAllowedPerYear" value="<%=String.valueOf(leave.getLeavesAllowedPerYear()) %>" label="LeavesAllowedPerYear" type="int" inlineLabel="true"   last="true"/>
			</div>
			<div></div>
			<div id="drop">
			<aui:select  label="LeaveType" name="LeaveType" id="selectedLeave" inlineLabel="true" >
				<aui:option value="Paid Leave" >Paid Leave</aui:option>
				<aui:option  value="Unpaid Leave">Unpaid Leave</aui:option>
			</aui:select>
			</div>
		</aui:column>
	
	
		<aui:column style="float:right;">
		<div id="drop">
			<aui:select label="carryOver" name="carryOver" inlineLabel="true" cssClass="drop">
				<aui:option  value="yes">yes</aui:option>
				<aui:option  value="no">no</aui:option>
			</aui:select>
			
			
			<aui:select label="encachement" name="encachement" inlineLabel="true">
				<aui:option  value="yes">yes</aui:option>
				<aui:option  value="no">no</aui:option>
			</aui:select>
			
			<aui:select  label="Status" name="Status" inlineLabel="true">
				<aui:option  value="yes" name="Active">Active</aui:option>
				<aui:option  value="no" name="Inactive">Inactive</aui:option>
			</aui:select>
		</div>
		</aui:column>
		
	</aui:layout>
	<div align="center">
		<aui:button name="Edit Leave Type" id="EditLeave" value="Edit Leave Type" inlineLabel="true" align="center" />
	</div>
 
	</aui:form>

<style>

.control-label{
	width:180px;
}
  #textBox .field{ 
 	border-top: 0px; 
 	border-right: 0px; 
 	border-left: 0px; 
 	border-bottom: 1px solid; 
 } 
 #drop .aui-field-select {
border-top: 0px;
border-right: 0px;
border-left: 0px;
border-bottom: 1px solid;
}
#Head{
	
}
</style>

<aui:script use="aui-base,aui-io-request">
    A.one('#<portlet:namespace/>EditLeave').on('click', function(event) {
        var A = AUI();
        var url = '<%=editURL.toString()%>';
        A.io.request(
            url,
            {
                method: 'POST',
                form: {id: '<portlet:namespace/>editFm'},
                on: {
                    success: function() {
                        Liferay.Util.getOpener().refreshPortlet();
                    	
                    }
                }
            }
        );
    });
</aui:script>