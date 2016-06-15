<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="media/stile2.css">
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Tipologie Esami</title>
</head>
<body style="font-size: large;">
	<f:view>
		<h:form>
			<h1>Tipologie Esami disponibili</h1>
			<fieldset>
				<div align="center">
					<table>
						<tr>
							<th>Nome</th>
							<th>Costo</th>
						</tr>
						<c:forEach var="tipologia" items="#{controller.tipologieEsami}">
							<tr>
								<td><h:commandLink
										action="#{controller.findTipologiaEsame}"
										value="#{tipologia.nome}">
										<f:param name="codice" value="#{tipologia.codice}" />
									</h:commandLink></td>
								<td>${tipologia.costo}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</fieldset>
			<a href="homePage.jsp"> Torna alla Homepage </a>
		</h:form>
	</f:view>
</body>
</html>