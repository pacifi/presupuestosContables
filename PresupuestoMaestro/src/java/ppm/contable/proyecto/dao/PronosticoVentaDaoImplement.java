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
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;

/**
 *
 * @author Pacifi
 */
@Repository
public class PronosticoVentaDaoImplement implements PronosticoVentaDao {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<PpmPronosticoVenta> listarPronosticoVenta() {
        List<PpmPronosticoVenta> lista = new ArrayList<PpmPronosticoVenta>();
        try {
            lista = sessionFactory.getCurrentSession().createCriteria(PpmPronosticoVenta.class).list();
        } catch (Exception e) {
            System.out.println("error al listar PronostivoVenta" + e.getMessage());
        }
        return lista;
    }

    @Override
    public List<PpmPronosticoVenta> listarPronosticoVentadeProducto(int id) {
        List<PpmPronosticoVenta> lista = new ArrayList<PpmPronosticoVenta>();
        try {
            lista = sessionFactory.getCurrentSession()
                    .createSQLQuery("select * from ppm_pronostico_venta where id_producto=?")
                    .setInteger(0, id)
                    .list();
        } catch (Exception e) {
            System.out.println("error al listar PronostivoVenta" + e.getMessage());
        }
        return lista;
    }

    @Override
    public void insertarPronosticoVenta(PpmPronosticoVenta ppv) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            session.save(ppv);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("error al insertar PronosticoVenta" + e.getMessage());
        }
    }

    @Override
    public void eliminarPronosticoVenta(int id) {
        try {
            sessionFactory.getCurrentSession()
                    .createQuery("DELETE PpmPronosticoVenta pro where pro.idPronostico=?")
                    .setInteger(0, id)
                    .executeUpdate();
        } catch (Exception e) {
            System.out.println("error al eliminar pronostico Venta" + e.getMessage());
        }

    }

    @Override
    public PpmPronosticoVenta buscarPronosticoVentaId(int id) {
        PpmPronosticoVenta ppv = null;
        try {
            ppv = (PpmPronosticoVenta) sessionFactory.getCurrentSession().get(PpmPronosticoVenta.class, id);
        } catch (Exception e) {
            System.out.println("error al buscar pronosticoVenta Id" + e.getMessage());
        }
        return ppv;
    }

    @Override
    public void actualizarPronosticoVenta(PpmPronosticoVenta pronosticoVenta) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction().begin();
            session.update(pronosticoVenta);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error al actualizar el pronosticoVenta" + e.getMessage());
        }
    }
}
