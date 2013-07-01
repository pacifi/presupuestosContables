package ppm.contable.proyecto.servicio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ppm.contable.proyecto.dao.ProductoCivDao;
import ppm.contable.proyecto.modelo.PpmProductoCiv;

/**
 *
 * @author Pacifi
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductoCivServicioImplement implements ProductoCivServicio {

    @Autowired
    public ProductoCivDao dao;

    @Override
    public List<PpmProductoCiv> listarProductoCiv(int id) {
        return dao.listarPpmProductoCiv(id);
    }

    @Override
    public void insertarProductoCiv(PpmProductoCiv productoCiv) {
        dao.insertaProductoCiv(productoCiv);
    }

    @Override
    public void elimaProductoCiv(int id) {
        dao.eliminarProductoCiv(id);
    }

    @Override
    public PpmProductoCiv buscarProductoCivId(int id) {
        return dao.buscaProductoCivId(id);
    }

    @Override
    public void actualizarProductoCiv(PpmProductoCiv productoCiv) {
        dao.actualizarProductoCiv(productoCiv);
    }
}
