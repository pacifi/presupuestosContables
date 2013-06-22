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
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;

@Repository
public class CatalogoCivDaoImplement implements CatalogoCivDao{
    
    @Autowired
    public SessionFactory sessionFactory;
    
    @Override
    public List<PpmCatalogoCiv> listaCatalogoCiv(){
       
        List<PpmCatalogoCiv> lista= new ArrayList<PpmCatalogoCiv>();
        try {
            lista=sessionFactory.getCurrentSession().createCriteria(PpmCatalogoCiv.class).list();
        } catch (Exception e) {
            System.out.println("Error al listar catalo Civ"+e.getMessage());
        }
        return lista;
    }
    
            
}
