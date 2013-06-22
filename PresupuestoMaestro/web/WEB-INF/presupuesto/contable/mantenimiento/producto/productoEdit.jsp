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
        <table border="1">
            <c:url value="productoActualizar.pacifi" var="productoG"/>
            <fm:form modelAttribute="ActualizarModelo" method="post" action="${productoG}">
                <fm:hidden path="idProducto" /><br>
                <tbody>
                    <tr>

                        <td><fm:label path="nombreProducto">nombre Producto</fm:label></td>
                        <td><fm:input path="nombreProducto"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="descripcion"> descripcion del producto</fm:label></td>
                        <td><fm:input path="descripcion"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="politicaInvfin">% para los inventarios finales</fm:label></td>
                        <td><fm:input path="politicaInvfin"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="margenGanancia">% para el margen de ganancia</fm:label></td>
                        <td><fm:input path="margenGanancia"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="idProyecto.idProyecto">ingrese condigode su</fm:label></td>
                        <td><fm:input path="idProyecto.idProyecto"/></td>
                    </tr>
                    <tr>
                        <td>Imprimir</td>
                        <td> <input type="submit"  value="Guardar" name="registrar"/>
                        </td>
                    </tr>
                </tbody>
            </fm:form>  
        </table>


    </body>
</html>
