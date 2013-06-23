/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmMedidas;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
public interface MedidasDao {
    public List<PpmMedidas> listaMedidas();
    public void insertarMedidas(PpmMedidas medidas );
    public void eliminarMedidas(int idPeriodo);
   public PpmMedidas buscarIdMedidas(int idMedidas);
    public void actualizarMedidas(PpmMedidas medidas);
}
