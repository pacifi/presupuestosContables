<%-- 
    Document   : medidas
    Created on : 21/06/2013, 09:13:01 PM
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
        
        <c:if test="${!empty listMedidas}"> 
           <div class="container"> 
            <table border="1" class="table">
                
                
                <thead>
                    <tr>
                        <th colspan="4">  Reporte medidas <a href="formMedidas.pacifi">INSERTA MEDIDAS</a>
                        
                    </tr>
                </thead>
                <tbody>
                   
                    <tr>
                        <td>Id MEDIDAS</td>
                        <td>MEDIDAS</td>
                        <td>SIMBOLOS</td>
                        
                    </tr>
                    <c:forEach items="${listMedidas}" var="m">
                    <tr>
                        <td><c:out value="${m.idMedidas}"/></td>
                        <td><c:out value="${m.nombreMedida}"/></td>
                        <td><c:out value="${m.abreviatura}"/></td>
                        <td> 
                            <a href="eliminarMedidas.pacifi?idMedidasP=${m.idMedidas}">Eliminar</a> 
                            <a href="editarMedidas.pacifi?idMedidasP=${m.idMedidas}">Editar</a> 
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