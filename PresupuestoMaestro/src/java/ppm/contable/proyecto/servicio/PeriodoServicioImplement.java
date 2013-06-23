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
import ppm.contable.proyecto.dao.PeriodoDao;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PeriodoServicioImplement implements PeriodoServicio{
 @Autowired  
  public PeriodoDao periodoDao;
  
  @Override
  public List<PpmPeriodo> listaPeriodo(){
  return periodoDao.listaPeriodo();
  } 
   @Override
   public void  insertarPeriodo(PpmPeriodo periodo){
       periodoDao.insertarPeriodo(periodo);
   }
     @Override
    public void eliminarPeriodo(int idPeriodo){
    periodoDao.eliminarPeriodo(idPeriodo);
    }
    
    @Override
    public PpmPeriodo buscarPeriodoId(int idPeriodo){
    return periodoDao.buscarIdPeriodo(idPeriodo);
    }
      
    @Override
    public void actualizarPeriodo(PpmPeriodo periodo){
    periodoDao.actualizarPeriodo(periodo);
    }
}
