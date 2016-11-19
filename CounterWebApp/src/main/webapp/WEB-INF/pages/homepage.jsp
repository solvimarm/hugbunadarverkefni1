<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>username</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css">         
		<script src="../js/bootstrap.min.js"></script>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<img src="<c:url value='/images/picture.jpg'/>" />
			<ul class="nav nav-tabs">
  				<li role="presentation" class="active"><a href="homepage">Home</a></li>
				<li role="presentation"><a href="currentCycle">My Profile</a></li>
			</ul>			
			<form method="POST" role="form">
				<div class = "form-group">
					<div class="row">
						<div class ="col-md-4">
							<input class="btn-primary" type="submit" name="food" value="Food">
						</div>
						<div class ="col-md-4">
							<input class="btn-primary" type="submit" name="week" value="Current cycle">
						</div>
						<div class ="col-md-4">
							<input class="btn-primary" type="submit" name="day" value="Current Day">
						</div>
					</div>
					<h3>Welcome to your home page</h3>
					<h4>${name}</h4>
					<h4>${email}</h4>
					<h4>${goal}</h4>
				</div>
			</form>
		</div>
	</body>
</html>