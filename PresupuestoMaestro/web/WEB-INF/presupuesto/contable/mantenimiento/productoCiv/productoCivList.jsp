<%-- 
    Document   : productoList
    Created on : 21/06/2013, 02:37:34 PM
    Author     : Pacifi
--%>

<%@page import="ppm.contable.proyecto.modelo.PpmProducto"%>
<%@page import="java.util.List"%>
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
        <%
            List<PpmProducto> producto = (List<PpmProducto>) request.getSession().getAttribute("NProductoCiv");
            int idProducto = 0;
            for (PpmProducto lista : producto) {

                out.println("Producto: " + lista.getNombreProducto());
                idProducto = lista.getIdProducto();
            }
            out.print(idProducto);
        %>

        <div class="container"> 
            <h3>Reporte de ProductoCiv <a href="formProductoCivInsert.pacifi">Nuevo</a></h3>
            <table border="1" class="table table-striped">
                <tbody>
                    <tr>
                        <td>#</td>
                        <td>precio </td>
                        <td>idProducto</td>
                        <td>idCiv</td>
                        <td>opciones</td>


                    </tr>

                    <c:if test="${!empty listaProductoCiv}">
                        <c:set var="i" value="1" />  
                        <c:forEach items="${listaProductoCiv}" var="p">

                            <tr>
                                <td><c:out value="${i}"/> </td>
                                <td><c:out value="${p.precio}"/> </td>
                                <td><c:out value="${p.idProducto.nombreProducto}"/> </td>
                                <td><c:out value="${p.idCiv.nombreCiv}"/> </td>
                                <td> 
                                    <a href="eliminarProductoCiv.pacifi?id=${p.id}">Eliminar</a> 
                                    <a href="editarProductoCivForm.pacifi?id=${p.id}">Editar</a> 
                                </td>
                            </tr>

                            <c:set var="i" value="${i+1}"/>
                        </c:forEach>
                    </c:if>


                </tbody>

            </table>



        </div>

    </body>
</html>
