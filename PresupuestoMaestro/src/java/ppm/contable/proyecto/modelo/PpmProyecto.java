/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.modelo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PacifiNote
 */
@Entity
@Table(name = "ppm_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpmProyecto.findAll", query = "SELECT p FROM PpmProyecto p")})
public class PpmProyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proyecto")
    private Integer idProyecto;
    @Basic(optional = false)
    @Column(name = "nombre_presupuestos")
    private String nombrePresupuestos;
    @Basic(optional = false)
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProyecto")
    private Collection<PpmProducto> ppmProductoCollection;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private PpmPeriodo idPeriodo;

    public PpmProyecto() {
    }

    public PpmProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public PpmProyecto(Integer idProyecto, String nombrePresupuestos, String nombreEmpresa, String codigo) {
        this.idProyecto = idProyecto;
        this.nombrePresupuestos = nombrePresupuestos;
        this.nombreEmpresa = nombreEmpresa;
        this.codigo = codigo;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombrePresupuestos() {
        return nombrePresupuestos;
    }

    public void setNombrePresupuestos(String nombrePresupuestos) {
        this.nombrePresupuestos = nombrePresupuestos;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<PpmProducto> getPpmProductoCollection() {
        return ppmProductoCollection;
    }

    public void setPpmProductoCollection(Collection<PpmProducto> ppmProductoCollection) {
        this.ppmProductoCollection = ppmProductoCollection;
    }

    public PpmPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(PpmPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmProyecto)) {
            return false;
        }
        PpmProyecto other = (PpmProyecto) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmProyecto[ idProyecto=" + idProyecto + " ]";
    }
    
}
