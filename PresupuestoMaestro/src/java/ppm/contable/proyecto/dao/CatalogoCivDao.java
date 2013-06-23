/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.dao;

import java.util.List;
import ppm.contable.proyecto.modelo.PpmCatalogoCiv;

/**
 *
 * @author Pacifi
 */
public interface CatalogoCivDao {
    
    public List<PpmCatalogoCiv> listaCatalogoCiv();
     public void insertaCatalogoCiv(PpmCatalogoCiv catalogoCiv);
     public void eliminaCatalogoCiv(int id);
     public PpmCatalogoCiv buscaCatalogoCivId(int id);
     public void actualizarCatalogoCiv(PpmCatalogoCiv catalogoCiv);
     
}
