/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
public interface PeriodoServicio {
 public List<PpmPeriodo> listaPeriodo();   
 public void  insertarPeriodo(PpmPeriodo periodo);
}
