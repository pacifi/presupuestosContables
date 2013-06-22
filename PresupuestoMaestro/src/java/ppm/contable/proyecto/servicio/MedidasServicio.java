/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmMedidas;

/**
 *
 * @author Pc
 */
public interface MedidasServicio {
    public List<PpmMedidas> listaMedidas();
    public void  insertarMedidas(PpmMedidas medidas);
    public void eliminarMedidas(String idMedidas);
    public PpmMedidas buscarMedidasId(String idMedidas);
    public void actualisarMedidas(PpmMedidas medidas);
    
}
