<%-- 
    Document   : MedidasInsert
    Created on : 21/06/2013, 09:29:04 PM
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
                        <h3>Formulario de Periodo</h3>
                        <div>
        <c:url var="medidasy" value="medidasGuardar.pacifi" />        
        <fm:form modelAttribute="ModeloMedidas" method="post" action="${medidasy}">
         <fm:label path="nombreMedida">MEDIDAS</fm:label>
            <fm:input path="nombreMedida"/><br>
            <fm:label path="abreviatura">SIMBOLO</fm:label>
            <fm:input path="abreviatura"/><br>
            <input type="submit" value="Enviar"/>
        </fm:form>
                     

            </div>             
            </div>
    </body>
</html>

