<!DOCTYPE html>
<html lang="en">
<head>
                <%-- 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>

<style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
</head>
<body>

<div class="container">

	<div style="outline: 1px solid orange;padding-top: 20px;" class="form-group col-sm-8" >
   <form:form name="loginForm" id="loginForm" class="form-horizontal" commandName="loginVO" action="/WPM_Web/validateLogin.do">
  
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
      	 <form:input path="password" class="form-control" required="required" title="Enter password." />
      </div>
    </div>
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <button type="submit" class="btn btn-primary">Submit</button> <a href="#" onclick="submitForm('loginForm','register.do');">New User</a>
       </div>
    </div>
   
  
</form:form>
</div>
    </div> <!-- /container -->
<script src="https://code.jquery.com/jquery.js"></script> 

<script type="text/javascript">

function submitForm(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}
</script>
</body>
</html>