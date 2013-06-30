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
import ppm.contable.proyecto.dao.MesesDao;
import ppm.contable.proyecto.modelo.PpmMeses;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Carlos
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MesesServicioImplement implements MesesServicio {

    @Autowired
    public MesesDao mesesDao;

    @Override
    public List<PpmMeses> listaMeses() {
        return mesesDao.listaMeses();
    }

    @Override
    public PpmMeses buscarIdMeses(int idMeses) {
        return mesesDao.buscarIdMeses(idMeses);
    }
}
