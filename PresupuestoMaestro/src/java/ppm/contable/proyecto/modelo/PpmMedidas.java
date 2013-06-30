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
 * @author PacifiNote
 */
@Entity
@Table(name = "ppm_medidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpmMedidas.findAll", query = "SELECT p FROM PpmMedidas p")})
public class PpmMedidas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medidas")
    private Integer idMedidas;
    @Basic(optional = false)
    @Column(name = "nombre_medida")
    private String nombreMedida;
    @Basic(optional = false)
    @Column(name = "abreviatura")
    private String abreviatura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedidas")
    private Collection<PpmCatalogoConsumo> ppmCatalogoConsumoCollection;

    public PpmMedidas() {
    }

    public PpmMedidas(Integer idMedidas) {
        this.idMedidas = idMedidas;
    }

    public PpmMedidas(Integer idMedidas, String nombreMedida, String abreviatura) {
        this.idMedidas = idMedidas;
        this.nombreMedida = nombreMedida;
        this.abreviatura = abreviatura;
    }

    public Integer getIdMedidas() {
        return idMedidas;
    }

    public void setIdMedidas(Integer idMedidas) {
        this.idMedidas = idMedidas;
    }

    public String getNombreMedida() {
        return nombreMedida;
    }

    public void setNombreMedida(String nombreMedida) {
        this.nombreMedida = nombreMedida;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @XmlTransient
    public Collection<PpmCatalogoConsumo> getPpmCatalogoConsumoCollection() {
        return ppmCatalogoConsumoCollection;
    }

    public void setPpmCatalogoConsumoCollection(Collection<PpmCatalogoConsumo> ppmCatalogoConsumoCollection) {
        this.ppmCatalogoConsumoCollection = ppmCatalogoConsumoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedidas != null ? idMedidas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmMedidas)) {
            return false;
        }
        PpmMedidas other = (PpmMedidas) object;
        if ((this.idMedidas == null && other.idMedidas != null) || (this.idMedidas != null && !this.idMedidas.equals(other.idMedidas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmMedidas[ idMedidas=" + idMedidas + " ]";
    }
    
}
