<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Nuova Tipologia Esame</title>
</head>
<body style="font-size: large">
	<h1>Crea una nuova Tipologia di esame: Inserisci i seguenti dati</h1>
	<f:view>
		<h:form >
			<div>
				Codice:
				<h:inputText value="#{controller.codice}" required="true"
					requiredMessage="Code is mandatory" id="code" />
				<h:message for="code" />
			</div>
			<div>
				Nome:
				<h:inputText value="#{controller.nome}" required="true"
					requiredMessage="Name is mandatory" id="name" />
				<h:message for="name" />
			</div>
			<div>
				Costo:
				<h:inputText value="#{controller.costo}" required="true"
					requiredMessage="Price is mandatory"
					converterMessage="Price must be a number" id="price" />
				<h:message for="price" />
			</div>
			<div>
				Descrizione:
				<h:inputTextarea value="#{controller.descrizione}" required="false"
					cols="20" rows="5" />

			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{controller.createTipologiaEsame}" />
			</div>
		</h:form>
		<a href="homePage.jsp"> Torna alla Home </a>
	</f:view>
</body>
</html>