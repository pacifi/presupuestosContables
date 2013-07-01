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
        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>
    </head>
    <body>

        <div class="container"> 
            <h3>Reporte producto consumo<a href="formProductoConsumo.pacifi">nuevo</a></h3>
            <table border="1" class="table table-striped">
                <tbody>
                    <tr>
                        <td>#</td>
                        <td>Nombre de Comsumo</td>
                        <td>Precio Unitario</td>
                        <td>Medida Base</td>
                        <td>Cantidad</td>
                        <td>Precio Totals</td>
                        <td>Tipo de Comsumo</td>

                    </tr>
                    <c:if test="${!empty listProductoConsumo}"> 
                        <c:set var="i" value="1"/>
                        <c:forEach items="${listProductoConsumo}" var="m">
                            <tr>
                                <td><c:out value="${i}"/></td>
                                <td><c:out value="${m.idConsumo.nombreConsumo}"/></td>
                                <td><c:out value="${m.idConsumo.precioUnitario}"/></td>
                                <td><c:out value="${m.idConsumo.medidaBase}"/></td>
                                <td><c:out value="${m.cantidadUso}"/></td>
                                <td><c:out value="${m.precioGenerado}"/></td>
                                <td><c:out value="${m.idConsumo.tipoConsumo}"/></td>
                                <td> 
                                    <a href="eliminarProductoConsumo.pacifi?idPCon=${m.id}">Eliminar</a> 
                                    <a href="editarProductoConsumo.pacifi?idProductoConsumoP=${m.id}">Editar</a> 
                                </td>
                            </tr> 
                            <c:set var="1" value="${i+1}"/>
                        </c:forEach>

                    </c:if>
                </tbody>
            </table>
        </div>
        <a href="index.pacifi">Ir Inicio</a>


    </body>
</html>
