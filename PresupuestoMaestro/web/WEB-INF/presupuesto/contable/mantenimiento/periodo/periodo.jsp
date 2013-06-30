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
        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>
    </head>
    <body>
        
        <c:if test="${!empty listPeriodo}"> 
           <div class="container"> 
            <table border="1" class="table">
                <thead>
                    <tr>
                        <th colspan="4"> Reporte periodo  <a href="formPeriodo.pacifi">INSERTA PERIODO</a>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id Periodo</td>
                        <td>Estado</td>
                        <td>AÑO DE PRONOSTICO</td>
                       
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
           </div>>
        </c:if>
         <a href="index.pacifi">Ir Inicio</a>
         
         
    </body>
</html>