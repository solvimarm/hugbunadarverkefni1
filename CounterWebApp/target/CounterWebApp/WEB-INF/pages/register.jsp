<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>create new user</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css">         
		<script src="../js/bootstrap.min.js"></script>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<form method="POST" role="form">
			<div class="form-group">
				<label for="name">Type your Name</label>
				<input value="${name}" type="text" class="form-control" name="name" required/>
			</div>
			<div class="form-group">
				<label for="email">Type the email</label>
				<input value="${email}" type="text" class="form-control" name="email" required/>
			</div>
			<div class="form-group">
				<label for="username">Type the username</label>
				<input value="${username}" type="text" class="form-control" name="username" required/>
			</div>
			<div class="form-group">
				<label for="password">Type the password</label>
				<input value="${password}" type="text" class="form-control" name="password" required/>
			</div>
			<div class="form-group">
				<label for="age">Type the age</label>
				<input value="${age}" type="text" class="form-control" name="age" required/>
			</div>
			<div class="form-group">
				<label for="goal">Type the goal</label>
				<input age="${goal}" type="text" class="form-control" name="goal" required/>
			</div>
			<div class="form-group">
				<label for="gender">Type the gender</label>
				<input value="${gender}" type="text" class="form-control" name="gender" required/>
			</div>
			<div class="form-group">
				<label for="weight">Type the weight</label>
				<input value="${weight}" type="text" class="form-control" name="weight" required/>
			</div>
			<div>
				<c:forEach var="i" items="${error}">
					<tr>
						<td>${i}</td>
					</tr>
				</c:forEach>
			</div>
			<input type="submit" name="submit" value="Submit"/>
		</form>
	</body>
</html>