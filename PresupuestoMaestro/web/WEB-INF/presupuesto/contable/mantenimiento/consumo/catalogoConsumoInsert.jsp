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
    <table border="1">
        <body >        

            <div id="cuadroReporteR" style="width: 30%">
                <h3>Formulario catalogo consumo</h3>
                
                <div>
                    <c:url var="consumoy" value="catalogoConsumoGuardar.pacifi" />        
                    <fm:form modelAttribute="ModeloCatalogoConsumo" method="post" action="${consumoy}">
                        <tbody>
                            <tr><td> <fm:label path="nombreConsumo"> NOMBRE CONSUMO</fm:label></td>
                                <td><fm:input path="nombreConsumo"/><br></td>
                            </tr>   
                            <tr><td><fm:label path="precioUnitario">PRECIO UNITARIO</fm:label></td>
                                <td><fm:input path="precioUnitario"/><br></td>
                            </tr>  
                            <tr><td><fm:label path="medidaBase">MEDIDA BACE</fm:label></td>
                                <td><fm:input path="medidaBase"/><br></td>
                            </tr>  
                            <tr><td><fm:label path="tipoConsumo">TIPO CONSUMO</fm:label></td>
                                <td><fm:input path="tipoConsumo"/><br></td>
                            </tr>  
                            <tr><td><fm:label path="codigo">CODIGO</fm:label></td>
                                <td><fm:input path="codigo"/><br></td>
                            </tr>    
                            <tr><td><fm:label path="idMedidas.idMedidas">ID MEDIDAS</fm:label></td>
                                <td><fm:input path="idMedidas.idMedidas"/><br></td>
                            </tr>
                            <tr>
                                <td> <input type="submit" value="Enviar"/>
                                </td> 
                            </tr>
                        </tbody>
                    </fm:form>

                    </table>

                    </body>
                    </html>

