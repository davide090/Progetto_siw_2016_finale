<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII" />
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Area Riservata: Amministrazione</title>
</head>
<body style="font-size: large">
	<f:view>

		<h1>Area riservata: Amministrazione</h1>
		
			<li><a href="creaPrenotazioneEsame.jsp"> Prenotazione di un
					esame </a></li>
			<li><a href="creaTipologiaEsame.jsp"> Inserimento nuova
					tipologia esame</a></li>
			<h:form>

				<fieldset>
					<legend>Codici medico disponibili</legend>

					<c:forEach var="medico" items="#{controller.medici}">
								Codice: ${medico.id};   Nome: ${medico.nome };   Cognome: ${medico.cognome }. <br>
					</c:forEach>
				</fieldset>

				<li><div>
						Inserisci Codice Medico:
						<h:inputText value="#{controller.codiceMedico}" required="true"
							requiredMessage="Codice is mandatory"
							converterMessage="Codice must be a number" id="codiceMedico" />
						<h:message for="codiceMedico" />
					</div></li>
					<div>
					<h:commandButton value="Conferma" action="#{controller.findMedico}" />
				</div>
			</h:form>
	</f:view>
</body>
</html>