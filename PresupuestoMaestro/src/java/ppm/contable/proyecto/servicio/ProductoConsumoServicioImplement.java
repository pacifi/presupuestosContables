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
import ppm.contable.proyecto.dao.ProductoConsumoDao;
import ppm.contable.proyecto.modelo.PpmProductoConsumo;



/**
 *
 * @author Pc
 */
@Service
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class ProductoConsumoServicioImplement implements ProductoConsumoServicio {

    @Autowired
    public ProductoConsumoDao productoConsumoDao;

    @Override
    public List<PpmProductoConsumo> listaProductoConsumo(int id) {
        return productoConsumoDao.listaProductoConsumo(id);
    }

    @Override
    public void insertarProductoConsumo(PpmProductoConsumo productoConsumo) {
        productoConsumoDao.insertarProductoConsumo(productoConsumo);
    }

    @Override
    public void eliminarProductoConsumo(int id) {
        productoConsumoDao.eliminarProductoConsumo(id);
    }

    @Override
    public PpmProductoConsumo buscarProductoConsumoId(int idProducto) {
        return productoConsumoDao.buscarProductoConsumo(idProducto);
    }

    @Override
    public void actualisarProductoConsumo(PpmProductoConsumo idProducto) {
        productoConsumoDao.actualizarProductoConsumo(idProducto);
    }
}
