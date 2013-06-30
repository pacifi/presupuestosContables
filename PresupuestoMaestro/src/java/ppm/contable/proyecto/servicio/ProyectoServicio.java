/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmProyecto;

/**
 *
 * @author CarlosNoteBook
 */
public interface ProyectoServicio {
    public List<PpmProyecto> listaProyecto();
    public void insertaProyecto(PpmProyecto proyecto);
}
