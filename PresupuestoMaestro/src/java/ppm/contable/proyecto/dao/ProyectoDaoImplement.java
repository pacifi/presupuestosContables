/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ppm.contable.proyecto.modelo.PpmProyecto;

/**
 *
 * @author CarlosNoteBook
 */
@Repository
public class ProyectoDaoImplement implements ProyectoDao{
    
    @Autowired
    public SessionFactory sessionFactory;
    
    @Override
    public List<PpmProyecto> listaProyecto(){
        
        List<PpmProyecto> lista = new ArrayList<PpmProyecto>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmProyecto.class).list();
            System.out.println("Datos de Proyecto Correctamente Obtenidos");
        } catch (Exception e) {
            System.out.println(" Error en reportar Proyectos" + e.getMessage());
        }
        return lista;
    }
    
    @Override
    public void insertaProducto(PpmProyecto proyecto) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            //  session.persist(periodo);
            session.save(proyecto);
            session.beginTransaction().commit();

        } catch (Exception e) {
            System.out.println("error en el insertar Producto" + e.getMessage());
        }

    }
    
}
