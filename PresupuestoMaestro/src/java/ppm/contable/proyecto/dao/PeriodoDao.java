/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
public interface PeriodoDao {
 public List<PpmPeriodo> listaPeriodo();   
 public void insertarPeriodo(PpmPeriodo periodo );
 public void eliminarPeriodo(String idPeriodo);
  public PpmPeriodo buscarIdPeriodo(String idPeriodo);
  public void actualizarPeriodo(PpmPeriodo periodo);
 
}
