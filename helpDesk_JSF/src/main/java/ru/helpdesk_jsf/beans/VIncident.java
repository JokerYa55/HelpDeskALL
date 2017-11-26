/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.helpdesk_jsf.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vasil
 */
@Entity
@Table(name = "v_incident")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VIncident.findAll", query = "SELECT v FROM VIncident v")
    , @NamedQuery(name = "VIncident.findById", query = "SELECT v FROM VIncident v WHERE v.id = :id")
    , @NamedQuery(name = "VIncident.findByFDate", query = "SELECT v FROM VIncident v WHERE v.fDate = :fDate")
    , @NamedQuery(name = "VIncident.findByFFirmId", query = "SELECT v FROM VIncident v WHERE v.fFirmId = :fFirmId")
    , @NamedQuery(name = "VIncident.findByFFirmName", query = "SELECT v FROM VIncident v WHERE v.fFirmName = :fFirmName")
    , @NamedQuery(name = "VIncident.findByFServiceId", query = "SELECT v FROM VIncident v WHERE v.fServiceId = :fServiceId")
    , @NamedQuery(name = "VIncident.findByFServiceName", query = "SELECT v FROM VIncident v WHERE v.fServiceName = :fServiceName")
    , @NamedQuery(name = "VIncident.findByFComment", query = "SELECT v FROM VIncident v WHERE v.fComment = :fComment")
    , @NamedQuery(name = "VIncident.findByFDateCreated", query = "SELECT v FROM VIncident v WHERE v.fDateCreated = :fDateCreated")
    , @NamedQuery(name = "VIncident.findByFUserId", query = "SELECT v FROM VIncident v WHERE v.fUserId = :fUserId")
    , @NamedQuery(name = "VIncident.findByFUserName", query = "SELECT v FROM VIncident v WHERE v.fUserName = :fUserName")
    , @NamedQuery(name = "VIncident.findByFIncidentStatusId", query = "SELECT v FROM VIncident v WHERE v.fIncidentStatusId = :fIncidentStatusId")
    , @NamedQuery(name = "VIncident.findByFIncidentName", query = "SELECT v FROM VIncident v WHERE v.fIncidentName = :fIncidentName")})
public class VIncident implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    private BigInteger id;
    @Size(max = 2147483647)
    @Column(name = "f_date")
    private String fDate;
    @Column(name = "f_firm_id")
    private BigInteger fFirmId;
    @Size(max = 500)
    @Column(name = "f_firm_name")
    private String fFirmName;
    @Column(name = "f_service_id")
    private BigInteger fServiceId;
    @Size(max = 500)
    @Column(name = "f_service_name")
    private String fServiceName;
    @Size(max = 2147483647)
    @Column(name = "f_comment")
    private String fComment;
    @Column(name = "f_date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDateCreated;
    @Column(name = "f_user_id")
    private BigInteger fUserId;
    @Size(max = 500)
    @Column(name = "f_user_name")
    private String fUserName;
    @Column(name = "f_incident_status_id")
    private BigInteger fIncidentStatusId;
    @Size(max = 255)
    @Column(name = "f_incident_name")
    private String fIncidentName;

    public VIncident() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getFDate() {
        return fDate;
    }

    public void setFDate(String fDate) {
        this.fDate = fDate;
    }

    public BigInteger getFFirmId() {
        return fFirmId;
    }

    public void setFFirmId(BigInteger fFirmId) {
        this.fFirmId = fFirmId;
    }

    public String getFFirmName() {
        return fFirmName;
    }

    public void setFFirmName(String fFirmName) {
        this.fFirmName = fFirmName;
    }

    public BigInteger getFServiceId() {
        return fServiceId;
    }

    public void setFServiceId(BigInteger fServiceId) {
        this.fServiceId = fServiceId;
    }

    public String getFServiceName() {
        return fServiceName;
    }

    public void setFServiceName(String fServiceName) {
        this.fServiceName = fServiceName;
    }

    public String getFComment() {
        return fComment;
    }

    public void setFComment(String fComment) {
        this.fComment = fComment;
    }

    public Date getFDateCreated() {
        return fDateCreated;
    }

    public void setFDateCreated(Date fDateCreated) {
        this.fDateCreated = fDateCreated;
    }

    public BigInteger getFUserId() {
        return fUserId;
    }

    public void setFUserId(BigInteger fUserId) {
        this.fUserId = fUserId;
    }

    public String getFUserName() {
        return fUserName;
    }

    public void setFUserName(String fUserName) {
        this.fUserName = fUserName;
    }

    public BigInteger getFIncidentStatusId() {
        return fIncidentStatusId;
    }

    public void setFIncidentStatusId(BigInteger fIncidentStatusId) {
        this.fIncidentStatusId = fIncidentStatusId;
    }

    public String getFIncidentName() {
        return fIncidentName;
    }

    public void setFIncidentName(String fIncidentName) {
        this.fIncidentName = fIncidentName;
    }
    
}
