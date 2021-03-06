/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
@Repository
public class PeriodoDaoImplent implements PeriodoDao{
   @Autowired    // sirve para no hacer una instancia, lo hace internamente
    public SessionFactory sesionFactory;    // a travez de sessionFactory podemos conectarnos a la base de datos
    
    @Override
    public List<PpmPeriodo> listaPeriodo(){
        return sesionFactory.getCurrentSession().createCriteria(PpmPeriodo.class).list();
    }
    
     @Override
    public void insertarPeriodo(PpmPeriodo periodo ){
                
          Session session =sesionFactory.openSession();
          session.beginTransaction().begin();
          //  session.persist(periodo);
            session.save(periodo);
          session.beginTransaction().commit();          
    }
     @Override
    public void eliminarPeriodo(int idPeriodo){
    sesionFactory.getCurrentSession()
            .createQuery("delete PpmPeriodo per where per.idPeriodo=?")
            .setInteger(0, idPeriodo)            
            .executeUpdate();
    }
    
    @Override
    public PpmPeriodo buscarIdPeriodo(int idPeriodo){
    return (PpmPeriodo)sesionFactory.getCurrentSession().get(PpmPeriodo.class, idPeriodo);
    }
    
    @Override
    public void actualizarPeriodo(PpmPeriodo periodo){
    Session sesion=sesionFactory.openSession();
     System.out.println("------------------>"+periodo.getAnioPronostico());
        try {
                sesion.beginTransaction().begin();
                sesion.update(periodo);
                sesion.getTransaction().commit(); 
        } catch (Exception e) { System.out.println("------------------>"+e.getMessage());
        }
   
    }
}
