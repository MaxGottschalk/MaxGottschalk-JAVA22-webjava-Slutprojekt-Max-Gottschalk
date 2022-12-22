<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.WeatherBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	WeatherBean wBean = (WeatherBean) request.getAttribute("wBean");
	out.print("<h2> The weather in " + wBean.getCityStr() + " " + wBean.getCountryStr()+ " is now " + wBean.getCloudsStr()+ ". <br/>");
	out.print(" It is " + wBean.getTempStr() + " degrees. <br/>");
	out.print(" Todays date is: " + wBean.getDateStr() + "</h2>");
	%>
	<jsp:include page="../index.jsp" />
	
	<h3>Previous search: </h3>
	<h4><a href="OWservlet?city=${cookie['Cookie'].getValue().split('-')[0]}&country=${cookie['Cookie'].getValue().split('-')[1]}"> ${cookie["Cookie"].getValue()}</a></h4>
	
	
</body>
</html>