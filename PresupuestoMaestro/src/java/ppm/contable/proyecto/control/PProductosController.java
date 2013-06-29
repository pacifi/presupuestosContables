/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;
import ppm.contable.proyecto.servicio.ProductoConsumoServicio;

import ppm.contable.proyecto.servicio.PronosticoVentaServicio;

/**
 *
 * @author noe
 */
@Controller
public class PProductosController {
    @Autowired
    public ProductoConsumoServicio productoConsumoServicio;
    
    @Autowired
    public PronosticoVentaServicio pvs;
    
    @RequestMapping(value = "reportePronosticoProducto", method = RequestMethod.GET)
    public ModelAndView opracionVenta(){
        Double inv=Double.parseDouble(String.valueOf(productoConsumoServicio.buscarProductoConsumoId(5).getPoliticaInvfin()));
     
        Double dato;
        List<PpmPronosticoVenta> lista=pvs.listaPronosticoVentasProducto(5);
        List<Object> listaR=new ArrayList<Object>();
        System.err.println("aqui llegaaaaaaaaaaaaa");
        int i=0;
        for (PpmPronosticoVenta ppmPronosticoVenta : lista) {
           if(i<1){
            dato=lista.get(i+1).getUnidadesVenta()*inv/100;
               System.out.println(dato);
            listaR.add(dato);
           }i++;
        //System.err.println("aqui muestra"+productoConsumoServicio.listarProductodeProyecto(5));
        //System.err.println("pronostico de ventaaaaaaaaaaaaaaaaaaa"+pvs.listaPronosticoVentasProducto(5));
        }
        dato=(double)lista.get(0).getUnidadesVenta();
        listaR.add(dato);
      return  null;
    }
}
