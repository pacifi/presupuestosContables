<%-- 
    Document   : productoInsert
    Created on : 21/06/2013, 03:33:53 PM
    Author     : Pacifi
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:url value="productoGuardar.pacifi" var="productoG"/>
        <fm:form modelAttribute="ModeloProducto" method="post" action="${productoG}">
            <fm:label path="nombreProducto">nombre Producto</fm:label>
            <fm:input path="nombreProducto"/><br>
            <fm:label path="descripcion">descripcion</fm:label>
            <fm:input path="descripcion"/><br>
            <fm:label path="politicaInvfin">politicaInvfin</fm:label>
            <fm:input path="politicaInvfin"/><br>
            <fm:label path="margenGanancia">margenGanancia</fm:label>
            <fm:input path="margenGanancia"/><br>
            <fm:label path="idProyecto">idProyecto</fm:label>
            <fm:input path="idProyecto"/><br>
            
            
                      
           <input type="submit" value="Enviar"/>
        </fm:form>
    </body>
</html>
