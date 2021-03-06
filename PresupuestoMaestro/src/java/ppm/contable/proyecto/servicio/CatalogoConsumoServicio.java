/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmCatalogoConsumo;

/**
 *
 * @author Pc
 */
public interface CatalogoConsumoServicio {

    public List<PpmCatalogoConsumo> listaCatalogoConsumo();

    public void insertarCatalogoConsumo(PpmCatalogoConsumo consumo);

    public void eliminarCatalogoConsumo(int idConsumo);

    public PpmCatalogoConsumo buscarCatalogoConsumoId(int idConsumo);

    public void actualisarCatalogoConsumo(PpmCatalogoConsumo consumo);
}
