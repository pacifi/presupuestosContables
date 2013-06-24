/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;
import ppm.contable.proyecto.servicio.ProductoServicio;
import ppm.contable.proyecto.servicio.PronosticoVentaServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class PVentasController {
    
    @Autowired
    public ProductoServicio productoServicio;
    
    @Autowired
    public PronosticoVentaServicio pvs;
    
    @RequestMapping(value = "reportePronosticoVentaProducto", method = RequestMethod.GET)
    public ModelAndView opracionVenta(){
        
        List<PpmPronosticoVenta> lista=pvs.listaPronosticoVentasProducto(7);
        
        System.out.println("aca datos capturados"+lista.get(1).getIdProducto().getNombreProducto());
    
        return  null;
    }
    
}
