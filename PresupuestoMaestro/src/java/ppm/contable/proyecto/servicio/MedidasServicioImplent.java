/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ppm.contable.proyecto.dao.MedidasDao;
import ppm.contable.proyecto.dao.PeriodoDao;
import ppm.contable.proyecto.modelo.PpmMedidas;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MedidasServicioImplent implements MedidasServicio {
   @Autowired  
  public MedidasDao medidasDao;
  
  @Override
  public List<PpmMedidas> listaMedidas(){
  return medidasDao.listaMedidas();
  } 
   @Override
   public void insertarMedidas(PpmMedidas medidas){
       medidasDao.insertarMedidas(medidas);
   }
     @Override
    public void eliminarMedidas(String idMedidas){
    medidasDao.eliminarMedidas(idMedidas);
    }
    
    @Override
    public PpmMedidas buscarMedidasId(String idMedidas){
    return medidasDao.buscarIdMedidas(idMedidas);
    }
      
    @Override
    public void actualisarMedidas(PpmMedidas medidas){
    medidasDao.actualizarMedidas(medidas);
    } 
}
