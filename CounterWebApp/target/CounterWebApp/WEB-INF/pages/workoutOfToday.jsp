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
		<div class="container">
			</p>
			<ul class="nav nav-tabs">
  				<li role="presentation"><a href="homepage">Home</a></li>
				<li role="presentation"><a href="myProfile">My Profile</a></li>
			</ul>
			<div class="jumbotron">
				<h1>Fill in your workout weights!</h1>
  				<p>That will help you keep track of your progress.</p>
			</div>
			<form method="POST" role="form">
				<div class="form-group">
		 			<table class="table">
	  					<tr>
	    					<th>Name</th>
	    					<th>Sets</th> 
	    					<th>Reps</th>
	    					<th>Dumbel weight</th>
	  					</tr>
	  					<c:forEach var="exercise" items="${exercises}">
	  						<tr>
	    						<td>${exercise.name}</td>
	    						<td>
	   							<c:forEach var="set" items="${exercise.set}">
	   								
	   									<ul>
	   									
	   										<li>${set.number}</li>
	   									
	   									</ul>
	   								</td> 
	    							<td>
	    								<ul>
	   									
	   										<li>${set.rep}</li>
	   									
	   									</ul>
	    							</td>
	    						
	    							<td>
	    								<div class="col-xs-3">
	    									<input type="int" name="${exercise}" class="form-control">
	    								</div>
	    							
	    						</c:forEach>
	    						</td>
	  						</tr>
	  					</c:forEach>
					</table>
				</div>
				<input class="btn btn-primary" type="submit" name="button" value="Submit"/>
			</form>
		</p>
		</div>
	</body>
</html>