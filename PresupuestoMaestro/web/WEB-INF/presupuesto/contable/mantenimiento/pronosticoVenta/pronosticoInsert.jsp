<%-- 
    Document   : ProductoConsumoInsert
    Created on : 22/06/2013, 01:49:25 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  <title>JSP Page</title>


    </head>
    <table border="1">
        <body >        

            <div id="cuadroReporteR" style="width: 30%">
                <h3>Formulario Pronostico Venta</h3>
                <div>
                    <c:url var="pros" value="pronosticoGuardar.pacifi" />        
                    <fm:form modelAttribute="ModeloPronostico" method="post" action="${pros}">
                        <tbody>
                           
                            <tr>
                                <td><fm:label   path="unidadesVenta[]">Pronostico de Unidades Enereo</fm:label></td>
                                <td><fm:input path="unidadesVenta[]"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label   path="unidadesVenta">Pronostico de Unidades Febrero</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label   path="unidadesVenta">Pronostico de Unidades Marzo</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label  path="unidadesVenta">Pronostico de Unidades Abril</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="5"  path="unidadesVenta">Pronostico de Unidades Mayo</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="6"  path="unidadesVenta">Pronostico de Unidades Junio</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="7"  path="unidadesVenta">Pronostico de Unidades Julio</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="8"  path="unidadesVenta">Pronostico de Unidades Agosto</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="9"  path="unidadesVenta">Pronostico de Unidades Setiembre</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="10"  path="unidadesVenta">Pronostico de Unidades Octubre</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="11"  path="unidadesVenta">Pronostico de Unidades Noviembre</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            <tr>
                                <td><fm:label id="12"  path="unidadesVenta">Pronostico de Unidades Diciembre</fm:label></td>
                                <td><fm:input path="unidadesVenta"/><br></td>
                            </tr>
                            
                            <tr><td><fm:label path="idProducto.idProducto">ID idProducto</fm:label></td>
                                <td><fm:input path="idProducto.idProducto"/><br></td>
                            </tr>
                            <tr><td><input type="submit" value="Guardar"/></td>
                            </tr>
                        </tbody>
                    </fm:form>
                    </table>            

                </div>             
            </div>
        </body>
</html>


