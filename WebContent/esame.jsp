<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Esame</title>
</head>
<body  style="font-size: large">
	<f:view>
		<h1>${controller.esame.nome}</h1>
		<h2>Dettagli  Esame:</h2>
		<div>Codice: ${controller.esame.id}</div>
		<div>Costo: ${controller.esame.costo}</div>
		<div>Nome Paziente: ${controller.esame.paziente.nome}  Cognome Paziente: ${controller.esame.paziente.cognome}</div>
		<div>Tipologia Esame: ${controller.esame.tipoologiaEsame.codice}</div>
	</f:view>
	<a href="homePage.jsp"> Torna alla Homepage </a>
	<br />
</body>
</html>