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
import ppm.contable.proyecto.dao.ProyectoDao;
import ppm.contable.proyecto.modelo.PpmProyecto;

/**
 *
 * @author CarlosNoteBook
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProyectoServicioImplement implements ProyectoServicio{
    
    @Autowired
    public ProyectoDao proyectoDao;
    
    @Override 
    public List<PpmProyecto> listaProyecto(){
        return proyectoDao.listaProyecto();
    }
}
