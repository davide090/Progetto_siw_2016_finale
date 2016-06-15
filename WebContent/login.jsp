<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href='media/stile2.css'>
<title>Login</title>
</head>
<body  style="font-size: large">
	<h1>Stai per accedere ad una Area Riservata: Inserisci le tue credenziali di accesso</h1>
	<form action="j_security_check" method="POST">
		<div>
			Nome: <input type="text" name="j_username" />
		</div>
		<div>
			Password: <input type="password" name="j_password" />
		</div>
		<input type="submit" value="Entra" />
	</form>
</body>
</html>