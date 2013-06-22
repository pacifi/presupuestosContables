<%-- 
    Document   : ConsumoInsert
    Created on : 21/06/2013, 11:25:57 PM
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
                        <h3>Formulario consumo</h3>
                        <div>
        <c:url var="consumoy" value="catalogoConsumoGuardar.pacifi" />        
        <fm:form modelAttribute="ModeloCatalogoConsumo" method="post" action="${consumoy}">
         
            <fm:label path="nombreConsumo"> NOMBRE CONSUMO</fm:label>
            <fm:input path="nombreConsumo"/><br>
            <fm:label path="precioUnitario">PRECIO UNITARIO</fm:label>
            <fm:input path="precioUnitario"/><br>
            <fm:label path="medidaBase">MEDIDA BACE</fm:label>
            <fm:input path="medidaBase"/><br>
            <fm:label path="tipoConsumo">TIPO CONSUMO</fm:label>
            <fm:input path="tipoConsumo"/><br>
            <fm:label path="codigo">CODIGO</fm:label>
            <fm:input path="codigo"/><br>
            <fm:label path="idMedidas.idMedidas">ID MEDIDAS</fm:label>
            <fm:input path="idMedidas.idMedidas"/><br>
            
            
            <input type="submit" value="Enviar"/>
        </fm:form>
                     

            </div>             
            </div>
    </body>
</html>

