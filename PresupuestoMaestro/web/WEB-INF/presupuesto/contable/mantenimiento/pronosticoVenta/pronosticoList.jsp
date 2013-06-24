<%-- 
    Document   : ProductoConsumo
    Created on : 22/06/2013, 01:02:19 PM
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



        <table border="1">
            <h1>Reporte producto consumo</h1>
            <thead>
                <tr>
                    <th colspan="6"> REPORTE PRODUCTO CONSUMO<a href="formPronosticogoInsert.pacifi">INSERTA PRODUCTO CONSUMO</a>    
                    </th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Id pronostico</td>
                    <td>Unidades de Venta</td>
                    <td>producto</td>
                    <td>Meses</td>
                    <td>Opciones</td>

                </tr>
                <c:if test="${!empty listaPronostico}"> 
                    <c:forEach items="${listaPronostico}" var="m">
                        <tr>
                            <td><c:out value="${m.idPronostico}"/></td>
                            <td><c:out value="${m.unidadesVenta}"/></td>
                            <td><c:out value="${m.idProducto.nombreProducto}"/></td>
                            <td><c:out value="${m.idMeses.nombreMes}"/></td>
                            <td>
                                <a href="eliminarPronostico.pacifi?idPCon=${m.idPronostico}">Eliminar</a> 
                            </td>
                        </tr> 
                    </c:forEach>

                </c:if>
            </tbody>
        </table>

        <a href="index.pacifi">Ir Inicio</a>


    </body>
</html>
