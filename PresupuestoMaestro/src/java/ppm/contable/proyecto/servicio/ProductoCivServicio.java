package ppm.contable.proyecto.servicio;

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
public interface ProductoCivServicio {

    public List<PpmProductoCiv> listarProductoCiv(int id);

    public void insertarProductoCiv(PpmProductoCiv productoCiv);

    public void elimaProductoCiv(int id);

    public PpmProductoCiv buscarProductoCivId(int id);

    public void actualizarProductoCiv(PpmProductoCiv productoCiv);
}
