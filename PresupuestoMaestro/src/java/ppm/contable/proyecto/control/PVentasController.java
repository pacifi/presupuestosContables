/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.math.BigDecimal;
import java.util.ArrayList;
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
        Double inv=Double.parseDouble(String.valueOf(productoServicio.buscarProductoId(7).getPoliticaInvfin()));
       Double dato;
        List<PpmPronosticoVenta> lista=pvs.listaPronosticoVentasProducto(7);
        List<Object> listaR=new ArrayList<Object>();
        
        int i=0;
        for (PpmPronosticoVenta ppmPronosticoVenta : lista) {
           if(i<11){
            dato=lista.get(i+1).getUnidadesVenta()*inv/100;
            listaR.add(dato);
           }i++;
        }
        dato=(double)lista.get(0).getUnidadesVenta();
        listaR.add(dato);
        
       
        return  null;
    }
    
    
    
}
