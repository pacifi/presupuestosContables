/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pacifi
 */
@Entity
@Table(name = "ppm_periodo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpmPeriodo.findAll", query = "SELECT p FROM PpmPeriodo p")})
public class PpmPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_periodo")
    private Integer idPeriodo;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "anio_pronostico")
    private String anioPronostico;

    public PpmPeriodo() {
    }

    public PpmPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public PpmPeriodo(Integer idPeriodo, String estado, String anioPronostico) {
        this.idPeriodo = idPeriodo;
        this.estado = estado;
        this.anioPronostico = anioPronostico;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAnioPronostico() {
        return anioPronostico;
    }

    public void setAnioPronostico(String anioPronostico) {
        this.anioPronostico = anioPronostico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodo != null ? idPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmPeriodo)) {
            return false;
        }
        PpmPeriodo other = (PpmPeriodo) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmPeriodo[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
