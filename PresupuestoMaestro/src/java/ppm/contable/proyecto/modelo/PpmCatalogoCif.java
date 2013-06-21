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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pacifi
 */
@Entity
@Table(name = "ppm_catalogo_cif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpmCatalogoCif.findAll", query = "SELECT p FROM PpmCatalogoCif p")})
public class PpmCatalogoCif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cif")
    private Integer idCif;
    @Basic(optional = false)
    @Column(name = "nombre_consumo")
    private String nombreConsumo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCif")
    private Collection<PpmProductoCif> ppmProductoCifCollection;

    public PpmCatalogoCif() {
    }

    public PpmCatalogoCif(Integer idCif) {
        this.idCif = idCif;
    }

    public PpmCatalogoCif(Integer idCif, String nombreConsumo) {
        this.idCif = idCif;
        this.nombreConsumo = nombreConsumo;
    }

    public Integer getIdCif() {
        return idCif;
    }

    public void setIdCif(Integer idCif) {
        this.idCif = idCif;
    }

    public String getNombreConsumo() {
        return nombreConsumo;
    }

    public void setNombreConsumo(String nombreConsumo) {
        this.nombreConsumo = nombreConsumo;
    }

    @XmlTransient
    public Collection<PpmProductoCif> getPpmProductoCifCollection() {
        return ppmProductoCifCollection;
    }

    public void setPpmProductoCifCollection(Collection<PpmProductoCif> ppmProductoCifCollection) {
        this.ppmProductoCifCollection = ppmProductoCifCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCif != null ? idCif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmCatalogoCif)) {
            return false;
        }
        PpmCatalogoCif other = (PpmCatalogoCif) object;
        if ((this.idCif == null && other.idCif != null) || (this.idCif != null && !this.idCif.equals(other.idCif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmCatalogoCif[ idCif=" + idCif + " ]";
    }
    
}
