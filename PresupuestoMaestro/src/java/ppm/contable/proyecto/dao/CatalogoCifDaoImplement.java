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
import ppm.contable.proyecto.modelo.PpmCatalogoCif;

@Repository
public class CatalogoCifDaoImplement implements CatalogoCifDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<PpmCatalogoCif> listaCatalogoCif() {

        List<PpmCatalogoCif> lista = new ArrayList<PpmCatalogoCif>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmCatalogoCif.class).list();
        } catch (Exception e) {
            System.out.println("Error al listar catalo Cif" + e.getMessage());
        }
        return lista;
    }

    @Override
    public void insertaCatalogoCif(PpmCatalogoCif catalogoCif) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            session.save(catalogoCif);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al insertar CataloCif" + e.getSuppressed());
        }
    }

    @Override
    public void eliminaCatalogoCif(int id) {
        sessionFactory.getCurrentSession()
                .createQuery("delete PpmCatalogoCif cat where cat.idCif=?")
                .setInteger(0, id)
                .executeUpdate();
    }

    @Override
    public PpmCatalogoCif buscaCatalogoCifId(int id) {
        PpmCatalogoCif catalogoCifR = null;
        try {
            catalogoCifR = (PpmCatalogoCif) sessionFactory.getCurrentSession().get(PpmCatalogoCif.class, id);
        } catch (Exception e) {
            System.out.println("error al buscar id CatalogoCif" + e.getMessage());
        }
        return catalogoCifR;
    }
    
    @Override
    public void actualizarCatalogoCif(PpmCatalogoCif catalogoCif){
            Session session= sessionFactory.openSession();
        try {
            session.beginTransaction().begin();
            session.update(catalogoCif);
            session.getTransaction().commit();
                    
        } catch (Exception e) {
            System.out.println("error al actualizar Catalogo cif"+e.getMessage());
        }
    
    }

}
