package ppm.contable.proyecto.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;

/**
 *
 * @author Pacifi
 */
public interface PronosticoVentaDao {
    public List<PpmPronosticoVenta> listarPronosticoVenta();
    public void insertarPronosticoVenta(PpmPronosticoVenta ppv);
    public void eliminarPronosticoVenta(int id);
    public PpmPronosticoVenta buscarPronosticoVentaId(int id);
    public void actualizarPronosticoVenta(PpmPronosticoVenta pronosticoVenta);
    public List<PpmPronosticoVenta> listarPronosticoVentadeProducto(int id);
}
