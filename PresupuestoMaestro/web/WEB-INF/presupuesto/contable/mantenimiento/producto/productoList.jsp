<%-- 
    Document   : productoList
    Created on : 21/06/2013, 02:37:34 PM
    Author     : Pacifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Productos</title>
    </head>
    <body>
       
         <c:if test="${!empty listaProducto}">
             <table border="1">
                 
                 <thead >
                     <tr>
                         <th colspan="7">Reporte de productos</th>
                     </tr>
                 </thead>
                 <tbody>
                     <tr>
                         <td>id Producto</td>
                         <td>Nombre Producto</td>
                         <td>descripcion</td>
                         <td> % Inv Final</td>
                         <td>% Utilidad</td>
                         <td> proyecto</td>
                         <td> Opciones</td>
                         
                     </tr>
                     <c:forEach items="${listaProducto}" var="p">
                         
                         <tr>
                         <td><c:out value="${p.idProducto}"/> </td>
                         <td><c:out value="${p.nombreProducto}"/> </td>
                         <td><c:out value="${p.descripcion}"/> </td>
                         <td><c:out value="${p.politicaInvfin}"/> </td>
                         <td><c:out value="${p.margenGanancia}"/> </td>
                         <td><c:out value="${p.idProyecto.nombrePresupuestos}"/> </td>
                         <td> 
                            <a href="eliminarProducto.dmp?idProductoP=${p.idProducto}">Eliminar</a> 
                            <a href="editarProducto.dmp?idProductoP=${p.idProducto}">Editar</a> 
                        </td></tr>
                     </c:forEach>
                        
                     
                 </tbody>
                 
             </table>
                 
                 
            
        </c:if>
        
        
    </body>
</html>
