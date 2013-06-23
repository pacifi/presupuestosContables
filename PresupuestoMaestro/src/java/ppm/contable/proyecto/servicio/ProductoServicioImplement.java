/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ppm.contable.proyecto.dao.ProductoDao;
import ppm.contable.proyecto.modelo.PpmProducto;

/**
 *
 * @author Pacifi
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductoServicioImplement implements ProductoServicio {

    @Autowired
    public ProductoDao dao;

    @Override
    public List<PpmProducto> listarProducto() {
        return dao.listarProducto();
    }

    @Override
    public void insertaPeriodo(PpmProducto producto) {
        dao.insertaProducto(producto);
    }

    @Override
    public void eliminarProducto(int idProducto) {
        dao.eliminarProducto(idProducto);
    }

    @Override
    public PpmProducto buscarProductoId(int idProducto) {
        return dao.buscarProductoId(idProducto);
    }

    @Override
    public void actualizarProducto(PpmProducto producto) {
        dao.actualizarProducto(producto);
    }
}
