<%-- 
    Document   : presupuestoVentas
    Created on : 29/06/2013, 03:32:14 PM
    Author     : PacifiNote
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuesto de Ventas</title>
    </head>
    <body>

        <table border="1">
            <thead>
                <tr>
                    <th>Meses</th>
                    <th>Presupuesto de Venta</th>
                    <th>Total</th>
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



    </body>
</html>
