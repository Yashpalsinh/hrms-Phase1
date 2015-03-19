<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL var="addTaskURL">
	<portlet:param name="action" value="addTask"/>
</portlet:actionURL>

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
 <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script type="text/javascript">
$('document').ready(function(){
	$('#datepicker').datepicker({
	    dateFormat: 'dd-mm-yy',
	    numberOfMonths: 1,
	    onSelect: function(selected,evnt) {
	         updateAb(selected);
	    		}
	});
});
function updateAb(value){

		$("div#task-div").dialog ({
			height : 380,
			widht : 400
				});
    $('#dateinput').val(value);    
}

</script>

<body>
	<div id="datepicker"></div>
	<div id="task-div" title="Task Managment" style="display:none;">
		<form action="<%=addTaskURL%>" method="post">
			<label>Date</label>	
			<input type="text" id="dateinput" name="<portlet:namespace/>date" />
			<label>Task</label>
			<textarea rows="4" name="<portlet:namespace/>task"  id="task"></textarea>
			<br>
			<input type="submit" name='<portlet:namespace/>submit' value="Add Task" /> 
		</form>
	</div>
</body>