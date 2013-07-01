/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmProducto;
import ppm.contable.proyecto.modelo.PpmProductoCiv;
import ppm.contable.proyecto.servicio.ProductoCivServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class ProductoCivController {

    @Autowired
    public ProductoCivServicio servicio;

    @RequestMapping(value = "reporteProductoCiv", method = RequestMethod.GET)
    public ModelAndView irReporte(HttpServletRequest request, HttpServletResponse response) {

        int idProducto = Integer.parseInt(request.getParameter("idProducto") == null ? "" : request.getParameter("idProducto"));;
        String nombreproducto = request.getParameter("nombreProducto") == null ? "" : request.getParameter("nombreProducto");
        PpmProducto ppmProducto = new PpmProducto();
        List<PpmProducto> listaProducto = new ArrayList<PpmProducto>();
        ppmProducto.setNombreProducto(nombreproducto);
        ppmProducto.setIdProducto(idProducto);
        listaProducto.add(ppmProducto);
        request.getSession().setAttribute("NProductoCiv", listaProducto);

        List<PpmProductoCiv> lista = servicio.listarProductoCiv(idProducto);
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaProductoCiv", lista);

        return new ModelAndView("contable/mantenimiento/productoCiv/productoCivList", modelo);
    }

    @RequestMapping(value = "reporteProductoCivA", method = RequestMethod.GET)
    public ModelAndView irReporteCiv(HttpServletRequest request, HttpServletResponse response) {

        List<PpmProducto> producto = (List<PpmProducto>) request.getSession().getAttribute("NProductoCiv");
        int idProducto = 0;
        for (PpmProducto lista : producto) {

            System.out.println("Producto: " + lista.getNombreProducto());
            idProducto = lista.getIdProducto();
        }
        List<PpmProductoCiv> lista = servicio.listarProductoCiv(idProducto);
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaProductoCiv", lista);

        return new ModelAndView("contable/mantenimiento/productoCiv/productoCivList", modelo);
    }

    @RequestMapping(value = "formProductoCivInsert", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloCatalagoCiv") PpmProductoCiv productoCiv, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/productoCiv/productoCivInsert");
    }

    @RequestMapping(value = "guardarProductoCiv", method = RequestMethod.POST)
    public ModelAndView guardar(@ModelAttribute("ModeloProducto") PpmProductoCiv productoCiv, BindingResult result) {
        servicio.insertarProductoCiv(productoCiv);
        return new ModelAndView("redirect:reporteProductoCivA.pacifi");
    }

    @RequestMapping(value = "eliminarProductoCiv", method = RequestMethod.GET)
    public ModelAndView eliminar(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id") == null ? "" : request.getParameter("id"));
        servicio.elimaProductoCiv(id);
        return new ModelAndView("redirect:reporteProductoCivA.pacifi");
    }

    @RequestMapping(value = "editarProductoCivForm", method = RequestMethod.GET)
    public ModelAndView formEdit(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id") == null ? "" : request.getParameter("id"));
        PpmProductoCiv productoCiv = null;
        productoCiv = servicio.buscarProductoCivId(id);

        return new ModelAndView("contable/mantenimiento/productoCiv/productoCivEdit", "ActualizarModelo", productoCiv);
    }

    @RequestMapping(value = "productoCivActualizar", method = RequestMethod.POST)
    public ModelAndView actualizar(@ModelAttribute("ActualizarModelo") PpmProductoCiv productoCiv, BindingResult result) {
        servicio.actualizarProductoCiv(productoCiv);
        return new ModelAndView("redirect:reporteProductoCivA.pacifi");
    }
}
