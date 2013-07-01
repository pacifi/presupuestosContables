<%-- 
    Document   : productoInsert
    Created on : 21/06/2013, 03:33:53 PM
    Author     : Pacifi
--%>
<%@page import="ppm.contable.proyecto.modelo.PpmProducto"%>
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
            List<PpmProducto> producto = (List<PpmProducto>) request.getSession().getAttribute("NProductoCiv");
            int idProducto = 0;
            for (PpmProducto lista : producto) {

                out.println("Producto: " + lista.getNombreProducto());
                idProducto = lista.getIdProducto();
            }
        %>

        <div class="container">
            <h3>Formulario Civ</h3>
            <table>
                <c:url value="guardarProductoCiv.pacifi" var="pro"/>
                <fm:form modelAttribute="ModeloCatalagoCiv" method="post" action="${pro}">
                    <fm:hidden path="idProducto.idProducto" value="<%=idProducto%>"/><br>
                    <tbody>

                        <tr>
                            <td><fm:label path="precio">precio CIV</fm:label></td>
                            <td><fm:input path="precio"/></td>
                        </tr>

                        <tr>
                            <td><fm:label path="idCiv.idCiv"> idCiv</fm:label></td>
                            <td><fm:input path="idCiv.idCiv"/></td>
                        </tr>

                        <tr>
                            <td></td>
                            <td> <input class="btn btn-success"type="submit"  value="Registrar" name="registrar"/>
                            </td>
                        </tr>
                    </tbody>
                </fm:form>  
            </table>
        </div>

    </body>
</html>
