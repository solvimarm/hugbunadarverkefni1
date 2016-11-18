<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>workout of today</title>
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
	 			<table class="table">
  					<tr>
    					<th>Name</th>
    					<th>Sets</th> 
    					<th>Reps</th>
    					<th>Dumbel weight</th>
  					</tr>
  					<c:forEach var="i" items="${workout}">
  						<tr>
    						<td>${i}</td>
   							<td>3</td> 
    						<td>${rep}</td>
    						<td>
    							<div class="col-xs-3">
    								<input type="int" name="${i}" class="form-control">
    							</div>
    						</td>
  						</tr>
  					</c:forEach>
				</table>
			</div>
			<input type="submit" name="button" value="Submit"/>
		</form>
	</body>
</html>