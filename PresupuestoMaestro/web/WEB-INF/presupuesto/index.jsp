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
        <style type="text/css">
            body {
                padding-top: 60px;
                padding-bottom: 40px;
            }
        </style>

        <link type="text/css" href="<c:url value="/Recursos/assets/css/bootstrap-responsive.css"/>" rel="stylesheet">

    </head>

    <body>

        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="#">PPM</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="reporteProyecto.pacifi">Proyectos</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="#contact">Contact</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li class="nav-header">Nav header</li>
                                    <li><a href="#">Separated link</a></li>
                                    <li><a href="#">One more separated link</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="hero-unit">
                <h1>Hello, Welcome to Budget Maestro!</h1>
                <p>This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
                <p><a href="formProyecto.pacifi" class="btn btn-primary btn-large">New Proyect &raquo;</a></p>
            </div>

            <hr>

            <footer>
                <p>&copy; Company 2013</p>
            </footer>

        </div> 

        <script src="<c:url value="/Recursos/assets/js/jquery.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-transition.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-alert.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-modal.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-dropdown.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-scrollspy.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-tab.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-tooltip.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-popover.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-button.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-collapse.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-carousel.js" />"></script>
        <script src="<c:url value="/Recursos/assets/js/bootstrap-typeahead.js" />"></script>

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
