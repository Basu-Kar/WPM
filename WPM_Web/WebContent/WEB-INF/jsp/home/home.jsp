<!DOCTYPE html>
<html lang="en">
<head>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>
</head>
<body >

  
  <form:form method="post" commandName="projectVO" id="homeform" action="addProject.do">
  <div style="min-height:700px">
 	<div >
  
  	<div class="bs-example" data-example-id="nav-pills-with-dropdown">
    <ul class="nav nav-pills">
   
      <li role="presentation" class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
          Action <span class="caret"></span>
        </a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#" onclick="submitFormHome('homeform','addProject.do');">Add Project</a></li>
          <li><a href="#">Project Summary</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /example -->
 	
  </div>
  
  <h3>Project details:</h3>
  <table class="table table-bordered table-hover">
  
  	<thead style="background-color: gray;">
  		<tr>
  		<th>Project Id</th>
  		<th>Project Name</th>
  		<th>Project Desc</th>
  		<th>Start Date</th>
  		<th>End Date</th>
  		<th>Assigned To</th>
  		 </tr>
  	</thead>
  	<tbody >
  	<c:forEach items="${projectList}" var="vo">
  	<tr>
  		<td><a href="#" onclick="submitProject('homeform','showWorkPackets.do',${vo.projectId});">${vo.projectId}</a></td>
  		<td>${vo.projectName}</td>
  		<td>${vo.projectDesc}</td>
  		<td>${vo.projectStartDateStr}</td>
  		<td>${vo.projectEndDateStr}</td>
  		<td>${vo.projectAssignedTo}</td>
  	</tr>
  	
  	</c:forEach>
  	
  
  	</tbody>
  
  </table>
  
  
</div>
  </form:form>
  <script type="text/javascript">

function submitFormHome(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}

function submitProject(formName, actionName, projId){
	alert(projId);
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}
</script>
</body> 
</html>