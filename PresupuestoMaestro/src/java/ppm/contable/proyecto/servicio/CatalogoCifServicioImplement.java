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
import ppm.contable.proyecto.dao.CatalogoCifDao;
import ppm.contable.proyecto.modelo.PpmCatalogoCif;

/**
 *
 * @author Pacifi
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CatalogoCifServicioImplement implements CatalogoCifServicio {

    @Autowired
    public CatalogoCifDao dao;

    @Override
    public List<PpmCatalogoCif> listaCatalogoCif() {
        return dao.listaCatalogoCif();
    }
    
    @Override
    public void insertaCatalogoCif(PpmCatalogoCif catalogoCif){
    dao.insertaCatalogoCif(catalogoCif);
    }

    @Override
    public void eliminarCatalogoCif(int id) {
        dao.eliminaCatalogoCif(id);
    }

    @Override
    public PpmCatalogoCif buscarCatalogoCifId(int id) {
        return dao.buscaCatalogoCifId(id);
    }

    @Override
    public void actualizaCatalogoCif(PpmCatalogoCif catalogoCif) {
        dao.actualizarCatalogoCif(catalogoCif);
    }
}
