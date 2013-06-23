<%-- 
    Document   : periodoEdit
    Created on : 22/06/2013, 11:23:58 PM
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
                        <h3>Formulario periodo edit</h3>
                        <div>
        <c:url var="productoy" value="actualizarPeriodo.pacifi" />        
        <fm:form modelAttribute="ActualizarModelo" method="post" action="${productoy}">
            <fm:hidden path="idPeriodo" /><br>
         <tbody> 
             <tr>
            <td><fm:label path="estado"> ESTADO PERIODO</fm:label></td>
            <td><fm:input path="estado"/><br></td>
            </tr>
            <tr>
            <td><fm:label path="anioPronostico">AÑO PRONOSTICO</fm:label></td>
            <td><fm:input path="anioPronostico"/><br></td>
            </tr>
            <tr>
            <td><input type="submit" value="Enviar"/>
            </td>
            </tr>
            </tbody>
        </fm:form>
                     
 </table>
            </div>             
            </div>
    </body>
</html>

