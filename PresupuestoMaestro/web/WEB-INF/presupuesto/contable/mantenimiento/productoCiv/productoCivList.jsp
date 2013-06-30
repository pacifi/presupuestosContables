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
        <title>Reporte de ProductosCivssss</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>
    </head>
    <body>  
        
<div class="container"> 
        <table border="2" class="table">

            <thead >
                <tr>
                    <th colspan="7">Reporte de ProductoCiv <a href="formProductoCivInsert.pacifi">insertar</a></th>
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>id </td>
                    <td>precio </td>
                    <td>idProducto</td>
                    <td>idCiv</td>
                    <td>opciones</td>


                </tr>
                <c:if test="${!empty listaProductoCiv}">
                    <c:forEach items="${listaProductoCiv}" var="p">

                        <tr>
                            <td><c:out value="${p.id}"/> </td>
                            <td><c:out value="${p.precio}"/> </td>
                            <td><c:out value="${p.idProducto.nombreProducto}"/> </td>
                            <td><c:out value="${p.idCiv.nombreCiv}"/> </td>
                            <td> 
                                <a href="eliminarProductoCiv.pacifi?id=${p.id}">Eliminar</a> 
                                <a href="editarProductoCivForm.pacifi?id=${p.id}">Editar</a> 
                            </td></tr>
                        </c:forEach>
                    </c:if>


            </tbody>

        </table>



</div>

    </body>
</html>
