package ppm.contable.proyecto.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import ppm.contable.proyecto.modelo.PpmProductoCiv;

/**
 *
 * @author Pacifi
 */
public interface ProductoCivDao {
     public List<PpmProductoCiv> listarPpmProductoCiv(int id);
    public void insertaProductoCiv(PpmProductoCiv productoCiv);
    public void eliminarProductoCiv(int id);
    public PpmProductoCiv buscaProductoCivId(int id);
    public void actualizarProductoCiv(PpmProductoCiv productoCiv);
}
