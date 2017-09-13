<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Detalle de inscripción del estudiante</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/bootstrap-theme.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
    <div class="container">
	    <div class="starter-template">
	   		<div class="alert alert-success" role="alert">
				<h4 class="alert-heading">¡Bien hecho!</h4>
				<p>${success}</p>
				<hr>
				<p class="mb-0">También le hemos enviado un correo de confirmación a su dirección de correo electrónico: ${estudiante.email}.</p>
			</div>
		</div>
    </div>
</body>
</html>