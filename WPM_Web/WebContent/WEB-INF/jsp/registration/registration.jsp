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

<p> Fill the details about the User</p>

   <form:form name="loginForm" id="loginForm" class="form-horizontal" commandName="registrationVO" action="/WPM_Web/validateRegistration.do">
   
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
  
    <div class="form-group " >
     <div class="col-sm-2" align="left">
      	<label class="control-label"  for="userId">Email Id<span>*</span></label>
      	</div>
      	<div class="col-sm-3" align="left">
      	<form:input path="email" class="form-control" placeholder="abc@def.com" required="required" title="" />
      </div>
      
    </div>
    <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">First Name<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <form:input path="fName" class="form-control" placeholder="Basu" required="required" title="" />
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Last Name<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <form:input path="lName" class="form-control" placeholder="Kar" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Date of Join<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <form:input path="dateOfJoin" class="form-control" placeholder="MM/dd/YYYY" required="required" title="" readonly="readonly" />
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Password<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input type="password" path="password" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Confirm Password<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input type="password"  path="confirmPassword" class="form-control" placeholder="" required="required" title=""/>
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Hint Question<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="left">
      	 <form:select path="hintQuestionId" class="form-control" placeholder="" required="required" title="">
      	 
      	 <option id="-1"> Select </option>
      	 	<option id="1"> Question1 </option>
      	 	<option id="2"> Question1 </option>
      	 	<option id="3"> Question1 </option>
      	 	<option id="4"> Question1 </option>
      	 	
      	 </form:select>
      	 
      </div>
    </div>
    
     <div class="form-group" >
      <div class="col-sm-2" align="left">
      	<label class="control-label"  for="password">Hint Answer<span>*</span></label>
      	</div>
      	 <div class="col-sm-3" align="right">
      	 <form:input path="hintAnswer" class="form-control" placeholder="" required="required" title=""/>
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

<script type="text/javascript">

function submitForm(formName, actionName){
	document.getElementById(formName).action=actionName;
	document.getElementById(formName).submit();
}

$( document ).ready(function() {
    $( "#dateOfJoin" ).datepicker();
  });
  
</script>
</body>
</html>