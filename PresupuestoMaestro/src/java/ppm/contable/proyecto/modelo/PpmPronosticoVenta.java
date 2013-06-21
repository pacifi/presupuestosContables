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
@Table(name = "ppm_pronostico_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpmPronosticoVenta.findAll", query = "SELECT p FROM PpmPronosticoVenta p")})
public class PpmPronosticoVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pronostico")
    private Integer idPronostico;
    @Basic(optional = false)
    @Column(name = "unidades_venta")
    private int unidadesVenta;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private PpmProducto idProducto;
    @JoinColumn(name = "id_meses", referencedColumnName = "id_meses")
    @ManyToOne(optional = false)
    private PpmMeses idMeses;

    public PpmPronosticoVenta() {
    }

    public PpmPronosticoVenta(Integer idPronostico) {
        this.idPronostico = idPronostico;
    }

    public PpmPronosticoVenta(Integer idPronostico, int unidadesVenta) {
        this.idPronostico = idPronostico;
        this.unidadesVenta = unidadesVenta;
    }

    public Integer getIdPronostico() {
        return idPronostico;
    }

    public void setIdPronostico(Integer idPronostico) {
        this.idPronostico = idPronostico;
    }

    public int getUnidadesVenta() {
        return unidadesVenta;
    }

    public void setUnidadesVenta(int unidadesVenta) {
        this.unidadesVenta = unidadesVenta;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPronostico != null ? idPronostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpmPronosticoVenta)) {
            return false;
        }
        PpmPronosticoVenta other = (PpmPronosticoVenta) object;
        if ((this.idPronostico == null && other.idPronostico != null) || (this.idPronostico != null && !this.idPronostico.equals(other.idPronostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ppm.contable.proyecto.modelo.PpmPronosticoVenta[ idPronostico=" + idPronostico + " ]";
    }
    
}
