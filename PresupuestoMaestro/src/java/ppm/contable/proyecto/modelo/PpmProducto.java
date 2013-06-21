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
@Table(name = "ppm_producto")
@NamedQueries({
    @NamedQuery(name = "PpmProducto.findAll", query = "SELECT p FROM PpmProducto p")})
public class PpmProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "politica_invfin")
    private long politicaInvfin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "margen_ganancia")
    private BigDecimal margenGanancia;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id_proyecto")
    @ManyToOne(optional = false)
    private PpmProyecto idProyecto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private Collection<PpmProductoCiv> ppmProductoCivCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private Collection<PpmProductoConsumo> ppmProductoConsumoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private Collection<PpmPronosticoVenta> ppmPronosticoVentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private Collection<PpmProductoCif> ppmProductoCifCollection;

    public PpmProducto() {
    }

    public PpmProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public PpmProducto(Integer idProducto, String nombreProducto, String descripcion, long politicaInvfin, BigDecimal margenGanancia) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.politicaInvfin = politicaInvfin;
        this.margenGanancia = margenGanancia;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getPoliticaInvfin() {
        return politicaInvfin;
    }

    public void setPoliticaInvfin(long politicaInvfin) {
        this.politicaInvfin = politicaInvfin;
    }

    public BigDecimal getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(BigDecimal margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public PpmProyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(PpmProyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Collection<PpmProductoCiv> getPpmProductoCivCollection() {
        return ppmProductoCivCollection;
    }

    public void setPpmProductoCivCollection(Collection<PpmProductoCiv> ppmProductoCivCollection) {
        this.ppmProductoCivCollection = ppmProductoCivCollection;
    }

    public Collection<PpmProductoConsumo> getPpmProductoConsumoCollection() {
        return ppmProductoConsumoCollection;
    }

    public void setPpmProductoConsumoCollection(Collection<PpmProductoConsumo> ppmProductoConsumoCollection) {
        this.ppmProductoConsumoCollection = ppmProductoConsumoCollection;
    }

    public Collection<PpmPronosticoVenta> getPpmPronosticoVentaCollection() {
        return ppmPronosticoVentaCollection;
    }

    public void setPpmPronosticoVentaCollection(Collection<PpmPronosticoVenta> ppmPronosticoVentaCollection) {
        this.ppmPronosticoVentaCollection = ppmPronosticoVentaCollection;
    }

    public Collection<PpmProductoCif> getPpmProductoCifCollection() {
        return ppmProductoCifCollection;
    }

    public void setPpmProductoCifCollection(Collection<PpmProductoCif> ppmProductoCifCollection) {
        this.ppmProductoCifCollection = ppmProductoCifCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmProducto)) {
            return false;
        }
        PpmProducto other = (PpmProducto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmProducto[ idProducto=" + idProducto + " ]";
    }
    
}
