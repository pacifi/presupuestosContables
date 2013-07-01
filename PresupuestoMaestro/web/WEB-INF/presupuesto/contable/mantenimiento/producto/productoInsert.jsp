<%-- 
    Document   : productoInsert
    Created on : 21/06/2013, 03:33:53 PM
    Author     : Pacifi
--%>
<%@page import="ppm.contable.proyecto.modelo.PpmProyecto"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>

    </head>
    <body>

        <%
            List<PpmProyecto> proyecto = (List<PpmProyecto>) request.getSession().getAttribute("NProyecto");
            int idProyecto = 0;
            String idProyectoS = null;
            for (PpmProyecto lista : proyecto) {

                out.println("Proyecto: " + lista.getNombrePresupuestos());
                out.println("Empresa: " + lista.getNombreEmpresa());
                idProyecto = lista.getIdProyecto();
                idProyectoS = String.valueOf(idProyecto);
            }
            out.print(idProyecto);
        %>
        <div class="container">
            <h3>Formulario Registrar Producto</h3>

            <table>
                <c:url value="productoGuardar.pacifi" var="productoG"/>

                <fm:form modelAttribute="ModeloProducto" method="post" action="${productoG}">
                    <fm:hidden path="idProyecto.idProyecto" value="<%=idProyecto%>"/><br>
                    <tbody>
                        <tr>
                            <td><fm:label path="nombreProducto">nombreProducto</fm:label></td>
                            <td><fm:input path="nombreProducto"/></td>
                        </tr>
                        <tr>
                            <td><fm:label path="descripcion"> descripcion del producto</fm:label></td>
                            <td><fm:input path="descripcion"/></td>
                        </tr>
                        <tr>
                            <td><fm:label path="invInicial">% Inventario Inicial </fm:label></td>
                            <td><fm:input path="invInicial"/></td>
                        </tr>
                        <tr>
                            <td><fm:label path="politicaInvfin">% para los inventarios finales</fm:label></td>
                            <td><fm:input path="politicaInvfin"/></td>
                        </tr>
                        <tr>
                            <td><fm:label path="margenGanancia">% para el margen de ganancia</fm:label></td>
                            <td><fm:input path="margenGanancia"/></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td> <input class="btn btn-success"  type="submit"  value="Registrar" name="registrar"/>
                            </td>
                        </tr>
                    </tbody>
                </fm:form>  
            </table>
        </div>
    </body>
</html>
