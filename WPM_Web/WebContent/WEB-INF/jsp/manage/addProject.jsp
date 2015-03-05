<!DOCTYPE html>
<html lang="en">
<head>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>


</head>
<body>

<div class="container">

	
   <form:form name="addproject" id="addproject" class="form-horizontal" commandName="projectVO" action="/WPM_Web/saveProject.do">
 
<spring:hasBindErrors name="loginVO">
     <spring:bind path="*">
        <div class="alert alert-danger" role="alert">
		  <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
		  <span class="sr-only">Error:ddsad</span>
		  <span>Please enter below required fields</span>
		  <ul>
		   <c:forEach items="${status.errorMessages}" var="error">
		  		<li>${error}</li> 
		   </c:forEach>
		  </ul> 
		</div>
    </spring:bind>
  </spring:hasBindErrors>
  
    <div class="form-group " >
     <div class="col-sm-2" align="left">
      	<label class="control-label"  for="projectName">Project Name:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input path="projectName" class="form-control" placeholder="Project Name" required="required" title="Enter project name."/>
      </div>
    </div>
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="projectDesc">Project Description:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input type="text" path="projectDesc" class="form-control" required="required" title="Enter project desccription." />
      </div>
    </div>
     
    
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="projectStartDateStr">Project Start Date<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <form:input path="projectStartDateStr" class="form-control" placeholder="MM/dd/YYYY" required="required" title="" readonly="readonly" />
      </div>
    </div>
    
   <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="projectEndDateStr">Project End Date<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <form:input path="projectEndDateStr" class="form-control" placeholder="MM/dd/YYYY" required="required" title="" readonly="readonly" />
      </div>
    </div>
    
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <button type="submit" class="btn btn-primary">Save</button> 
       </div>
    </div>
    
</form:form>
</div>

<script type="text/javascript">

function submitForm(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}

$( document ).ready(function() {
    $( "#projectStartDateStr" ).datepicker();
    $( "#projectEndDateStr" ).datepicker();
  });
  
  
</script>
</body>
</html>