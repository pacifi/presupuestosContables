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
import ppm.contable.proyecto.dao.CatalogoConsumoDao;
import ppm.contable.proyecto.modelo.PpmCatalogoConsumo;
import ppm.contable.proyecto.modelo.PpmMedidas;

/**
 *
 * @author Pc
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CatalogoConsumoServicioImplement implements CatalogoConsumoServicio {

    @Autowired
    public CatalogoConsumoDao consumoDao;

    @Override
    public List<PpmCatalogoConsumo> listaCatalogoConsumo() {
        return consumoDao.listaCatalogoConsumo();
    }

    @Override
    public void insertarCatalogoConsumo(PpmCatalogoConsumo consumo) {
        consumoDao.insertarCatalogoConsumo(consumo);
    }

    @Override
    public void eliminarCatalogoConsumo(int idConsumo) {
        consumoDao.eliminarCatalogoConsumo(idConsumo);
    }

    @Override
    public PpmCatalogoConsumo buscarCatalogoConsumoId(int idConsumo) {
        return consumoDao.buscarIdCatalogoConsumo(idConsumo);
    }

    @Override
    public void actualisarCatalogoConsumo(PpmCatalogoConsumo consumo) {
        consumoDao.actualizarCatalogoConsumo(consumo);
    }
}
