/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmMeses;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Carlos
 */
public interface MesesServicio {
 public List<PpmMeses> listaMeses();
 public PpmMeses buscarPeriodoId(int idMeses);
}
