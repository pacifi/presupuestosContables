<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/Recursos/bootstrap/css/bootstrap.css" />">
        <script type="text/javascript" src="<c:url value="/Recursos/bootstrap/js/bootstrap.js" />"></script>
    </head>

    <body>
        <div class="container"><a href="reporteProyecto.pacifi">Proyectos</a></div>
        <a href="formProducto.pacifi">insertarProducto</a> <br>
        <a href="reporte.pacifi">REPORTE PERIODO</a><br>
        <a href="reporteMedidas.pacifi">REPORTE MEDIDAS</a><br>
        <a href="reporteCatalogoConsumo.pacifi">REPORTE CATALOGO CONSUMO</a><br>
        <a href="reporteProductoConsumo.pacifi">REPORTE  CONSUMO</a><br>
        <a href="reporteCatalogoCiv.pacifi">ir reporte catalogo civ</a><br>
        <a href="reporteCatalogoCif.pacifi"> catalogo cif</a><br>
        <a href="reporteProductoCiv.pacifi"> catalogo productoCiv</a><br>
        <a href="reportePronostico.pacifi"> ir al reporte Pronostico</a><br>
        <a href="presupuestoVentas.pacifi"> ir prueba </a><br>
    </body>
</html>
