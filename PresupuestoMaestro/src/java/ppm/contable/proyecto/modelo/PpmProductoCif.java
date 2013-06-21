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

/**
 *
 * @author Pacifi
 */
@Entity
@Table(name = "ppm_producto_cif")
@NamedQueries({
    @NamedQuery(name = "PpmProductoCif.findAll", query = "SELECT p FROM PpmProductoCif p")})
public class PpmProductoCif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_mes")
    private BigDecimal precioMes;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private PpmProducto idProducto;
    @JoinColumn(name = "id_meses", referencedColumnName = "id_meses")
    @ManyToOne(optional = false)
    private PpmMeses idMeses;
    @JoinColumn(name = "id_cif", referencedColumnName = "id_cif")
    @ManyToOne(optional = false)
    private PpmCatalogoCif idCif;

    public PpmProductoCif() {
    }

    public PpmProductoCif(Integer id) {
        this.id = id;
    }

    public PpmProductoCif(Integer id, BigDecimal precioMes) {
        this.id = id;
        this.precioMes = precioMes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrecioMes() {
        return precioMes;
    }

    public void setPrecioMes(BigDecimal precioMes) {
        this.precioMes = precioMes;
    }

    public PpmProducto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(PpmProducto idProducto) {
        this.idProducto = idProducto;
    }

    public PpmMeses getIdMeses() {
        return idMeses;
    }

    public void setIdMeses(PpmMeses idMeses) {
        this.idMeses = idMeses;
    }

    public PpmCatalogoCif getIdCif() {
        return idCif;
    }

    public void setIdCif(PpmCatalogoCif idCif) {
        this.idCif = idCif;
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
        if (!(object instanceof PpmProductoCif)) {
            return false;
        }
        PpmProductoCif other = (PpmProductoCif) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmProductoCif[ id=" + id + " ]";
    }
    
}
