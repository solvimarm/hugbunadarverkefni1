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
		<div class="container">
			</p>
			<form method="POST" role="form">
				<div class="form-group">
					<label for="age">Type your age</label>
					<input value="${age}" type="text" class="form-control" name="age" required/>
				</div>
				<div class="form-group">
					<label for="goal">Select Goal</label>
					<select name="goal" placeholder="${goal}">
	  					<option value="stronger"  selected=${stronger == goal ? 'selected' : ''}>Stronger</option>
	  					<option value="buffer" selected=${buffer == goal ? 'selected' : ''}>Buffer</option>
						<option value="leaner" selected=${leaner == goal ? 'selected' : ''}>Leaner</option>
					</select>
				</div>
				<div class="form-group">
					<label for="weight">Type your weight</label>
					<input value="${weight}" type="double" class="form-control" name="weight" required/>
				</div>
				<c:forEach var="i" items="${error}">
					<div class="alert alert-danger">
						<tr>
							<td>${i}</td>
						</tr>
					</div>
				</c:forEach>
				<input class="btn btn-primary" type="submit" name="submit" value="Submit"/>
			</form>
		</div>
	</body>
</html>