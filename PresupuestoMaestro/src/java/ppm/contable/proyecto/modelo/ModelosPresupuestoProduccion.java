/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.modelo;

/**
 *
 * @author noe
 */
public class ModelosPresupuestoProduccion {
    public int id;
    public String meses;
    public String nombreProducto;
    public Double produccionRequerida;
    public Double total;
    public Double inventarioInicial;
    public Double inventarioFinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getProduccionRequerida() {
        return produccionRequerida;
    }

    public void setProduccionRequerida(Double produccionRequerida) {
        this.produccionRequerida = produccionRequerida;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getInventarioInicial() {
        return inventarioInicial;
    }

    public void setInventarioInicial(Double inventarioInicial) {
        this.inventarioInicial = inventarioInicial;
    }

    public Double getInventarioFinal() {
        return inventarioFinal;
    }

    public void setInventarioFinal(Double inventarioFinal) {
        this.inventarioFinal = inventarioFinal;
    }
    
}
