<%-- 
    Document   : periodo
    Created on : 21/06/2013, 09:41:19 AM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reporte periodo</h1>
        <c:if test="${!empty listPeriodo}"> 
           
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="3">
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id Periodo</td>
                        <td>Estado</td>
                        <td>AÑO DE PRONOSTICO</td>
                        <td><a href="formPeriodo.pacifi">INSERTA PERIODO</a><br></td>
                    </tr>
                    <c:forEach items="${listPeriodo}" var="p">
                    <tr>
                        <td><c:out value="${p.idPeriodo}"/></td>
                        <td><c:out value="${p.estado}"/></td>
                        <td><c:out value="${p.anioPronostico}"/></td>
                       <td> 
                            <a href="eliminarPer.pacifi?idPeriodoP=${p.idPeriodo}">Eliminar</a> 
                            <a href="editarPeriodo.pacifi?idPeriodoP=${p.idPeriodo}">Editar</a> 
                        </td> 
                    </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>
         <a href="index.pacifi">Ir Inicio</a>
         
         
    </body>
</html>