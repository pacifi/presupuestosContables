<%-- 
    Document   : proyectoInsert
    Created on : 30/06/2013, 02:15:02 PM
    Author     : CarlosNoteBook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <table border="1">
            <c:url value="proyectoGuardar.pacifi" var="productoG"/>
            <fm:form modelAttribute="ModeloProyecto" method="post" action="${productoG}">

                <tbody>
                    <tr>
                        <td><fm:label path="nombrePresupuestos">Nombre de Proyecto</fm:label></td>
                        <td><fm:input path="nombrePresupuestos"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="nombreEmpresa">Empresa</fm:label></td>
                        <td><fm:input path="nombreEmpresa"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="codigo">Codigo </fm:label></td>
                        <td><fm:input path="codigo"/></td>
                    </tr>
                    <tr>
                        <td><fm:label path="idPeriodo">Id Periodo</fm:label></td>
                        <td><fm:input path="idPeriodo"/></td>
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
