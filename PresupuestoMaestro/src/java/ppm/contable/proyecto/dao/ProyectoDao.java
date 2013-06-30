/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmProyecto;

/**
 *
 * @author CarlosNoteBook
 */
public interface ProyectoDao {
    public List<PpmProyecto> listaProyecto();
    public void insertaProducto(PpmProyecto proyecto);
}
