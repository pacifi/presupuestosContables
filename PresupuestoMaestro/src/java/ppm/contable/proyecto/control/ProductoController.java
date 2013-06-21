/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmProducto;
import ppm.contable.proyecto.servicio.ProductoServicio;

@Controller
public class ProductoController {

    @Autowired
    public ProductoServicio servicio;

    @RequestMapping(value = "reporteProducto", method = RequestMethod.GET)
    public ModelAndView irReporte() {

        List<PpmProducto> lista = servicio.listarProducto();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaProducto", lista);

        return new ModelAndView("contable/mantenimiento/producto/productoList", modelo);

    }

    @RequestMapping(value = "formProducto", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloProducto") PpmProducto producto, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/producto/productoInsert");
    }

    @RequestMapping(value = "productoGuardar", method = RequestMethod.POST)
    public ModelAndView guardarProducto(@ModelAttribute("ModeloProducto") PpmProducto producto, BindingResult result) {
        servicio.insertaPeriodo(producto);
        return new ModelAndView("redirect:reporteProducto.pacifi");
        
       
    }
}
