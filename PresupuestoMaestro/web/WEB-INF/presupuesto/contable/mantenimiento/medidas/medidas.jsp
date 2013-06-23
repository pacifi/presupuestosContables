<%-- 
    Document   : medidas
    Created on : 21/06/2013, 09:13:01 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:if test="${!empty listMedidas}"> 
           
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="3"> Reporte medidas</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id MEDIDAS</td>
                        <td>MEDIDAS</td>
                        <td>SIMBOLOS</td>
                       
                    </tr>
                    <c:forEach items="${listMedidas}" var="m">
                    <tr>
                        <td><c:out value="${m.idMedidas}"/></td>
                        <td><c:out value="${m.nombreMedida}"/></td>
                        <td><c:out value="${m.abreviatura}"/></td>
                        <td> 
                            <a href="eliminarProducto.pacifi?idProductoP=${p.idProducto}">Eliminar</a> 
                            <a href="editarProductoForm.pacifi?idProductoP=${p.idProducto}">Editar</a> 
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>
         <a href="index.pacifi">Ir Inicio</a>
         
         
    </body>
</html>