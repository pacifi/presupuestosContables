<%-- 
    Document   : pronosticoInsert
    Created on : 29/06/2013, 07:16:46 PM
    Author     : PacifiNote
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        
        
        <form name="Form Alumno" method="post" action="pronosticoGuardar.pacifi">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Formulario Actualizar Alumno</th>
                        
                    </tr>
                </thead>
                <tbody>
                    
                    <tr>
                        <td>Código de Producto:</td>
                        <td><input type="text" name="codigo" id="codigo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enero</td>
                        <td><input type="text" name="enero" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Febroro</td>
                        <td><input type="text" name="febrero" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Marzo</td>
                        <td><input type="text" name="marzo" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Abril</td>
                        <td><input type="text" name="abril" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Mayo:</td>
                        <td><input type="text" name="mayo" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Junio:</td>
                        <td><input type="text" name="junio" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Julio:</td>
                        <td><input type="text" name="julio" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Agosto:</td>
                        <td><input type="text" name="agosto" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Setiembre:</td>
                        <td><input type="text" name="setiembre" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Octubre:</td>
                        <td><input type="text" name="octubre" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Noviembre:</td>
                        <td><input type="text" name="noviembre" id="codigo" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Diciembre:</td>
                        <td><input type="text" name="diciembre" id="codigo" value="" /></td>
                    </tr>
                    
                    
                   
                   <tr>
                       <td>
                            <input type="hidden" name="opt" value="1"/>    
                            <input type="submit" value="Actualizar" name="actualizar" />
                            <input type="button" value="Cancelar" name="cancelar" onclick="ocultarFormInsert()" />
                        </td>
                       
                    </tr>
                </tbody>
            </table>

        </form>
        
    </body>
</html>
