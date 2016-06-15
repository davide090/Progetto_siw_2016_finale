<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>New Product</title>
</head>
<body style="font-size: large">
	<h1>Prenota un Esame: Inserisci i seguenti dati</h1>
	<f:view>
		<h:form>
			<div>
				Codice Tipologia Esame:
				<h:inputText value="#{controller.nomeTipologiaEsame}"
					required="true" requiredMessage="Code is mandatory" id="code" />
				<h:message for="code" />
			</div>
			<div>
				Codice Paziente:
				<h:inputText value="#{controller.codicePaziente}" required="true"
					requiredMessage="Name is mandatory" id="name" />
				<h:message for="name" />
			</div>
			<div>
				Codice Medico:
				<h:inputText value="#{controller.codiceMedico}" required="true"
					requiredMessage="Price is mandatory"
					converterMessage="Price must be a number" id="price" />
				<h:message for="price" />
			</div>
			<div>
				Data Esame:
				<h:inputText value="#{controller.dataEsame}" required="true"
					requiredMessage="Date is mandatory" id="date" />
				<h:message for="date" />
			</div>
			<div>
				<h:commandButton value="Submit" action="#{controller.createEsame}" />
			</div>
		</h:form>
		<a href="homePage.jsp"> Torna alla Home </a>
	</f:view>
</body>
</html>