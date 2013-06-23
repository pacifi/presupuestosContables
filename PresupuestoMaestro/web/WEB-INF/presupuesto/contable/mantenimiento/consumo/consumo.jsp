<%-- 
    Document   : consumo
    Created on : 21/06/2013, 10:44:29 PM
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
        <h1>titulos</h1>
        
        <a href="formCatalogoConsumo.pacifi">ir inserta CONSUMO</a><br>

        <c:if test="${!empty listCatalogoConsumo}"> 
           
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="3"> REPORTE CATALOGO CONSUMO</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id CONSUMO</td>
                        <td>NOMBRE CONSUMO</td>
                        <td>PRECIO UNITARIO</td>
                       <td>MEDIDA BACE</td>
                        <td>TIPO CONSUMO</td>
                        <td>CODIGO</td>
                        <td> MEDIDA</td>
                    </tr>
                    <c:forEach items="${listCatalogoConsumo}" var="m">
                    <tr>
                        <td><c:out value="${m.idConsumo}"/></td>
                        <td><c:out value="${m.nombreConsumo}"/></td>
                        <td><c:out value="${m.precioUnitario}"/></td>
                        <td><c:out value="${m.medidaBase}"/></td>
                        <td><c:out value="${m.tipoConsumo}"/></td>
                        <td><c:out value="${m.codigo}"/></td>
                        <td><c:out value="${m.idMedidas.nombreMedida}"/></td>
                     <td> 
                            <a href="eliminarCatalogoConsumo.idCatalogoConsumoP=${m.idConsumo}">Eliminar</a> 
                            <a href="editarProductoConsumo.pacifi?idProductoConsumoP=${m.idConsumo}">Editar</a> 
                        </td>   
                    </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>
         <a href="index.pacifi">Ir Inicio</a>
         
         
    </body>
</html>
