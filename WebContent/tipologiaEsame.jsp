<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Tipologia Esame</title>
</head>
<body  style="font-size: large">
	<f:view>
		<h1>Nome Tipologia: ${controller.tipologiaEsame.nome}</h1>
		<h2>Dettagli Tipologia Esame:</h2>
		<div>Codice: ${controller.tipologiaEsame.codice}</div>
		<div>Costo: ${controller.tipologiaEsame.costo}</div>
		<div>Nome: ${controller.tipologiaEsame.nome}</div>
		<div>Descrizione: ${controller.tipologiaEsame.descrizione}</div>
		<h:form>
			<h:commandLink action="#{controller.getAllTipologieEsami}"
				value="Torna alle Tipologie esami disponibili" />
		</h:form>
	</f:view>
	<a href="homePage.jsp"> Torna alla Homepage </a>
	<br />
</body>
</html>