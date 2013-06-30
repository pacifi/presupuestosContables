<%-- 
    Document   : produccion
    Created on : 29/06/2013, 09:18:57 PM
    Author     : noe
--%>

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
        <div class="container">
            <table border="1" class="table">
            <thead>
                <tr>
                    <th>Meses</th>
                    <th>Produccion requerida</th>
                    <th>Total</th>
                </tr>
            </thead>
            <tbody>
               
               
                <c:forEach items="${listaPresupuesto}" var="p">
                    <tr>
                        <td><c:out value="${p.nombreProducto}"/></td>
                        <td><c:out value="${p.meses}"/></td>
                        <td><c:out value="${p.produccionRequerida}"/></td>
                        <td><c:out value="${p.total}"/></td>

                    </tr>
                </c:forEach>
             
            </tbody>
        </table>
            </div>
</body>
</html>

