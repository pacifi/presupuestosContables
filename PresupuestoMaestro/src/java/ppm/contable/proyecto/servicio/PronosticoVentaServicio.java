/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;

/**
 *
 * @author Pacifi
 */
public interface PronosticoVentaServicio {

    public List<PpmPronosticoVenta> listaPronosticoVenta();

    public void insertaPronosticoVenta(PpmPronosticoVenta ppv);

    public void eliminarPronosticoVenta(int id);

    public PpmPronosticoVenta buscarPronosticoVenta(int id);

    public void actualizarPronosticoVenta(PpmPronosticoVenta ppv);
}
