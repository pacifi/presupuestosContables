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
         <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>

    </head>
    <body>
        <h1>Formulario Civ!</h1>
        <div class="container">
            <table border="1" class="table">
            <c:url value="productoCivActualizar.pacifi" var="pro"/>
            <fm:form modelAttribute="ActualizarModelo" method="post" action="${pro}">
                <fm:hidden path="id" /><br>

                <tbody>

                    <tr>
                        <td><fm:label path="precio">precio CIV</fm:label></td>
                        <td><fm:input path="precio"/></td>
                    </tr>

                    <tr>
                        <td><fm:label path="idCiv.idCiv"> idCiv</fm:label></td>
                        <td><fm:input path="idCiv.idCiv"/></td>
                    </tr>

                    <tr>
                        <td><fm:label path="idProducto.idProducto">idProducto</fm:label></td>
                        <td><fm:input path="idProducto.idProducto"/></td>
                    </tr>

                    <tr>
                        <td>Imprimir</td>
                        <td> <input type="submit"  value="Registrar" name="registrar"/>
                        </td>
                    </tr>
                </tbody>
            </fm:form>  
        </table>
        </div>

    </body>
</html>
