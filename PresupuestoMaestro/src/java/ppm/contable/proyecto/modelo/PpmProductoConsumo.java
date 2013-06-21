/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pacifi
 */
@Entity
@Table(name = "ppm_producto_consumo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpmProductoConsumo.findAll", query = "SELECT p FROM PpmProductoConsumo p")})
public class PpmProductoConsumo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "cantidad_uso")
    private BigDecimal cantidadUso;
    @Basic(optional = false)
    @Column(name = "precio_generado")
    private BigDecimal precioGenerado;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private PpmProducto idProducto;
    @JoinColumn(name = "id_consumo", referencedColumnName = "id_consumo")
    @ManyToOne(optional = false)
    private PpmCatalogoConsumo idConsumo;

    public PpmProductoConsumo() {
    }

    public PpmProductoConsumo(Integer id) {
        this.id = id;
    }

    public PpmProductoConsumo(Integer id, BigDecimal cantidadUso, BigDecimal precioGenerado) {
        this.id = id;
        this.cantidadUso = cantidadUso;
        this.precioGenerado = precioGenerado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCantidadUso() {
        return cantidadUso;
    }

    public void setCantidadUso(BigDecimal cantidadUso) {
        this.cantidadUso = cantidadUso;
    }

    public BigDecimal getPrecioGenerado() {
        return precioGenerado;
    }

    public void setPrecioGenerado(BigDecimal precioGenerado) {
        this.precioGenerado = precioGenerado;
    }

    public PpmProducto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(PpmProducto idProducto) {
        this.idProducto = idProducto;
    }

    public PpmCatalogoConsumo getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(PpmCatalogoConsumo idConsumo) {
        this.idConsumo = idConsumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmProductoConsumo)) {
            return false;
        }
        PpmProductoConsumo other = (PpmProductoConsumo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmProductoConsumo[ id=" + id + " ]";
    }
    
}
