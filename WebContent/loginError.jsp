<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Login fallito</title>
</head>
<body>
	<h1><u>Login non riuscito: </u></h1>
	<fieldset>
		
		<div>
		    
			<p> I dati inseriti non sono corretti</p>
			<p> Oppure </p>
			<p>Non possiedi l'autorizzazione necessaria ad accedere a
				questa Area riservata</p> 
		</div>
	</fieldset>
	<a href="login.jsp"> Riprova </a>
	<br>
	<a href="homePage.jsp"> Torna alla Homepage </a>
</body>
</html>