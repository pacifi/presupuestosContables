/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmProducto;

/**
 *
 * @author Pacifi
 */
public interface ProductoDao {
     List<PpmProducto> listarProducto();
     public void insertaProducto( PpmProducto producto);

    public void eliminarProducto(String idProducto);

    public PpmProducto buscarProductoId(String idProducto);

    public void actualizarProducto(PpmProducto producto);
}
