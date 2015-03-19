<%@page import="com.hrms.model.Todo"%>
<%@include file="../init.jsp" %>


<%
List<Todo> td=(List<Todo>)request.getAttribute("taskList");

%>
<table id="tasktable">
  <c:forEach var="task" items="<%=td%>">
  <tr>
    <td><b>${task.taskDetails}</b> &nbsp At &nbsp ${task.date} </td>
  </tr>
  </c:forEach>
</table>

<style>
	#tasktable tr:nth-child(odd) {
		background-color:  #c5c5c5;
	}
</style>
