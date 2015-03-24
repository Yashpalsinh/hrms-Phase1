<%@ include file="/jsp/init.jsp" %>
<!-- session Messages to display on add update delete success or error by their key -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<portlet:actionURL var="addEmployeeActionURL">
	<portlet:param name="action" value="addEmployee" />
</portlet:actionURL>

<portlet:resourceURL var="rendershowsubdep"  id="rendershowsubdep"/>



<portlet:renderURL  var="showsubdepURL"  >
		<portlet:param name="name" value="showsubdep" />
</portlet:renderURL>
<%
String redirect = ParamUtil.getString(request, "redirect");



Calendar birthdayCalendar = CalendarFactoryUtil.getCalendar();

birthdayCalendar.set(Calendar.MONTH, Calendar.JANUARY); 
birthdayCalendar.set(Calendar.DATE, 1);
birthdayCalendar.set(Calendar.YEAR, 1970); 
%>

<!-- <script type="text/javascript">
$('.bday').each(function() {alert(i);
    $(this).datepicker({ 
            dateFormat      : $(this).data('dateformat'),
            showButtonPanel : true,
            changeMonth     : true,
            changeYear      : true,
            defaultDate     : new Date(),
            changeMonth     : true,
            changeYear      : true
     });
});
</script>
 -->
 <aui:script use="aui-base,aui-io-request">
    A.one('#<portlet:namespace/>saveForm').on('click', function(event) {
        var A = AUI();
        var url = '<%=addEmployeeActionURL.toString()%>';
        A.io.request(
            url,
            {
                method: 'POST',
                form: {id: '<portlet:namespace/>employeeRegistration'},
                on: {
                    success: function() {
                        Liferay.Util.getOpener().refreshPortlet();
                    	
                    }
                }
            }
        );
    });
</aui:script>
 
<aui:script>

YUI().use('aui-datepicker', function (Y) {
	   var datePicker = new Y.DatePicker({
	        trigger: '#<portlet:namespace/>bday',
	        popover: {
	            zIndex: 1,
	            boundingBox: '#bb',
	            contentBox: '#cb'
	        }
	    });

	    Y.one('#button1').on('click', function(event) {
	        datePicker.getCalendar().subtractYear();
	    });

	    Y.one('#button2').on('click', function(event) {
	        datePicker.getCalendar().addYear();
	    });
	});
</aui:script>

<aui:script >

 function showSub(deptId){
			  
	 $.ajax({
			 url: '<%=rendershowsubdep.toString()%>'+'&<portlet:namespace/>employeeSubDepartmentId='+deptId, 
			 dataType: 'json',
			 success: function(result){
				 
				 var opt="<select name='<portlet:namespace/>employeeSubDepartmentId' label='Sub Department Name' id='<portlet:namespace/>employeeSubDepartmentId' >";
				 for(i=0;i<result.data.length;i++){
					 opt+="<option  value="+result.data[i].subDepId+">"+result.data[i].subDepName+"</option>";
				 }
				 opt+="</select>";
				 $("#updatedSub").html(opt);
				
		    }});
	  }

</aui:script>


