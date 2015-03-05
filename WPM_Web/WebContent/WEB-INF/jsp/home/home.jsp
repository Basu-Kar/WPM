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
          Dropdown <span class="caret"></span>
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
  
  	<thead style="background-color: blue;">
  		<tr>
  		<th>Project Id</th>
  		<th>Project Name</th>
  		<th>Assigned To</th>
  		<th>Start Date</th>
  		<th>End Date</th>
  		 </tr>
  	</thead>
  	<tbody >
  	<tr>
  		<td>1</td>
  		<td></td>
  		<td>2</td>
  		<td>3</td>
  		<td>4</td>
  		 </tr>
  	<tr>
  		<td>1</td>
  		<td></td>
  		<td>2</td>
  		<td>3</td>
  		<td>4</td>
  		 </tr>
  	</tbody>
  
  </table>
  
  
</div>
  </form:form>
  <script type="text/javascript">

function submitFormHome(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}
</script>
</body> 
</html>