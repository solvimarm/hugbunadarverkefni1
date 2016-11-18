<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>Current Workout Plan</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css">         
		<script src="../js/bootstrap.min.js"></script>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class= "container">
			<div class="row">
				<form method="POST", role="form">
		  			<div class="col-sm-6">
		   				<div class="card card-block">
		      				<h3 class="card-title">Monday</h3>
		      				<p>${mondayDate}</p>
		     				 <ul class="list-group list-group-flush">
		     				 	<c:forEach var="i" items="${mondayEx}">
	    							<li class="list-group-item">${i.name}</li>
	    						</c:forEach>
	 				 		</ul>
		      				<input type="submit" name="monday" class="btn btn-primary" value="Fill in results"></input>
		    			</div>
		  			</div>
		 			 <div class="col-sm-6">
		    			<div class="card card-block">
		      				<h3 class="card-title">Tuesday</h3>
		      				<p>${tuesdayDate}</p>
		      				<ul class="list-group list-group-flush">
		     				 	<c:forEach var="i" items="${tuesdayEx}">
	    							<li class="list-group-item">${i.name}</li>
	    						</c:forEach>
	 				 		</ul>
		      				<input type="submit" name="tuesday" class="btn btn-primary" value="Fill in results"></input>
		    			</div>
		  			</div>
		  			<div class="col-sm-6">
		    			<div class="card card-block">
		      				<h3 class="card-title">Wednesday</h3>
		      				<p>${wednesdayDate}</p>
		      				<ul class="list-group list-group-flush">
		     				 	<c:forEach var="i" items="${wednesdayEx}">
	    							<li class="list-group-item">${i.name}</li>
	    						</c:forEach>
	 				 		</ul>
		      				<input type="submit" name="wednesday" class="btn btn-primary" value="Fill in results"></input>
		    			</div>
		  			</div>
		  			<div class="col-sm-6">
		    			<div class="card card-block">
		      				<h3 class="card-title">Thursday</h3>
		      				<p>${thursdayDate}</p>
		      				<ul class="list-group list-group-flush">
		     				 	<c:forEach var="i" items="${thursdayEx}">
	    							<li class="list-group-item">${i.name}</li>
	    						</c:forEach>
	 				 		</ul>
		      				<input type="submit" name="thursday" class="btn btn-primary" value="Fill in results"></input>
		    			</div>
		  			</div>
		  			<div class="col-sm-6">
		    			<div class="card card-block">
		      				<h3 class="card-title">Friday</h3>
		      				<p>${fridayDate}</p>
		      				<ul class="list-group list-group-flush">
		     				 	<c:forEach var="i" items="${fridayEx}">
	    							<li class="list-group-item">${i.name}</li>
	    						</c:forEach>
	 				 		</ul>
		      				<input type="submit" name="friday" class="btn btn-primary" value="Fill in results"></input>
		    			</div>
		  			</div>
		  		</form>
			</div>
		</div>
	</body>
</html>