<aui:form  method="post" name="employeeRegistration" id="employeeRegistration">
	<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.ADD %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

	<liferay-ui:error exception="<%= UserEmailAddressException.class %>" message="please-enter-a-valid-email-address" />
	<liferay-ui:error exception="<%= UserIdException.class %>" message="please-enter-a-valid-user-id" />

	<liferay-ui:error exception="<%= UserPasswordException.class %>">

		<%
		UserPasswordException upe = (UserPasswordException)errorException;
		%>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_CONTAINS_TRIVIAL_WORDS %>">
			<liferay-ui:message key="that-password-uses-common-words-please-enter-in-a-password-that-is-harder-to-guess-i-e-contains-a-mix-of-numbers-and-letters" />
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_INVALID %>">
			<liferay-ui:message key="that-password-is-invalid-please-enter-in-a-different-password" />
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_LENGTH %>">
 
			<%
			PasswordPolicy passwordPolicy = PasswordPolicyLocalServiceUtil.getDefaultPasswordPolicy(company.getCompanyId());
			%>

			<%= LanguageUtil.format(pageContext, "that-password-is-too-short-or-too-long-please-make-sure-your-password-is-between-x-and-512-characters", String.valueOf(passwordPolicy.getMinLength()), false) %>
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_TOO_TRIVIAL %>">
			<liferay-ui:message key="that-password-is-too-trivial" />
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORDS_DO_NOT_MATCH %>">
			<liferay-ui:message key="the-passwords-you-entered-do-not-match-each-other-please-re-enter-your-password" />
		</c:if>
	</liferay-ui:error>

	<liferay-ui:error exception="<%= UserScreenNameException.class %>" message="please-enter-a-valid-screen-name" />
	<liferay-ui:error exception="<%= WebsiteURLException.class %>" message="please-enter-a-valid-url" />

	<c:if test='<%= SessionMessages.contains(request, "openIdUserInformationMissing") %>'>
		<div class="alert alert-info">
			<liferay-ui:message key="you-have-successfully-authenticated-please-provide-the-following-required-information-to-access-the-portal" />
		</div>
	</c:if>

	<aui:model-context model="<%= Contact.class %>" />

	<aui:fieldset column="<%= true %>">
		<aui:col width="<%= 50 %>"> 
			<aui:input model="<%= User.class %>" name="firstName" />

			<aui:input model="<%= User.class %>" name="middleName" />
			
			<aui:input model="<%= User.class %>" name="lastName">
				<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.USERS_LAST_NAME_REQUIRED) %>">
					<aui:validator name="required" />
				</c:if>
			</aui:input>
			
			<c:if test="<%= !PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.USERS_SCREEN_NAME_ALWAYS_AUTOGENERATE) %>">
				<aui:input model="<%= User.class %>" name="screenName" />
			</c:if>

			<aui:input autoFocus="<%= true %>" model="<%= User.class %>" name="emailAddress">
				<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.USERS_EMAIL_ADDRESS_REQUIRED) %>">
					<aui:validator name="required" />
				</c:if>
			</aui:input>
			<aui:input  type="text" name="employeeId" label="Employee Id">
					<aui:validator name="required" />
			</aui:input>
			<aui:select name="employeeType" label="Employement Type">
					<option  value="permanent">Permanent</option>
					<option  value="contract">Contract</option>
			</aui:select> 
			<aui:select name="employeeDesignationId" label="Designation">
				<c:forEach items="${designationList}" var="designation">
					<option  value="${designation.employeeDesignationId}">${designation.designationName}</option>
				</c:forEach>
			</aui:select> 
			<aui:select name="recruitedById" label="Recruited By">
				<c:forEach items="${recruitedByList}" var="recruited">
					<option  value="${recruited.userId}">${recruited.firstName} ${recruited.lastName}</option>
				</c:forEach>
			</aui:select> 
			
		</aui:col>

		<aui:col width="<%= 50 %>">
			
				<aui:input label="password" name="password1" type="password" >
				<aui:validator name="required" />
				</aui:input>

				<aui:input label="enter-again" name="password2" type="password">
					<aui:validator name="required" />
					<aui:validator name="equalTo">
						'#<portlet:namespace />password1'
					</aui:validator>
				</aui:input>
			

			<c:choose>
				<c:when test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_BIRTHDAY) %>">
					<aui:input name="birthday" value="<%= birthdayCalendar %>" id="bday"/>
				
				</c:when>
				<c:otherwise>
					<aui:input name="birthdayMonth" type="hidden" value="<%= Calendar.JANUARY %>" />
					<aui:input name="birthdayDay" type="hidden" value="1" />
					<aui:input name="birthdayYear" type="hidden" value="1970" />
				</c:otherwise>
			</c:choose>
		    <%-- <aui:input type="text" id="bday" label="Birthday" name="birthday"  />
			<div style="display: none;" id="bb">
			    <a id="button1">Prev Year</a>
			    <a id="button2" class="button2">Next Year</a>
		    	<div id="cb">
		    	</div>
		    </div> --%>
		    <%-- <aui:input type="text" class="bday" label="Birthday" name="birthday" data-dateformat='d/M/yy'/> --%>
			<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_MALE) %>">
				<aui:select label="gender" name="gender">
					<aui:option label="male" value="0" />
					<aui:option label="female" value="1" />
				</aui:select>
			</c:if>
			<aui:input type="text" id="bday" label="Joining Date" name="joiningDate"/>
			<div style="display: none;" id="bb">
			    <a id="button1">Prev Year</a>
			    <a id="button2" class="button2">Next Year</a>
		    	<div id="cb">
		    	</div>
		    </div>
			<aui:select name="employeeDepartmentId" label="Department Name" onchange="javascript:showSub(this.value);">
			<option  value="">Select</option>
				<c:forEach items="${departmentList}" var="department">
					<option  value="${department.employeeDepartmentId}">${department.departmentName}</option>
				</c:forEach>
			</aui:select>
			<span id="updatedSub">
			
			<aui:input type="hidden" name="employeeSubDepartmentId"/>
			</span>		 
			<aui:input type="textarea" label="Recruited on basis of"  rows="5"  name="recruitedOnBasis" />
		</aui:col>
	</aui:fieldset>

<aui:button-row>
       <aui:button name="saveForm" value="Save" />

</aui:button-row>

</aui:form>


