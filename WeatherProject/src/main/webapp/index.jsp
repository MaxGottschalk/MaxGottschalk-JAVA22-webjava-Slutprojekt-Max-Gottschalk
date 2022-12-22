<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<div class=container>
		<form class=start action="OWservlet" method="get">
			City:<br /><input class="search" type="text" name="city" /><br /> 
			Country:<br/><input class="search" type="text" name="country" /><br /> 
			<input type="submit" value="Search" />
		</form>
	</div>
</body>
</html>