/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.bean;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vasil
 */
@Entity
@Table(name = "t_spr_firm", catalog = "helpdesk", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TSprFirm.findAll", query = "SELECT t FROM TSprFirm t")
    , @NamedQuery(name = "TSprFirm.findById", query = "SELECT t FROM TSprFirm t WHERE t.id = :id")
    , @NamedQuery(name = "TSprFirm.findByFName", query = "SELECT t FROM TSprFirm t WHERE t.fName = :fName")})
public class TSprFirm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "f_name")
    private String fName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fFirmId")
    private List<TFirmUsers> tFirmUsersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fFirmId")
    private List<TIncident> tIncidentList;

    public TSprFirm() {
    }

    public TSprFirm(Long id) {
        this.id = id;
    }

    public TSprFirm(Long id, String fName) {
        this.id = id;
        this.fName = fName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    @XmlTransient
    public List<TFirmUsers> getTFirmUsersList() {
        return tFirmUsersList;
    }

    public void setTFirmUsersList(List<TFirmUsers> tFirmUsersList) {
        this.tFirmUsersList = tFirmUsersList;
    }

    @XmlTransient
    public List<TIncident> getTIncidentList() {
        return tIncidentList;
    }

    public void setTIncidentList(List<TIncident> tIncidentList) {
        this.tIncidentList = tIncidentList;
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
        if (!(object instanceof TSprFirm)) {
            return false;
        }
        TSprFirm other = (TSprFirm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "helpdesk.bean.TSprFirm[ id=" + id + " ]";
    }
    
}
