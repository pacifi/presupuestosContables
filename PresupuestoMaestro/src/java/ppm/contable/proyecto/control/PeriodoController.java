/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmPeriodo;
import ppm.contable.proyecto.servicio.PeriodoServicio;

/**
 *
 * @author Pc
 */
@Controller
public class PeriodoController {
    @Autowired
    public PeriodoServicio periodoServicio;
    
    Log log = LogFactory.getLog(PeriodoController.class);
    
    @RequestMapping(value="reporte", method= RequestMethod.GET)
    public ModelAndView irReporte(){
        List<PpmPeriodo> lista = periodoServicio.listaPeriodo();
        
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listPeriodo", lista);
        
//      for (SauPeriodo to: lista){
//      log.info("------------------->" + to.getPeriodo());
//      }
    return new ModelAndView("periodo", modelo);
    }
    @RequestMapping(value="periodoGuardar", method= RequestMethod.POST)
   public ModelAndView guardarPeriodo(@ModelAttribute("ModeloPeriodo") PpmPeriodo periodo, BindingResult result) {  
       periodoServicio.insertarPeriodo(periodo);
   return new ModelAndView("index");
   }
    
}
