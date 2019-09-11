
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<script>
function register(){
	alert("Registration successfully completed");
	window.location.href = "login.jsp";
}
</script>
<link rel="stylesheet" href="css/bootsrap.min.css">
<script type="js/bootstrap.min.js"></script>
</head>
<body style="text-align:center">

<jsp:include page="header.jsp"></jsp:include>
<br><br><br>
<h2>Register Now</h2>
<form>
<br><br>
Name <input type="text" placeholder="Enter your name " required><br><br>
Gender <input type="radio" value=m name="gen" required>Male
<input type="radio" value=F name="gen" required>Female <br><br>
Age <input type="number" min=10 max=80 required><br><br>
Address <input type="text" placeholder="Enter your address"><br><br>
Email <input type="email" required><br><br>
Phone <input type="number" required><br><br>
Password<input type="password" placeholder="Please set your password" required><br><br>
<input type = "button" value = "Submit" class="btn btn-success" onclick=register()>
<input type = "button" value = "Rest" class="btn btn-success" onclick="window.location.href = 'register.jsp';">

</form>

</body>
</html>