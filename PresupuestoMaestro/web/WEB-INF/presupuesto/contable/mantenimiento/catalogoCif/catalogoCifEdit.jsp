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
            <c:url value="catalogoCifActualizar.pacifi" var="productoG"/>
            <fm:form modelAttribute="ActualizarModelo" method="post" action="${productoG}">
                <fm:hidden path="idCif" /><br>
                <tbody>
                    <tr>

                        <td><fm:label path="nombreConsumo">nombre Producto</fm:label></td>
                        <td><fm:input path="nombreConsumo"/></td>
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
