<%-- 
    Document   : productoList
    Created on : 21/06/2013, 02:37:34 PM
    Author     : Pacifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Productos</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>
    </head>
    <body>  

        <div class="container"> 
            <table border="2" class="table">

                <thead>
                    <tr>
                        <th colspan="7">Reporte de Catalogos <a href="formCatalogoInsertCif.pacifi">insertar</a></th>

                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>id Producto</td>
                        <td>Nombre Producto</td>
                        <td>opciones</td>


                    </tr>
                    <c:if test="${!empty listaCatalogoCif}">
                        <c:forEach items="${listaCatalogoCif}" var="p">

                            <tr>
                                <td><c:out value="${p.idCif}"/> </td>
                                <td><c:out value="${p.nombreConsumo}"/> </td>
                                <td> 
                                    <a href="eliminarCatalogoCif.pacifi?id=${p.idCif}">Eliminar</a> 
                                    <a href="editarCatalogoCifForm.pacifi?id=${p.idCif}">Editar</a> 
                                </td></tr>
                            </c:forEach>
                        </c:if>


                </tbody>

            </table>



        </div>
    </body>
</html>
