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
        <h1>Formulario Civ!</h1>
        <table border="1">
            <c:url value="guardarCatalogoCiv.pacifi" var="catalo"/>
            <fm:form modelAttribute="ModeloCatalagoCiv" method="post" action="${catalo}">

                <tbody>
                   
                    <tr>
                        <td><fm:label path="nombreCiv">Nombre CIV</fm:label></td>
                        <td><fm:input path="nombreCiv"/></td>
                    </tr>
                    
                    <tr>
                        <td>Imprimir</td>
                        <td> <input type="submit"  value="Registrar" name="registrar"/>
                        </td>
                    </tr>
                </tbody>
            </fm:form>  
        </table>


    </body>
</html>
