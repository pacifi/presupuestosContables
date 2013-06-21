/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ppm.contable.proyecto.modelo.PpmProducto;
/**
 *
 * @author Pacifi
 */
@Repository
public class ProductoDaoImplement implements ProductoDao{
    
    //objeto session factory para hacer la transacciones con hibernate
    @Autowired
    public SessionFactory sessionFactory;
    
    @Override
    public List<PpmProducto> listarProducto(){
       
        
       List<PpmProducto> lista= new ArrayList<PpmProducto>();
        try {
            lista= sessionFactory.getCurrentSession().createCriteria(PpmProducto.class).list();
        } catch (Exception e) {
            System.out.println("el error esta en la conlta"+e.getMessage());
        }
    return lista;
    }
    
}
