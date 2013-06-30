<%-- 
    Document   : proyectoMenu
    Created on : 30-jun-2013, 8:06:02
    Author     : CarlosNoteBook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
            <table border="1" class="table">
                <thead>
                    <tr>
                        <th>Proyecto</th>
                        <th>Empresa</th>
                        <th>Año</th>
                        <th>Opciones</th>
                    </tr>
                </thead>
                <tbody>

                <c:forEach items="${listaProyecto}" var="p">
                    <tr>
                    <td><c:out value="${p.nombrePresupuestos}"/></td>
                    <td><c:out value="${p.nombreEmpresa}"/></td>
                    <td><c:out value="${p.idPeriodo.anioPronostico}"/></td>
                    <td><a href="irProductoProyecto.pacifi?idProyecto=${p.idProyecto}&nombreProyecto=${p.nombrePresupuestos}&nombreEmpresa=${p.nombreEmpresa}"> Ir Proyecto</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </body>
</html>
