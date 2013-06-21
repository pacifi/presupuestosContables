<%-- 
    Document   : PeriodoInsert
    Created on : 21/06/2013, 01:32:02 PM
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
        <c:url var="periodoy" value="periodoGuardar.pacifi" />        
        <fm:form modelAttribute="ModeloPeriodo" method="post" action="${periodoy}">
           
                  
           
        
             <table border="1">
               <tbody>
                   
                    
                        
                        <td> <fm:input path="nombreClienteRs" /><br></td>
                    </tr>
                    <tr>
                        <td> <fm:label path="numeroDocumento">Numero Documento </fm:label></td>
                        <td> <fm:input path="numeroDocumento" /></td>
                    </tr>
                   
                    <tr>
                        <td>Imprimir</td>
                        <td> <input type="submit"  value="Registrar" name="registrar"/>
                           </td>
                    </tr>
                    
                </tbody>
            </table>
                    </fm:form>  

            </div>             
            </div>
    </body>
</html>
