/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmCatalogoCif;

/**
 *
 * @author Pacifi
 */
public interface CatalogoCifServicio {

    public List<PpmCatalogoCif> listaCatalogoCif();

    public void eliminarCatalogoCif(int id);
    public void insertaCatalogoCif(PpmCatalogoCif catalogoCif);

    public PpmCatalogoCif buscarCatalogoCifId(int id);

    public void actualizaCatalogoCif(PpmCatalogoCif catalogoCif);
}
