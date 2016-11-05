<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<html>
	<head>
		<title>Login</title>
		<link rel="shortcut icon" href="data:image/x-icon;," type="image/x-icon"> 
		<link rel="stylesheet" href="../css/bootstrap.min.css">         
		<script src="../js/bootstrap.min.js"></script>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<img src="../img/frontb.jpg" alt="Health">
		<div class = "row">
			<div class ="col-md-2"></div>
			<div class = "col-md-8">
				<img src="../img/frontb.jpg" alt="">
			</div>
			<div class = "col-md-2"></div>
		</div>
		<div class = "row">
			<form class = "col-md-1" action = "login">
				<input class ="btn-primary" type="submit" name="login" value="Login"/>
			</form>
			<form class = "col-md-1" action="register">
				<input class ="btn-primary	" type="submit" name="register" value="Register" />
			</form>
		</div>
	</body>
</html>