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


    </style>
  
  
</head>
<body>

<div class="container">


   <form:form name="loginForm" id="loginForm" class="form-horizontal" commandName="registrationVO" action="">
  
 
  
    <div class="form-group " >
     <div class="col-sm-2" align="left">
      	<label class="control-label"  for="userId">Email Id:</label>
      	</div>
      	<div class="col-sm-3" align="right">
      	 <input type="text" class="form-control" placeholder="" required="required" title=""/>
      </div>
      
    </div>
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">First Name:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <input type="text" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Last Name:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <input type="text" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Date of birth:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <input type="text" id="datepicker">
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Password:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <input type="text" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Confirm Password:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <input type="text" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Hint Question:</label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <select>
      	 	<option id="-1"> Select </option>
      	 	<option id="1"> Question1 </option>
      	 	<option id="2"> Question1 </option>
      	 	<option id="3"> Question1 </option>
      	 	<option id="4"> Question1 </option>
      	 	
      	 </select>
      	 
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Hint Answer:</label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <input type="text" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <button type="submit" class="btn btn-primary">Submit</button>
       </div>
    </div>
  
</form:form>

    </div> <!-- /container -->
<script src="https://code.jquery.com/jquery.js"></script> 

<script type="text/javascript">

function submitForm(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}

$( document ).ready(function() {
	alert("1");
    $( "#datepicker" ).datepicker();
  });
  
</script>
</body>
</html>