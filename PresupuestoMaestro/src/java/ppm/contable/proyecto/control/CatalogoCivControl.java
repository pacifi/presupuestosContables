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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;
import ppm.contable.proyecto.modelo.PpmProductoCiv;
import ppm.contable.proyecto.servicio.CatalogoCivServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class CatalogoCivControl {

    @Autowired
    public CatalogoCivServicio servicio;

    
    @RequestMapping(value = "reporteCatalogoCiv", method = RequestMethod.GET)
    public ModelAndView irReporte() {
        
        List<PpmCatalogoCiv> lista= servicio.listaCatalogoCiv();
        Map<String,Object> modelo=new HashMap<String, Object>();
        modelo.put("listaCatalogoCiv", lista);
        return new ModelAndView("contable/mantenimiento/catalogoCiv/catalogoCivList",modelo);
    }
}
