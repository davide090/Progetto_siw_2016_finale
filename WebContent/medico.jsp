<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Dati del Medico selezionato:</title>
</head>
<body  style="font-size: large">
	<f:view>
		<h1>Codice Medico: ${controller.medico.id}</h1>
		<h2>Dettagli Medico:</h2>
		<div>Nome: ${controller.medico.nome}</div>
		<div>Cognome: ${controller.medico.cognome}</div>
		<div>Specializzazione: ${controller.medico.specializzazione}</div>
		<div>Numero esame effettuati dal Medico:
			${controller.numeroEsami}</div>
		<div>
			<ul>
				<c:forEach var='esame' items="${controller.esamiMedico}">
					<li>Codice: <b>${esame.id}</b></li>
					<li>Paziente: <b>${esame.paziente.id}</b></li>
					<li>Tipologia: <b>${esame.tipologiaEsame.codice}</b></li>
					<li>Data Prenotazione: <b>${esame.dataPrenotazione}</b></li>
				</c:forEach>
			</ul>
		</div>
		<h:form>
			<h:commandLink action="#{controller.getAllTipologieEsami}"
				value="Catalogo Tipologie esami disponibili" />
		</h:form>
	</f:view>
	<a href="homePage.jsp"> Torna alla Homepage </a>
	<br />
</body>
</html>