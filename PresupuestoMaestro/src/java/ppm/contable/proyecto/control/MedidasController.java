/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import ppm.contable.proyecto.modelo.PpmMedidas;

import ppm.contable.proyecto.servicio.MedidasServicio;


/**
 *
 * @author Pc
 */@Controller
public class MedidasController {
    @Autowired
    public MedidasServicio medidasServicio;
    
    Log log = LogFactory.getLog(PeriodoController.class);
    
    @RequestMapping(value="reporteMedidas", method= RequestMethod.GET)
    public ModelAndView irReporte(){
        List<PpmMedidas> lista = medidasServicio.listaMedidas();
        
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listMedidas", lista);
        
//      for (SauPeriodo to: lista){
//      log.info("------------------->" + to.getPeriodo());
//      }
    return new ModelAndView("contable/mantenimiento/medidas/medidas", modelo);
    }
    
    @RequestMapping(value="medidasGuardar", method= RequestMethod.POST)
   public ModelAndView guardarMedidas(@ModelAttribute("ModeloMedidas") PpmMedidas medidas, BindingResult result) {  
       medidasServicio.insertarMedidas(medidas);
   return new ModelAndView("index");
   }
    @RequestMapping(value="formMedidas", method= RequestMethod.GET)
   public ModelAndView irFormulario(@ModelAttribute("ModeloMedidas") PpmMedidas medidas, BindingResult result){   
       return new ModelAndView("contable/mantenimiento/medidas/MedidasInsert");
   }
    
    /*@RequestMapping(value="eliminarMedidas", method= RequestMethod.GET)
   public ModelAndView eliminarMedidas(HttpServletRequest request){
       String idMedidas =request.getParameter("idMedidasP")==null?"":request.getParameter("idMedidasP");
       medidasServicio.eliminarMedidas(idMedidas);
   return new ModelAndView("redirect:reporteMedidas.Pacifi");
   }
    //*Editar Periodo
    @RequestMapping(value="editarPeriodo", method= RequestMethod.GET)
    public ModelAndView editarMedidaForm(HttpServletRequest request){
    String idMedida=request.getParameter("idMedidasP")==null?"":request.getParameter("idMedidasP");
    PpmMedidas medidasTO=null;
    medidasTO=medidasServicio.buscarMedidasId(idMedida);    
    return new ModelAndView("modulos/periodo/formEditMedidas", "ActualizarModelo",medidasTO);    
    }
    
    @RequestMapping(value="actualizarMedidas", method= RequestMethod.POST)
    public ModelAndView actualizarMedidas(@ModelAttribute("ActualizarModelo") PpmMedidas  medidas, BindingResult result){
    medidasServicio.actualisarMedidas(medidas);
    return new ModelAndView("redirect:reporte.facifi");
    }*/
}
