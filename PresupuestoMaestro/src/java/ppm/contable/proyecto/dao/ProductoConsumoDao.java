/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmProductoConsumo;

/**
 *
 * @author Pc
 */
public interface ProductoConsumoDao {

    public List<PpmProductoConsumo> listaProductoConsumo();

    public void insertarProductoConsumo(PpmProductoConsumo productoConsumo);

    public void eliminarProductoConsumo(String id);

    public PpmProductoConsumo buscarProductoConsumo(String id);

    public void actualizarProductoConsumo(PpmProductoConsumo productoConsumo);
}
