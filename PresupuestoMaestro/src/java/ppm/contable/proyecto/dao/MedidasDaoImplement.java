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
import ppm.contable.proyecto.modelo.PpmMedidas;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
@Repository
public class MedidasDaoImplement implements MedidasDao{
    @Autowired    // sirve para no hacer una instancia, lo hace internamente
    public SessionFactory sesionFactory;    // a travez de sessionFactory podemos conectarnos a la base de datos
    
    @Override
    public List<PpmMedidas> listaMedidas(){
        return sesionFactory.getCurrentSession().createCriteria(PpmMedidas.class).list();
    }
    
     @Override
    public void insertarMedidas(PpmMedidas medidas ){
                
          Session session =sesionFactory.openSession();
          session.beginTransaction().begin();
          //  session.persist(periodo);
            session.save(medidas);
          session.beginTransaction().commit();          
    }
     @Override
    public void eliminarMedidas(String idPeriodo){
    sesionFactory.getCurrentSession()
            .createQuery("delete PpmMedidas per where per.idMedidas=?")
            .setString(0, idPeriodo)            
            .executeUpdate();
    }
    
    @Override
    public PpmMedidas buscarIdMedidas(String idMedidas){
    return (PpmMedidas)sesionFactory.getCurrentSession().get(PpmMedidas.class, idMedidas);
    }
    
    @Override
    public void actualizarMedidas(PpmMedidas medidas){
    Session sesion=sesionFactory.openSession();
     System.out.println("------------------>"+medidas.getNombreMedida());
        try {
                sesion.beginTransaction().begin();
                sesion.update(medidas);
                sesion.getTransaction().commit(); 
        } catch (Exception e) { System.out.println("------------------>"+e.getMessage());
        }
   
    }
}
