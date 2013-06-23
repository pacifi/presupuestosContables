/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmCatalogoCif;

/**
 *
 * @author Pc
 */
public interface CatalogoCifDao {
     
     public List<PpmCatalogoCif> listaCatalogoCif();
     public void insertaCatalogoCif(PpmCatalogoCif catalogoCif);
     public void eliminaCatalogoCif(int id);
     public PpmCatalogoCif buscaCatalogoCifId(int id);
     public void actualizarCatalogoCif(PpmCatalogoCif catalogoCif);
     
}
