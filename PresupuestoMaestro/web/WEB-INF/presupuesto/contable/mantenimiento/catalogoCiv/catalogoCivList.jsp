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
    </head>
    <body>  
        

        <table border="2">

            <thead >
                <tr>
                    <th colspan="7">Reporte de Catalogos <a href="formCatalogoInsert.pacifi">insertar</a></th>
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>id Producto</td>
                    <td>Nombre Producto</td>
                    <td>opciones</td>


                </tr>
                <c:if test="${!empty listaCatalogoCiv}">
                    <c:forEach items="${listaCatalogoCiv}" var="p">

                        <tr>
                            <td><c:out value="${p.idCiv}"/> </td>
                            <td><c:out value="${p.nombreCiv}"/> </td>
                            <td> 
                                <a href="eliminarCatalogoCiv.pacifi?id=${p.idCiv}">Eliminar</a> 
                                <a href="editarCatalogoCivForm.pacifi?id=${p.idCiv}">Editar</a> 
                            </td></tr>
                        </c:forEach>
                    </c:if>


            </tbody>

        </table>





    </body>
</html>
