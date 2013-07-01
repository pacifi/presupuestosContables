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
import ppm.contable.proyecto.modelo.PpmCatalogoConsumo;
import ppm.contable.proyecto.modelo.PpmProductoConsumo;


/**
 *
 * @author Pc
 */@Repository
public class ProductoConsumoDaoImplement implements ProductoConsumoDao{
    @Autowired    // sirve para no hacer una instancia, lo hace internamente
    public SessionFactory sesionFactory;    // a travez de sessionFactory podemos conectarnos a la base de datos
    
    @Override
    public List<PpmProductoConsumo> listaProductoConsumo(int id){
        //return sesionFactory.getCurrentSession().createCriteria(PpmProductoConsumo.class).list();
        List<PpmProductoConsumo> lista = new ArrayList<PpmProductoConsumo>();
        try {
            //lista = sessionFactory.getCurrentSession().createCriteria(PpmProductoCiv.class).list();
            lista = sesionFactory.getCurrentSession()
                    .createQuery( "SELECT p FROM PpmProductoConsumo p WHERE p.idProducto=?")
                    .setInteger(0, id)
                    .list();
        } catch (Exception e) {
            System.out.println("error al listar producto consumo :" + e.getMessage());
        }

        return lista;
    }
    
       @Override
    public void insertarProductoConsumo(PpmProductoConsumo productoConsumo ){
                
          Session session =sesionFactory.openSession();
          session.beginTransaction().begin();
          //  session.persist(periodo);
            session.save(productoConsumo);
          session.beginTransaction().commit(); 
          System.out.println("lleeeeeeeeeeeeeeeeeeeeeeeeeeeeega");
    }
     @Override
    public void eliminarProductoConsumo(int id){
         try {
             sesionFactory.getCurrentSession()
            .createQuery("delete  PpmProductoConsumo per where per.id=?")
            .setInteger(0, id)            
            .executeUpdate();
         } catch (Exception e) {
             
             System.out.println("error al eliminar"+e.getMessage());
         }
    }
    
    @Override
    public PpmProductoConsumo buscarProductoConsumo(int id){
    return (PpmProductoConsumo)sesionFactory.getCurrentSession().get(PpmProductoConsumo.class, id);
    }
    
    @Override
    public void actualizarProductoConsumo(PpmProductoConsumo productoConsumo){
    Session sesion=sesionFactory.openSession();
     System.out.println("------------------>"+productoConsumo.getPrecioGenerado());
        try {
            sesion.beginTransaction().begin();
            sesion.update(productoConsumo);
            sesion.getTransaction().commit();
        } catch (Exception e) { System.out.println("error al actualizar"+e.getMessage());
        }
   
    }   
    
}
