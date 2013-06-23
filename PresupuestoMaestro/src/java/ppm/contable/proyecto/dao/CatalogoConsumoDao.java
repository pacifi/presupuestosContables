/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmCatalogoConsumo;

/**
 *
 * @author Pc
 */
public interface CatalogoConsumoDao {

    public List<PpmCatalogoConsumo> listaCatalogoConsumo();

    public void insertarCatalogoConsumo(PpmCatalogoConsumo catalogoConsumo);

    public void eliminarCatalogoConsumo(int idConsumo);

    public PpmCatalogoConsumo buscarIdCatalogoConsumo(int idConsumo);

    public void actualizarCatalogoConsumo(PpmCatalogoConsumo catalogoConsumo);
}
