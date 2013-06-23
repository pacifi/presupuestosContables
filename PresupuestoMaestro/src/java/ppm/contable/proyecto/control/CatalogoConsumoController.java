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
import ppm.contable.proyecto.modelo.PpmCatalogoConsumo;
import ppm.contable.proyecto.servicio.CatalogoConsumoServicio;


/**
 *
 * @author Pc
 */
@Controller
public class CatalogoConsumoController {
  @Autowired
    public CatalogoConsumoServicio catalogoConsumoServicio;
    
    Log log = LogFactory.getLog(CatalogoConsumoController.class);
    
    @RequestMapping(value="reporteCatalogoConsumo", method= RequestMethod.GET)
    public ModelAndView irReporte(){
        List<PpmCatalogoConsumo> lista = catalogoConsumoServicio.listaCatalogoConsumo();
        
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listCatalogoConsumo", lista);
        
//      for (SauPeriodo to: lista){
//      log.info("------------------->" + to.getPeriodo());
//      }
    return new ModelAndView("contable/mantenimiento/consumo/consumo", modelo);
    }
    
    @RequestMapping(value="catalogoConsumoGuardar", method= RequestMethod.POST)
   public ModelAndView guardarCatalogoConsumo(@ModelAttribute("ModeloCatalogoConsumo") PpmCatalogoConsumo consumo, BindingResult result) {  
       catalogoConsumoServicio.insertarCatalogoConsumo(consumo);
   return new ModelAndView("index");
   }
    @RequestMapping(value="formCatalogoConsumo", method= RequestMethod.GET)
   public ModelAndView irFormulario(@ModelAttribute("ModeloCatalogoConsumo") PpmCatalogoConsumo consumo, BindingResult result){   
       return new ModelAndView("contable/mantenimiento/consumo/ConsumoInsert");
   }
    
    /////////
    
    @RequestMapping(value="eliminarCatalogoConsumo", method= RequestMethod.GET)
   public ModelAndView eliminarCatalogoConsumo(HttpServletRequest request){
       int idConsumo =Integer.parseInt(request.getParameter("idCatalogoConsumoP")==null?"":request.getParameter("idCatalogoConsumoP"));
       catalogoConsumoServicio.eliminarCatalogoConsumo(idConsumo);
   return new ModelAndView("redirect:reporteCatalogoConsumo.pacifi");
   }
    //*Editar Periodo
    @RequestMapping(value="editarCatalogoConsumo", method= RequestMethod.GET)
    public ModelAndView editarCatalogoConsumoForm(HttpServletRequest request){
    int idConsumo=Integer.parseInt(request.getParameter("idConsumoP")==null?"":request.getParameter("idConsumoP"));
    PpmCatalogoConsumo consumoTO=null;
    consumoTO=catalogoConsumoServicio.buscarCatalogoConsumoId(idConsumo);    
    return new ModelAndView("contable/mantenimiento/consumo/formEditConsumo", "ActualizarCatalogoConsumo",consumoTO);    
    }
    
    @RequestMapping(value="actualizarCatalogoConsumo", method= RequestMethod.POST)
    public ModelAndView actualizarCatalogoConsumo(@ModelAttribute("ActualizarCatalogoConsumo") PpmCatalogoConsumo  consumo, BindingResult result){
    catalogoConsumoServicio.actualisarCatalogoConsumo(consumo);
    return new ModelAndView("redirect:reporteCatalogoConsumo.pacifi");
    }  
}
