<%-- 
    Document   : productoList
    Created on : 21/06/2013, 02:37:34 PM
    Author     : Pacifi
--%>

<%@page import="ppm.contable.proyecto.modelo.PpmProyecto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sun.org.apache.xerces.internal.impl.xs.identity.ValueStore"%>
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

        <%
            List<PpmProyecto> proyecto = (List<PpmProyecto>) request.getSession().getAttribute("NProyecto");
            int idProyecto = 0;
            for (PpmProyecto lista : proyecto) {

                out.println("Proyecto: " + lista.getNombrePresupuestos());
                out.println("Empresa: " + lista.getNombreEmpresa());
                idProyecto = lista.getIdProyecto();
            }
            out.print(idProyecto);
        %>



        <c:if test="${!empty listaProducto}">
            <div class="container"> 
                <table border="1" class="table">

                    <thead >
                        <tr>
                            <th colspan="7">Reporte de productos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>id Producto</td>
                            <td>Nombre Producto</td>
                            <td>descripcion</td>
                            <td> % Inv Final</td>
                            <td>% Utilidad</td>
                            <td> proyecto</td>
                            <td> Opciones</td>

                        </tr>
                        <c:forEach items="${listaProducto}" var="p">

                            <tr>
                                <td><c:out value="${p.idProducto}"/> </td>
                                <td><c:out value="${p.nombreProducto}"/> </td>
                                <td><c:out value="${p.descripcion}"/> </td>
                                <td><c:out value="${p.politicaInvfin}"/> </td>
                                <td><c:out value="${p.margenGanancia}"/> </td>
                                <td><c:out value="${p.idProyecto.nombrePresupuestos}"/> </td>
                                <td> 
                                    <a href="eliminarProducto.pacifi?idProductoP=${p.idProducto}">Eliminar</a> 
                                    <a href="editarProductoForm.pacifi?idProductoP=${p.idProducto}">Editar</a> 

                                </td></tr>
                            </c:forEach>


                    </tbody>

                </table>
            </div>>
        </c:if>

        <a href="presupuestoVentas.pacifi?idProyecto=<%=idProyecto%>"> Presupuesto de Ventas</a>
    </body>
</html>
