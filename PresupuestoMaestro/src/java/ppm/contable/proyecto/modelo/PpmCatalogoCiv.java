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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pacifi
 */
@Entity
@Table(name = "ppm_catalogo_civ")
@NamedQueries({
    @NamedQuery(name = "PpmCatalogoCiv.findAll", query = "SELECT p FROM PpmCatalogoCiv p")})
public class PpmCatalogoCiv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_civ")
    private Integer idCiv;
    @Basic(optional = false)
    @Column(name = "nombre_civ")
    private String nombreCiv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCiv")
    private Collection<PpmProductoCiv> ppmProductoCivCollection;

    public PpmCatalogoCiv() {
    }

    public PpmCatalogoCiv(Integer idCiv) {
        this.idCiv = idCiv;
    }

    public PpmCatalogoCiv(Integer idCiv, String nombreCiv) {
        this.idCiv = idCiv;
        this.nombreCiv = nombreCiv;
    }

    public Integer getIdCiv() {
        return idCiv;
    }

    public void setIdCiv(Integer idCiv) {
        this.idCiv = idCiv;
    }

    public String getNombreCiv() {
        return nombreCiv;
    }

    public void setNombreCiv(String nombreCiv) {
        this.nombreCiv = nombreCiv;
    }

    public Collection<PpmProductoCiv> getPpmProductoCivCollection() {
        return ppmProductoCivCollection;
    }

    public void setPpmProductoCivCollection(Collection<PpmProductoCiv> ppmProductoCivCollection) {
        this.ppmProductoCivCollection = ppmProductoCivCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCiv != null ? idCiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmCatalogoCiv)) {
            return false;
        }
        PpmCatalogoCiv other = (PpmCatalogoCiv) object;
        if ((this.idCiv == null && other.idCiv != null) || (this.idCiv != null && !this.idCiv.equals(other.idCiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmCatalogoCiv[ idCiv=" + idCiv + " ]";
    }
    
}
