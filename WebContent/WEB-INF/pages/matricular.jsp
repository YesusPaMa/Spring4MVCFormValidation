<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Inscripción de estudiantes</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/bootstrap-theme.css' />" rel="stylesheet"></link>
</head>
 
<body>
 
    <div class="container">
     
    <h1>Formulario de inscripción de estudiantes</h1>
     
    <form:form method="POST" modelAttribute="estudiante" class="form-horizontal">
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="nombre">Nombre: </label>
                <div class="col-md-7">
                    <form:input type="text" path="nombre" id="nombre" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="nombre" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="apellido">Apellido: </label>
                <div class="col-md-7">
                    <form:input type="text" path="apellido" id="apellido" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="apellido" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="sexo">Sexo: </label>
                <div class="col-md-7" class="form-control input-sm">
                    <form:radiobutton path="sexo" value="M" />Hombre
                    <form:radiobutton path="sexo" value="F" />Mujer
                    <div class="has-error">
                        <form:errors path="sexo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="fechaNac">Fecha Nacimiento: </label>
                <div class="col-md-7">
                    <form:input type="text" path="fechaNac" id="fechaNac" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="fechaNac" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="email">Correo Electronico: </label>
                <div class="col-md-7">
                    <form:input type="text" path="email" id="email" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="email" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="nivelEscolar">Nivel Escolar: </label>
                <div class="col-md-7" class="form-control input-sm">
                    <form:radiobuttons path="nivelEscolar" items="${niveles}" />
                    <div class="has-error">
                        <form:errors path="nivelEscolar" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="pais">Pais: </label>
                <div class="col-md-7">
                    <form:select path="pais" id="pais" class="form-control input-sm">
                        <form:option value="">Selecciona un Pais</form:option>
                        <form:options items="${paises}" />
                    </form:select>
                    <div class="has-error">
                        <form:errors path="pais" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="primerIntento">Primer Intento:</label>
                <div class="col-md-1">
                    <form:checkbox path="primerIntento" class="input-sm"/>
                    <div class="has-error">
                        <form:errors path="primerIntento" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
     
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="materias">Materias: </label>
                <div class="col-md-7">
                    <form:select path="materias" items="${ltmaterias}" multiple="true" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="materias" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Registrar" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form:form>
    </div>
</body>
</html>