/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.modelo;

/**
 *
 * @author PacifiNote
 */
public class ModeloPresupuestoMateriaPrima {
    
    public String nombreProducto;
    public Double total;
    public Double undadRequerida;
    public Double compras;
    public Double presupuestoCompra;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getUndadRequerida() {
        return undadRequerida;
    }

    public void setUndadRequerida(Double undadRequerida) {
        this.undadRequerida = undadRequerida;
    }

    public Double getCompras() {
        return compras;
    }

    public void setCompras(Double compras) {
        this.compras = compras;
    }

    public Double getPresupuestoCompra() {
        return presupuestoCompra;
    }

    public void setPresupuestoCompra(Double presupuestoCompra) {
        this.presupuestoCompra = presupuestoCompra;
    }
    
    
}
