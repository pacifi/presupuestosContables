/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alumno
 */
@Controller
public class IndexController {
  
   Log logger=LogFactory.getLog(IndexController.class);
    
    @RequestMapping(value="index", method= RequestMethod.GET)
    public ModelAndView inicio(){
        
        logger.info("Paso por el Index.....>");
        
    return new ModelAndView("index");
    }
    
}
