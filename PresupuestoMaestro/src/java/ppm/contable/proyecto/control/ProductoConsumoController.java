/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmProductoConsumo;
import ppm.contable.proyecto.servicio.ProductoConsumoServicio;

/**
 *
 * @author Pc
 */
@Controller
public class ProductoConsumoController {

    @Autowired
    public ProductoConsumoServicio productoConsumoServicio;
    Log log = LogFactory.getLog(ProductoConsumoController.class);

    @RequestMapping(value = "reporteProductoConsumo", method = RequestMethod.GET)
    public ModelAndView irReporte() {
        List<PpmProductoConsumo> lista = productoConsumoServicio.listaProductoConsumo();

        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listProductoConsumo", lista);

//      for (SauPeriodo to: lista){
//      log.info("------------------->" + to.getPeriodo());
//      }
        return new ModelAndView("contable/mantenimiento/productoConsumo/ProductoConsumo", modelo);
    }

    @RequestMapping(value = "productoConsumoGuardar", method = RequestMethod.POST)
    public ModelAndView guardarProductoConsumo(@ModelAttribute("ModeloProductoConsumo") PpmProductoConsumo productoConsumo, BindingResult result) {
        productoConsumoServicio.insertarProductoConsumo(productoConsumo);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "formProductoConsumo", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloProductoConsumo") PpmProductoConsumo productoConsumo, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/productoConsumo/ProductoConsumoInsert");
    }

    /////////
    @RequestMapping(value = "eliminarProductoConsumo", method = RequestMethod.GET)
    public ModelAndView eliminarProductoConsumo(HttpServletRequest request) {
        int idProductoConsumo = Integer.parseInt(request.getParameter("idPCon") == null ? "" : request.getParameter("idPCon"));
        System.out.println("llega a este punto de control");
        productoConsumoServicio.eliminarProductoConsumo(idProductoConsumo);
        return new ModelAndView("redirect:reporteProductoConsumo.pacifi");
    }
    //*Editar Periodo

    @RequestMapping(value = "editarProductoConsumo", method = RequestMethod.GET)
    public ModelAndView editarProductoConsumoForm(HttpServletRequest request) {
        int idProductoConsumo = Integer.parseInt(request.getParameter("idProductoConsumoP") == null ? "" : request.getParameter("idProductoConsumoP"));
        PpmProductoConsumo productoConsumoTO = null;
        productoConsumoTO = productoConsumoServicio.buscarProductoConsumoId(idProductoConsumo);
        return new ModelAndView("contable/mantenimiento/productoConsumo/ProductoConsumoEdit", "ActualizarProductoConsumo", productoConsumoTO);
    }

    @RequestMapping(value = "actualizarProductoConsumo", method = RequestMethod.POST)
    public ModelAndView actualizarProductoConsumo(@ModelAttribute("ActualizarProductoConsumo") PpmProductoConsumo productoConsumo, BindingResult result) {
        productoConsumoServicio.actualisarProductoConsumo(productoConsumo);
        return new ModelAndView("redirect:reporteProductoConsumo.pacifi");
    }
}
