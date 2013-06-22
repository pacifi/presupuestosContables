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
import ppm.contable.proyecto.modelo.PpmCatalogoConsumo;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
@Repository
public class CatalogoConsumoDaoImplement implements CatalogoConsumoDao{
 @Autowired    // sirve para no hacer una instancia, lo hace internamente
    public SessionFactory sesionFactory;    // a travez de sessionFactory podemos conectarnos a la base de datos
    
    @Override
    public List<PpmCatalogoConsumo> listaCatalogoConsumo(){
        return sesionFactory.getCurrentSession().createCriteria(PpmCatalogoConsumo.class).list();
    }
    
     @Override
    public void insertarCatalogoConsumo(PpmCatalogoConsumo catalogoConsumo ){
                
          Session session =sesionFactory.openSession();
          session.beginTransaction().begin();
          //  session.persist(periodo);
            session.save(catalogoConsumo);
          session.beginTransaction().commit(); 
          System.out.println("lleeeeeeeeeeeeeeeeeeeeeeeeeeeeega");
    }
     @Override
    public void eliminarCatalogoConsumo(String idConsumo){
    sesionFactory.getCurrentSession()
            .createQuery("delete  PpmCatalogoConsumo per where per.idConsum=?")
            .setString(0, idConsumo)            
            .executeUpdate();
    }
    
    @Override
    public PpmCatalogoConsumo buscarIdCatalogoConsumo(String idConsumo){
    return (PpmCatalogoConsumo)sesionFactory.getCurrentSession().get(PpmCatalogoConsumo.class, idConsumo);
    }
    
    @Override
    public void actualizarCatalogoConsumo(PpmCatalogoConsumo catalogoConsumo){
    Session sesion=sesionFactory.openSession();
     System.out.println("------------------>"+catalogoConsumo.getNombreConsumo());
        try {
                sesion.beginTransaction().begin();
                sesion.update(catalogoConsumo);
                sesion.getTransaction().commit(); 
        } catch (Exception e) { System.out.println("------------------>"+e.getMessage());
        }
   
    }   
}
