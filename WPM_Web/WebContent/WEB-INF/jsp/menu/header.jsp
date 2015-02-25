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
<body>
<div class="container">

<div class="container" >
      <div class="col-sm-2" align="left">
      	Logo - WPM
      	</div>
      	 <div class="col-sm-10" align="right">
      	Not ${home_user_name}? &nbsp;&nbsp;|&nbsp; &nbsp;<a href="#" onclick="submitForm('loginForm','logout.do');">logout</a>
       </div>
    </div>
     
 <div class="container" >
      <div class="col-sm-2" align="center" >
      	
      	</div>
      	 <div class="col-sm-10" align="right">
      	 
       </div>
    </div>
     
</div>
</body>
</html>