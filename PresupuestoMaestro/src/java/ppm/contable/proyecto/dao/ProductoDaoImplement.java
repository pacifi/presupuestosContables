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
import ppm.contable.proyecto.modelo.PpmProducto;

/**
 *
 * @author Pacifi
 */
@Repository
public class ProductoDaoImplement implements ProductoDao {

    //objeto session factory para hacer la transacciones con hibernate
    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<PpmProducto> listarProducto() {
        List<PpmProducto> lista = new ArrayList<PpmProducto>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmProducto.class).list();
        } catch (Exception e) {
            System.out.println("el error esta en la conlta" + e.getMessage());
        }
        return lista;
    }

    @Override
    public List<PpmProducto> listarProductodeProyecto(int idProyecto) {
        
        List<PpmProducto> lista= new ArrayList<PpmProducto>();
        try {
            lista= sessionFactory.getCurrentSession()
                    .createQuery("SELECT p FROM PpmProducto p where p.idProyecto=?")
                    .setInteger(0, idProyecto)
                    .list();
        } catch (Exception e) {
            System.out.println("Error al reportar id productoo por idproyecto"+e.getMessage());
        }

        return lista;
    }

    @Override
    public void insertaProducto(PpmProducto producto) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            //  session.persist(periodo);
            session.save(producto);
            session.beginTransaction().commit();

        } catch (Exception e) {
            System.out.println("error en el insertar Producto" + e.getMessage());
        }

    }

    @Override
    public void eliminarProducto(int idProducto) {
        try {
            sessionFactory.getCurrentSession()
                    .createQuery("delete PpmProducto pro where pro.idProducto=?")
                    .setInteger(0, idProducto)
                    .executeUpdate();
        } catch (Exception e) {
            System.out.println("error al eliminar Producto" + e.getMessage());
        }
    }

    @Override
    public PpmProducto buscarProductoId(int idProducto) {
        PpmProducto productoR = null;
        try {
            productoR = (PpmProducto) sessionFactory.getCurrentSession().get(PpmProducto.class, idProducto);
        } catch (Exception e) {
            System.out.println("error al buscar producto id" + e.getMessage());
        }
        return productoR;
    }

    @Override
    public void actualizarProducto(PpmProducto producto) {

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction().begin();
            session.update(producto);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error al actualizar periodo" + e.getMessage());
        }
    }
}
