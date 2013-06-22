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
import ppm.contable.proyecto.dao.CatalogoCivDao;
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;

/**
 *
 * @author Pacifi
 */

@Service
@Transactional (propagation = Propagation.SUPPORTS,readOnly = true)
public class CatalogoCivServicioImplement implements CatalogoCivServicio{
   
    @Autowired
    public CatalogoCivDao dao;
    
    @Override
    public List<PpmCatalogoCiv> listaCatalogoCiv(){
    return  dao.listaCatalogoCiv();
    }
    
            
    
}
