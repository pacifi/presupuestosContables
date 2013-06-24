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
import ppm.contable.proyecto.dao.PronosticoVentaDao;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;

/**
 *
 * @author Pacifi
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PronosticoVentaServicioImplement implements PronosticoVentaServicio {

    @Autowired
    public PronosticoVentaDao dao;

    @Override
    public List<PpmPronosticoVenta> listaPronosticoVenta() {
        return dao.listarPronosticoVenta();
    }

    @Override
    public void insertaPronosticoVenta(PpmPronosticoVenta ppv) {
        dao.insertarPronosticoVenta(ppv);
    }

    @Override
    public void eliminarPronosticoVenta(int id) {
        dao.eliminarPronosticoVenta(id);
    }

    @Override
    public PpmPronosticoVenta buscarPronosticoVenta(int id) {
        return dao.buscarPronosticoVentaId(id);
    }

    @Override
    public void actualizarPronosticoVenta(PpmPronosticoVenta ppv) {
        dao.actualizarPronosticoVenta(ppv);
    }

    @Override
    public List<PpmPronosticoVenta> listaPronosticoVentasProducto(int id) {
        return dao.listarPronosticoVentadeProducto(id);
    }
}
