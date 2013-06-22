/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmProductoConsumo;

/**
 *
 * @author Pc
 */
public interface ProductoConsumoServicio {

    public List<PpmProductoConsumo> listaProductoConsumo();

    public void insertarProductoConsumo(PpmProductoConsumo productoConsumo);

    public void eliminarProductoConsumo(String id);

    public PpmProductoConsumo buscarProductoConsumoId(String idProducto);

    public void actualisarProductoConsumo(PpmProductoConsumo idProducto);
}
