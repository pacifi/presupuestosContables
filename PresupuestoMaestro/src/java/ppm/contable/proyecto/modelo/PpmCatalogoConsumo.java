/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pacifi
 */
@Entity
@Table(name = "ppm_catalogo_consumo")
@NamedQueries({
    @NamedQuery(name = "PpmCatalogoConsumo.findAll", query = "SELECT p FROM PpmCatalogoConsumo p")})
public class PpmCatalogoConsumo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consumo")
    private Integer idConsumo;
    @Basic(optional = false)
    @Column(name = "nombre_consumo")
    private String nombreConsumo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_unitario")
    private BigDecimal precioUnitario;
    @Basic(optional = false)
    @Column(name = "medida_base")
    private BigDecimal medidaBase;
    @Basic(optional = false)
    @Column(name = "tipo_consumo")
    private String tipoConsumo;
    @JoinColumn(name = "id_medidas", referencedColumnName = "id_medidas")
    @ManyToOne(optional = false)
    private PpmMedidas idMedidas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsumo")
    private Collection<PpmProductoConsumo> ppmProductoConsumoCollection;

    public PpmCatalogoConsumo() {
    }

    public PpmCatalogoConsumo(Integer idConsumo) {
        this.idConsumo = idConsumo;
    }

    public PpmCatalogoConsumo(Integer idConsumo, String nombreConsumo, BigDecimal precioUnitario, BigDecimal medidaBase, String tipoConsumo) {
        this.idConsumo = idConsumo;
        this.nombreConsumo = nombreConsumo;
        this.precioUnitario = precioUnitario;
        this.medidaBase = medidaBase;
        this.tipoConsumo = tipoConsumo;
    }

    public Integer getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(Integer idConsumo) {
        this.idConsumo = idConsumo;
    }

    public String getNombreConsumo() {
        return nombreConsumo;
    }

    public void setNombreConsumo(String nombreConsumo) {
        this.nombreConsumo = nombreConsumo;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getMedidaBase() {
        return medidaBase;
    }

    public void setMedidaBase(BigDecimal medidaBase) {
        this.medidaBase = medidaBase;
    }

    public String getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(String tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public PpmMedidas getIdMedidas() {
        return idMedidas;
    }

    public void setIdMedidas(PpmMedidas idMedidas) {
        this.idMedidas = idMedidas;
    }

    public Collection<PpmProductoConsumo> getPpmProductoConsumoCollection() {
        return ppmProductoConsumoCollection;
    }

    public void setPpmProductoConsumoCollection(Collection<PpmProductoConsumo> ppmProductoConsumoCollection) {
        this.ppmProductoConsumoCollection = ppmProductoConsumoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsumo != null ? idConsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmCatalogoConsumo)) {
            return false;
        }
        PpmCatalogoConsumo other = (PpmCatalogoConsumo) object;
        if ((this.idConsumo == null && other.idConsumo != null) || (this.idConsumo != null && !this.idConsumo.equals(other.idConsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmCatalogoConsumo[ idConsumo=" + idConsumo + " ]";
    }
    
}
