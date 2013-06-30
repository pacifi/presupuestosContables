/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmMeses;

/**
 *
 * @author Pc
 */
public interface MesesDao {
  public List<PpmMeses> listaMeses(); 
  public PpmMeses buscarIdMeses(int idMeses);
}
