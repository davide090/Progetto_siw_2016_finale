<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" type="text/css" href='media/stile.css'>
<title>CLINICA ROSSI</title>
</head>
<body>
	<img src="media/img/HomePage.jpg" />
	<f:view>
		<ul style="font-size: large">
			<li><a href='<c:url value="homePage.jsp " /> '> Vai
					alla Homepage </a></li>
		</ul>
	</f:view>
</body>
</html>
