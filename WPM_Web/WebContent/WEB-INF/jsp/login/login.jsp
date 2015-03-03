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

	<div style="outline: 1px solid orange;padding-top: 20px;" class="form-group col-sm-8" >
   <form:form name="loginForm" id="loginForm" class="form-horizontal" commandName="loginVO" action="/WPM_Web/validateLogin.do">
   <%-- 
   <spring:hasBindErrors name="loginVO">
        <div class="alert alert-danger" role="alert">
		  <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
		  <span class="sr-only">Error:ddsad</span>
		  <span>Please enter below required fields</span>
		  <ul>
		  <li><form:errors path="userId" /></li>
		  <li><form:errors path="password" /></li>
		  
		  </ul> 
		</div>
    </spring:hasBindErrors>
     --%>
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
      	<label class="control-label"  for="userId">User Id:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input path="userId" class="form-control" placeholder="User Id" required="required" title="Enter user id."/>
      </div>
    </div>
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Password:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input type="password" path="password" class="form-control" required="required" title="Enter password." />
      </div>
    </div>
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <button type="submit" class="btn btn-primary">Submit</button> 
      	 <a href="#" onclick="submitForm('loginForm','register.do');">New User</a>
       </div>
    </div>
   
   <p onmouseover="fnc();" id="mypgh"> This is my paragraph</p>
  
</form:form>
</div>
    </div> <!-- /container -->
<script src="https://code.jquery.com/jquery.js"></script> 

<script type="text/javascript">

function fnc(){
	alert(document.getElementById('mypgh').innerHTML);
}

function submitForm(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}
</script>
</body>
</html>