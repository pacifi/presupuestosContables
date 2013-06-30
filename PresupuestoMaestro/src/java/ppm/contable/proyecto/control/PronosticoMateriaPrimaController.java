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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.ModeloPresupuestoMateriaPrima;
import ppm.contable.proyecto.modelo.ModelosPresupuestoVenta;
import ppm.contable.proyecto.modelo.PpmProducto;
import ppm.contable.proyecto.servicio.ProductoServicio;

/**
 *
 * @author PacifiNote
 */
@Controller
public class PronosticoMateriaPrimaController {

    @Autowired
    public ProductoServicio productoServicio;
    public ModeloPresupuestoMateriaPrima materiaPrima;

    @RequestMapping(value = "presupuestoMateriaPrima", method = RequestMethod.GET)
    public ModelAndView Presupuesto(HttpServletRequest request) {
        //el id proyecto tiene que venir por session 
        int idProyecto = 2;



        for (int i = 0; i < productoServicio.listarProductodeProyecto(idProyecto).size(); i++) {

            for (int j = 0; j < 12; j++) {
                
            }
        }
        return null;

    }
}
