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

        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css"/>">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js"/>"></script>

    </head>
    <div class="container">
        
        <table border="1" class="table">
            <body >        

                <div id="cuadroReporteR" style="width: 30%">
                    <h3>Formulario medidas</h3>
                    <div>
                        <c:url var="medidasy" value="medidasGuardar.pacifi" />        
                        <fm:form modelAttribute="ModeloMedidas" method="post" action="${medidasy}">
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
    </div>
</body>
</html>

