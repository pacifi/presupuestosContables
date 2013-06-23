package ppm.contable.proyecto.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ppm.contable.proyecto.modelo.PpmProductoCiv;

/**
 *
 * @author Pacifi
 */
@Repository
public class ProductoCivDaoImplement implements ProductoCivDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<PpmProductoCiv> listarPpmProductoCiv() {
        List<PpmProductoCiv> lista = new ArrayList<PpmProductoCiv>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmProductoCiv.class).list();
        } catch (Exception e) {
            System.out.println("error al listar producto civ" + e.getMessage());
        }

        return lista;
    }

    @Override
    public void insertaProductoCiv(PpmProductoCiv productoCiv) {

        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            session.save(productoCiv);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("error al insertar producto civ" + e.getMessage());
        }

    }

    @Override
    public void eliminarProductoCiv(int id) {
        try {
            sessionFactory.getCurrentSession()
                    .createQuery("delete PpmProductoCiv ppm where ppm.id=?")
                    .setInteger(0, id)
                    .executeUpdate();
        } catch (Exception e) {
            System.out.println("error al eliminar producto civ" + e.getMessage());
        }
    }

    @Override
    public PpmProductoCiv buscaProductoCivId(int id) {
        PpmProductoCiv productoCivR = null;
        try {
            productoCivR = (PpmProductoCiv) sessionFactory.getCurrentSession().get(PpmProductoCiv.class, id);
        } catch (Exception e) {
            System.out.println("error al buscar ProductoCivId" + e.getMessage());
        }
        return productoCivR;
    }

    @Override
    public void actualizarProductoCiv(PpmProductoCiv productoCiv) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction().begin();
            session.update(productoCiv);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error al actualizar el ProductoCivId" + e.getMessage());
        }
    }
}
