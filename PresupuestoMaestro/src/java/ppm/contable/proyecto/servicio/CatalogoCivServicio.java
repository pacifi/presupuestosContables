/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.servicio;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;

/**
 *
 * @author Pacifi
 */
public interface CatalogoCivServicio {

    public List<PpmCatalogoCiv> listaCatalogoCiv();

    public void eliminarCatalogoCiv(int id);
    public void insertaCatalogoCiv(PpmCatalogoCiv catalogoCiv);

    public PpmCatalogoCiv buscarCatalogoCivId(int id);

    public void actualizaCatalogoCiv(PpmCatalogoCiv catalogoCiv);
}
