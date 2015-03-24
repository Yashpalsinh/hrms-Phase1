<!-- init.jsp is for imports and global variables, it is included in all other jsp pages.
imports taglib and global variables -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.hrms.model.EmployeeDesignation" %>
<%@page import="com.hrms.service.EmployeeDesignationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.util.PortalUtil" %>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.hrms.EmployeeDesignationComparator"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portlet.PortalPreferences"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.hrms.EmployeeDesignationCont"%>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/custom.css" />
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<portlet:defineObjects />


<liferay-theme:defineObjects />
<%
String currentURL = PortalUtil.getCurrentURL(request);
PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request);

long employeeDesignationIda = ParamUtil.getLong(request, "employeeDesignationIda");
String designationNamea = ParamUtil.getString(request, "designationNamea");
String statusa = ParamUtil.getString(request, "statusa");

%>
 	
	 