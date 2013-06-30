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
import ppm.contable.proyecto.modelo.PpmMeses;
import ppm.contable.proyecto.modelo.PpmPeriodo;

/**
 *
 * @author Pc
 */
@Repository
public class MesesDaoImplement implements MesesDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<PpmMeses> listaMeses() {

        List<PpmMeses> lista = new ArrayList<PpmMeses>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmMeses.class).list();
        } catch (Exception e) {
            System.out.println("Error al listar meses" + e.getMessage());
        }
        return lista;
    }

    @Override
    public PpmMeses buscarIdMeses(int idMeses) {

        PpmMeses meses = null;
        try {
              meses = (PpmMeses) sessionFactory.getCurrentSession().get(PpmMeses.class, idMeses);
       } catch (Exception e) {
            System.out.println("error al buscar idmeses "+e.getMessage());
                    
        }

        return meses;
    }
}
