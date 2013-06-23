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
            <thead>
                <tr>
                    <th colspan="3"> REPORTE PRODUCTO CONSUMO   <a href="formProductoConsumo.pacifi">insertar</a> 
                             </th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Id PRODUCTO CONSUMO</td>
                    <td>NOMBRE CONSUMO</td>
                    <td>PRECIO UNITARIO</td>
                    <td>MEDIDA BACE</td>
                    <td>TIPO CONSUMO</td>

                </tr>
                <c:if test="${!empty listProductoConsumo}"> 
                    <c:forEach items="${listProductoConsumo}" var="m">
                        <tr>
                            <td><c:out value="${m.id}"/></td>
                            <td><c:out value="${m.cantidadUso}"/></td>
                            <td><c:out value="${m.precioGenerado}"/></td>
                            <td><c:out value="${m.idProducto.nombreProducto}"/></td>
                            <td><c:out value="${m.idConsumo.nombreConsumo}"/></td>
                            <td> 
                                <a href="eliminarProductoConsumo.pacifi?idPCon=${m.id}">Eliminar</a> 
                                <a href="editarProductoConsumo.pacifi?idProductoConsumoP=${m.id}">Editar</a> 
                            </td>
                        </tr> 
                    </c:forEach>

                </c:if>
            </tbody>
        </table>

        <a href="index.pacifi">Ir Inicio</a>


    </body>
</html>
