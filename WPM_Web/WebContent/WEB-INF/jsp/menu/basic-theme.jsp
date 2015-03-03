<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<head>
    <title></title>
    
    <!-- Latest compiled and minified CSS -->
    
<link rel="stylesheet" href="commons/bootstrap/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="commons/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="commons/jquery/jquery-ui.min.css">
<link rel="stylesheet" href="commons/jquery/jquery-ui.theme.min.css">



<script src="commons/jquery/external/jquery/jquery.js"></script>

<script src="commons/jquery/jquery-ui.min.js"></script>
<script src="commons/jquery/jquery-ui.js"></script> 
<script src="commons/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>

<table  style="background-color: #E6E6E6;height: auto" border="1">

	<tr> 
		<td style="width: 10%; padding-top: 5%"> </td>
		<td style="width: 80%; background-color: #FBFBEF;"> <jsp:include page="header.jsp" /></td>
		<td style="width: 10%"> </td>
		
	</tr>
	<tr> 
		<td style="width: 10%" > </td>
		<td style="width: 80%;background-color: #FBFBEF;height: 90%" align="left">  <decorator:body /> </td>
		<td style="width: 10%"> </td>
	</tr>
	<tr> 
		<td style="width: 10%; padding-top: 5%" > </td>
		<td style="width: 80%;background-color: #FBFBEF; "> <jsp:include page="footer.jsp" /></td>
		<td style="width: 10%"> </td>
	</tr>




</table>

<%-- <div class="container-fluid">
<div class="row-fluid">
<jsp:include page="header.jsp" />
</div>
  <div class="row-fluid">
    <div class="span2">
      <!--Sidebar content-->
    </div>
    <div class="span10">
      <decorator:body />
    </div>
  </div>
  <div class="row-fluid">
  	<jsp:include page="footer.jsp" />
</div>
</div> --%>
 
   
</body>
</html>