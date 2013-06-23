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
import ppm.contable.proyecto.modelo.PpmCatalogoCif;
import ppm.contable.proyecto.servicio.CatalogoCifServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class CatalogoCifController {

    @Autowired
    public CatalogoCifServicio servicio;

    @RequestMapping(value = "reporteCatalogoCif", method = RequestMethod.GET)
    public ModelAndView irReporte() {

        List<PpmCatalogoCif> lista = servicio.listaCatalogoCif();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaCatalogoCif", lista);
        return new ModelAndView("contable/mantenimiento/catalogoCif/catalogoCifList", modelo);
    }

    @RequestMapping(value = "formCatalogoInsertCif", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloCatalagoCif") PpmCatalogoCif catalogoCif, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/catalogoCif/catalogoCifInsert");
    }

    @RequestMapping(value = "guardarCatalogoCif", method = RequestMethod.POST)
    public ModelAndView guardarProducto(@ModelAttribute("ModeloProducto") PpmCatalogoCif catalogoCif, BindingResult result) {
        servicio.insertaCatalogoCif(catalogoCif);
        return new ModelAndView("redirect:reporteCatalogoCif.pacifi");
    }

    @RequestMapping(value = "eliminarCatalogoCif", method = RequestMethod.GET)
    public ModelAndView eliminarCatalogoCif(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id") == null ? "" : request.getParameter("id"));
        servicio.eliminarCatalogoCif(id);
        return new ModelAndView("redirect:reporteCatalogoCif.pacifi");
    }

    @RequestMapping(value = "editarCatalogoCifForm", method = RequestMethod.GET)
    public ModelAndView formEditCatalogoCif(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id") == null ? "" : request.getParameter("id"));
        PpmCatalogoCif catalogoCif = null;
        catalogoCif = servicio.buscarCatalogoCifId(id);

        return new ModelAndView("contable/mantenimiento/catalogoCif/catalogoCifEdit", "ActualizarModelo", catalogoCif);
    }

    @RequestMapping(value = "catalogoCifActualizar", method = RequestMethod.POST)
    public ModelAndView actualizarProducto(@ModelAttribute("ActualizarModelo") PpmCatalogoCif catalogoCif, BindingResult result) {
        servicio.actualizaCatalogoCif(catalogoCif);
        return new ModelAndView("redirect:reporteCatalogoCif.pacifi");
    }
}
