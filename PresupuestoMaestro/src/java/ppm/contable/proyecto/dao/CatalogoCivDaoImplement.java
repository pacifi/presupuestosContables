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
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;

@Repository
public class CatalogoCivDaoImplement implements CatalogoCivDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<PpmCatalogoCiv> listaCatalogoCiv() {

        List<PpmCatalogoCiv> lista = new ArrayList<PpmCatalogoCiv>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmCatalogoCiv.class).list();
        } catch (Exception e) {
            System.out.println("Error al listar catalo Civ" + e.getMessage());
        }
        return lista;
    }

    @Override
    public void insertaCatalogoCiv(PpmCatalogoCiv catalogoCiv) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            session.save(catalogoCiv);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al insertar CataloCiv" + e.getSuppressed());
        }
    }

    @Override
    public void eliminaCatalogoCiv(int id) {
        sessionFactory.getCurrentSession()
                .createQuery("delete PpmCatalogoCiv cat where cat.idCiv=?")
                .setInteger(0, id)
                .executeUpdate();
    }

    @Override
    public PpmCatalogoCiv buscaCatalogoCivId(int id) {
        PpmCatalogoCiv catalogoCivR = null;
        try {
            catalogoCivR = (PpmCatalogoCiv) sessionFactory.getCurrentSession().get(PpmCatalogoCiv.class, id);
        } catch (Exception e) {
            System.out.println("error al buscar id CatalogoCiv" + e.getMessage());
        }
        return catalogoCivR;
    }
    
    @Override
    public void actualizarCatalogoCiv(PpmCatalogoCiv catalogoCiv){
            Session session= sessionFactory.openSession();
        try {
            session.beginTransaction().begin();
            session.update(catalogoCiv);
            session.getTransaction().commit();
                    
        } catch (Exception e) {
            System.out.println("error al actualizar Catalogo civ"+e.getMessage());
        }
    
    }
}
