<%-- 
    Document   : presupuestoVentas
    Created on : 29/06/2013, 03:32:14 PM
    Author     : PacifiNote
--%>

<%@page import="ppm.contable.proyecto.modelo.PpmProyecto"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuesto de Ventas</title>
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
        <div class="container">
        <table border="1" class="table">
            <thead>
                <tr>
                    <th>Producto</th>
                    <th> Mes</th>
                    <th>Total Parcial Mes </th>
                    <th>Total Acumulado</th>
                </tr>
            </thead>
            <tbody>



                <c:forEach items="${listaPresupuesto}" var="p">
                    <tr>
                        <td><c:out value="${p.nombreProducto}"/></td>
                        <td><c:out value="${p.meses}"/></td>
                        <td><c:out value="${p.presupuesto}"/></td>
                        <td><c:out value="${p.total}"/></td>
                    </tr>
                </c:forEach>


            </tbody>
        </table>
        </div>

    </body>
</html>
