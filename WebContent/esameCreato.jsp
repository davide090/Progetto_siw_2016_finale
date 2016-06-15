<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Dettagli Prenotazione Esame</title>
</head>
<body style="font-size: large">
	<f:view>
		<h1>Dettagli Prenotazione Esame:</h1>
		<li><div>
				Codice: ${controller.esame.id}
			</div></li><br>

		<li><div>
				Dati Paziente: <br>
				<fieldset>
					Nome: ${controller.esame.paziente.nome} <br> 
					Cognome: ${controller.esame.paziente.cognome}
				</fieldset>
			</div></li><br>
		<li><div>
				Dati Medico: <br>
				<fieldset>
					Nome: ${controller.esame.medico.nome} <br> 
					Cognome: ${controller.esame.medico.cognome}
				</fieldset>
			</div></li><br>
		<li><div>
				Tipologia Esame: ${controller.esame.tipologiaEsame.codice}
			</div></li><br>
		<li><div>
				Data Prenotazione Esame: ${controller.esame.dataPrenotazione}
			</div></li><br>
		<li><div>
				Data Esame: ${controller.esame.dataEsame}
			</div></li>
	</f:view>
	<a href="homePage.jsp"> Torna alla Homepage </a>	
	<br />
</body>
</html>