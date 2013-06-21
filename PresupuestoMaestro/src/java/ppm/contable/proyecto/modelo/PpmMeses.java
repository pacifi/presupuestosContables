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
@Table(name = "ppm_meses")
@NamedQueries({
    @NamedQuery(name = "PpmMeses.findAll", query = "SELECT p FROM PpmMeses p")})
public class PpmMeses implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_meses")
    private Integer idMeses;
    @Basic(optional = false)
    @Column(name = "nombre_mes")
    private String nombreMes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMeses")
    private Collection<PpmPronosticoVenta> ppmPronosticoVentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMeses")
    private Collection<PpmProductoCif> ppmProductoCifCollection;

    public PpmMeses() {
    }

    public PpmMeses(Integer idMeses) {
        this.idMeses = idMeses;
    }

    public PpmMeses(Integer idMeses, String nombreMes) {
        this.idMeses = idMeses;
        this.nombreMes = nombreMes;
    }

    public Integer getIdMeses() {
        return idMeses;
    }

    public void setIdMeses(Integer idMeses) {
        this.idMeses = idMeses;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
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
        hash += (idMeses != null ? idMeses.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmMeses)) {
            return false;
        }
        PpmMeses other = (PpmMeses) object;
        if ((this.idMeses == null && other.idMeses != null) || (this.idMeses != null && !this.idMeses.equals(other.idMeses))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmMeses[ idMeses=" + idMeses + " ]";
    }
    
}
