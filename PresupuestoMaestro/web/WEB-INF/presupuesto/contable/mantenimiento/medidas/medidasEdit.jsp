<%-- 
    Document   : medidasEdit
    Created on : 22/06/2013, 10:53:44 PM
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
                <h3>Formulario medidas edit</h3>
                <div>
                    <c:url var="medidasy" value="actualizarMedidas.pacifi" />        
                    <fm:form modelAttribute="ActualizarModelo" method="post" action="${medidasy}">
                        <fm:hidden path="idMedidas" /><br>
                        <tbody>
                            <tr><td><fm:label path="nombreMedida">MEDIDAS</fm:label></td>
                                <td> <fm:input path="nombreMedida"/><br></td>
                            </tr>
                            <tr><td><fm:label path="abreviatura">SIMBOLO</fm:label></td>
                                <td><fm:input path="abreviatura"/><br></td>
                            </tr>
                            <tr> <td><input type="submit" value="Enviar"/>
                                </td>
                            </tr>
                        </tbody>
                    </fm:form>


                </div>             
            </div>
    </table>
</body>
</html>

