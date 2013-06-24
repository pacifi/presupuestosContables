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
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;
import ppm.contable.proyecto.servicio.PronosticoVentaServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class PronosticoVentaController {

    @Autowired
    public PronosticoVentaServicio servicio;

    @RequestMapping(value = "reportePronostico", method = RequestMethod.GET)
    public ModelAndView irReporte() {
        List<PpmPronosticoVenta> lista = servicio.listaPronosticoVenta();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaPronostico", lista);
        return new ModelAndView("contable/mantenimiento/pronosticoVenta/pronosticoList", modelo);
    }

    @RequestMapping(value = "formPronosticogoInsert", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloPronostico") PpmPronosticoVenta pronosticoVenta, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/pronosticoVenta/pronosticoInsert");
    }

    @RequestMapping(value = "pronosticoGuardar", method = RequestMethod.POST)
    public ModelAndView guardar(@ModelAttribute("ModeloPronostico") PpmPronosticoVenta pronosticoVenta, BindingResult result, HttpServletRequest request) {

        int id = 2;
        System.out.println("aca " + id);
        id = Integer.parseInt(request.getParameter("idPCon") == null ? "" : request.getParameter("idPCon"));
        System.out.println("aca " + id);
        servicio.insertaPronosticoVenta(pronosticoVenta);

        return new ModelAndView("redirect:reportePronostico.pacifi");
    }

    @RequestMapping(value = "eliminarPronostico", method = RequestMethod.GET)
    public ModelAndView eliminarProducto(HttpServletRequest request) {
        int idProducto = Integer.parseInt(request.getParameter("idPCon") == null ? "" : request.getParameter("idPCon"));
        System.out.println("aca el id"+idProducto);
        servicio.eliminarPronosticoVenta(idProducto);
        return new ModelAndView("redirect:reportePronostico.pacifi");
    }
}
