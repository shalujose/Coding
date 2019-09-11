
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootsrap.min.css">
<script type="js/bootstrap.min.js"></script>
<script>
function login(){
	alert("Login successfully completed");
	window.location.href = "donorFeatures.jsp";
}
</script>
</head>
<body style="text-align:center">
<jsp:include page="header.jsp"></jsp:include>
<br><br><br>
<h2 style="color:blue">Login Here</h2>

<form>

Name <input type="text" placeholder="Enter your Name" required><br>
Password <input type="password" placeholder="Enter your password" required><br>
<br>
<input type = "button" value = "Submit" class="btn btn-success" onclick=login()>
</form>
</body>
</html>