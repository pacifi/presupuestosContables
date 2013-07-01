/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmProyecto;
import ppm.contable.proyecto.servicio.ProyectoServicio;

/**
 *
 * @author CarlosNoteBook
 */
@Controller
public class ProyectoController {
    
    @Autowired
    public ProyectoServicio proyectoServicio;
    
    @RequestMapping(value = "reporteProyecto", method = RequestMethod.GET)
    public ModelAndView reporteProyecto(){
        List<PpmProyecto> lista = proyectoServicio.listaProyecto();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaProyecto", lista);
        return new ModelAndView("contable/proyecto/proyectoMenu",modelo);
    }
    
    @RequestMapping(value = "formProyecto", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloProyecto") PpmProyecto proyecto, BindingResult result) {
        return new ModelAndView("contable/proyecto/proyectoInsert");
    }

    @RequestMapping(value = "proyectoGuardar", method = RequestMethod.POST)
    public ModelAndView guardarProducto(@ModelAttribute("ModeloProyecto") PpmProyecto proyecto, BindingResult result) {
        proyectoServicio.insertaProyecto(proyecto);
        return new ModelAndView("redirect:reporteProyecto.pacifi");
    }

}
