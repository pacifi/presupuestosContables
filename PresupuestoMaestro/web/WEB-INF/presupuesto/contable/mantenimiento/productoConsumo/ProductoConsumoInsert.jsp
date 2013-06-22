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
    
    <body >        
    
        <div id="cuadroReporteR" style="width: 30%">
                        <h3>Formulario PRODUCTO CONSUMO</h3>
                        <div>
        <c:url var="productoConsumoy" value="productoConsumoGuardar.pacifi" />        
        <fm:form modelAttribute="ModeloProductoConsumo" method="post" action="${productoConsumoy}">
         
            <fm:label path="cantidadUso"> CANTIDAD CONSUMO</fm:label>
            <fm:input path="cantidadUso"/><br>
            <fm:label path="precioGenerado">PRECIO GENERADO</fm:label>
            <fm:input path="precioGenerado"/><br>
            <fm:label path="idProducto.idProducto">ID PRODUCTO</fm:label>
            <fm:input path="idProducto.idProducto"/><br>
            <fm:label path="idConsumo.idConsumo">ID CONSUMO</fm:label>
            <fm:input path="idConsumo.idConsumo"/><br>
            <input type="submit" value="Enviar"/>
        </fm:form>
                     

            </div>             
            </div>
    </body>
</html>


