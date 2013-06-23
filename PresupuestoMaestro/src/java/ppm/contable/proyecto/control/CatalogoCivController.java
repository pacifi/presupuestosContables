/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;
import ppm.contable.proyecto.servicio.CatalogoCivServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class CatalogoCivController {

    @Autowired
    public CatalogoCivServicio servicio;

    @RequestMapping(value = "reporteCatalogoCiv", method = RequestMethod.GET)
    public ModelAndView irReporte() {

        List<PpmCatalogoCiv> lista = servicio.listaCatalogoCiv();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaCatalogoCiv", lista);
        return new ModelAndView("contable/mantenimiento/catalogoCiv/catalogoCivList", modelo);
    }

    @RequestMapping(value = "formCatalogoInsert", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloCatalagoCiv") PpmCatalogoCiv catalogoCiv, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/catalogoCiv/catalogoCivInsert");
    }

    @RequestMapping(value = "guardarCatalogoCiv", method = RequestMethod.POST)
    public ModelAndView guardarProducto(@ModelAttribute("ModeloProducto") PpmCatalogoCiv catalogoCiv, BindingResult result) {
        servicio.insertaCatalogoCiv(catalogoCiv);
        return new ModelAndView("redirect:reporteCatalogoCiv.pacifi");
    }

    @RequestMapping(value = "eliminarCatalogoCiv", method = RequestMethod.GET)
    public ModelAndView eliminarCatalogoCiv(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id") == null ? "" : request.getParameter("id"));
        servicio.eliminarCatalogoCiv(id);
        return new ModelAndView("redirect:reporteCatalogoCiv.pacifi");
    }

    @RequestMapping(value = "editarCatalogoCivForm", method = RequestMethod.GET)
    public ModelAndView formEditCatalogoCiv(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id") == null ? "" : request.getParameter("id"));
        PpmCatalogoCiv catalogoCiv = null;
        catalogoCiv = servicio.buscarCatalogoCivId(id);

        return new ModelAndView("contable/mantenimiento/catalogoCiv/catalogoCivEdit", "ActualizarModelo", catalogoCiv);
    }

    @RequestMapping(value = "catalogoCivActualizar", method = RequestMethod.POST)
    public ModelAndView actualizarProducto(@ModelAttribute("ActualizarModelo") PpmCatalogoCiv catalogoCiv, BindingResult result) {
        servicio.actualizaCatalogoCiv(catalogoCiv);
        return new ModelAndView("redirect:reporteCatalogoCiv.pacifi");
    }
}
