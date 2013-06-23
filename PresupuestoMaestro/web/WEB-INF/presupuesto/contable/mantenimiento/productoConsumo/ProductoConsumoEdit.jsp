<%-- 
    Document   : ProductoConsumoEdit
    Created on : 22/06/2013, 05:28:13 PM
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
                        <h3>Formulario PRODUCTO CONSUMO EDIT</h3>
                        
        <c:url var="productoConsumoActualizary" value="actualizarProductoConsumo.pacifi" />        
        <fm:form modelAttribute="ActualizarProductoConsumo" method="post" action="${productoConsumoActualizary}">
            <fm:hidden path="id" /><br>
         <tbody>
            <tr><td><fm:label path="cantidadUso"> CANTIDAD CONSUMO</fm:label></td>
            <td><fm:input path="cantidadUso"/><br></td>
            </tr>
            <tr><td><fm:label path="precioGenerado">PRECIO GENERADO</fm:label></td>
            <td><fm:input path="precioGenerado"/><br></td>
            </tr>
            <tr><td><fm:label path="idProducto.idProducto">ID PRODUCTO</fm:label></td>
            <td><fm:input path="idProducto.idProducto"/><br></td>
            </tr>
            <tr><td><fm:label path="idConsumo.idConsumo">ID CONSUMO</fm:label></td>
            <td><fm:input path="idConsumo.idConsumo"/><br></td>
            </tr>
            <tr><td><input type="submit" value="Enviar"/></td>
            </tr>
            </tbody>
        </fm:form>
          </table>            

            </div>             
            </div>
    </body>
</html>



