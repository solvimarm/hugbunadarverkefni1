<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>Suggested foodplan</title>
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
			<img src="https://assets.entrepreneur.com/content/16x9/822/20150408144705-90-minute-morning-routine-workday-more-productive-healthy-breakfast-cereal-fruit-smoothie.jpeg" alt="">
			<h1>Diet plan</h1>
			
			<h4>Breakfast</h4>
			<p>${breakfast}</p>
			<h4>Lunch</h4>
			<p>${lunch}</p>
			<h4>Dinner</h4>
			<p>${dinner}</p>
		</div>
	</body>
</html>
