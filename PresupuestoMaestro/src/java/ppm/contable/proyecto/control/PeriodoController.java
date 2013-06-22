/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
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
    return new ModelAndView("contable/mantenimiento/periodo/periodo", modelo);
    }
    
    @RequestMapping(value="periodoGuardar", method= RequestMethod.POST)
   public ModelAndView guardarPeriodo(@ModelAttribute("ModeloPeriodo") PpmPeriodo periodo, BindingResult result) {  
       periodoServicio.insertarPeriodo(periodo);
   return new ModelAndView("index");
   }
    @RequestMapping(value="formPeriodo", method= RequestMethod.GET)
   public ModelAndView irFormulario(@ModelAttribute("ModeloPeriodo") PpmPeriodo periodo, BindingResult result){   
       return new ModelAndView("contable/mantenimiento/periodo/PeriodoInsert");
   }
    
   /* @RequestMapping(value="eliminarPer", method= RequestMethod.GET)
   public ModelAndView eliminarPeriodo(HttpServletRequest request){
       String idPeriodo =request.getParameter("idPeriodoP")==null?"":request.getParameter("idPeriodoP");
       periodoServicio.eliminarPeriodo(idPeriodo);
   return new ModelAndView("redirect:reporte.Pacifi");
   }
    //Editar Periodo
    @RequestMapping(value="editarPeriodo", method= RequestMethod.GET)
    public ModelAndView editarPeriodoForm(HttpServletRequest request){
    String idPeriodo=request.getParameter("idPeriodoP")==null?"":request.getParameter("idPeriodoP");
    PpmPeriodo periodoTO=null;
    periodoTO=periodoServicio.buscarPeriodoId(idPeriodo);    
    return new ModelAndView("modulos/periodo/formEditPeriodo", "ActualizarModelo",periodoTO);    
    }
    
    @RequestMapping(value="actualizarPeriodo", method= RequestMethod.POST)
    public ModelAndView actualizarPeriodo(@ModelAttribute("ActualizarModelo") PpmPeriodo  periodo, BindingResult result){
    periodoServicio.actualizarPeriodo(periodo);
    return new ModelAndView("redirect:reporte.facifi");
    }
    */
}
