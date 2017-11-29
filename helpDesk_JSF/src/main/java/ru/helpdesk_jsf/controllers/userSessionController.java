/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.helpdesk_jsf.controllers;

import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.primefaces.event.SelectEvent;
import ru.helpdesk_jsf.beans.TIncident;

/**
 *
 * @author vasil
 */
@ManagedBean
@SessionScoped
public class userSessionController {

    /**
     * Creates a new instance of userSessionController
     */
    Logger log = Logger.getLogger(getClass().getName());

//    @ManagedProperty("#{applicationController}")
//    private applicationController appController;
    private String userName;
    private String password;
    private String sessionID;
    private List<TIncident> incList;
    private TIncident selectedIncident;
    //private EntityManager em = appController.getEmFactory().createEntityManager();
    private static EntityManagerFactory emf = null;

    public userSessionController() {
        log.info("userSessionController");

    }

    @PostConstruct
    public void init() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public List<TIncident> getIncList() {
        return incList;
    }

    public void setIncList(List<TIncident> incList) {
        this.incList = incList;
    }

    public TIncident getSelectedIncident() {
        return selectedIncident;
    }

    public void setSelectedIncident(TIncident selectedIncident) {
        this.selectedIncident = selectedIncident;
    }

    public void onRowSelect(SelectEvent event) {
        log.info(event.getObject().toString());
        FacesMessage msg = new FacesMessage("Car Selected", ((TIncident) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void getIncidentList() {
        log.info("getIncidentList");
        //List<TIncident> res = null;
        EntityManager em = getEM();
        em.getTransaction().begin();
        TypedQuery<TIncident> namedQuery = em.createNamedQuery("TIncident.findAll", TIncident.class);
        this.incList = namedQuery.getResultList();
        em.getTransaction().commit();
        //return res;
    }

    private EntityManager getEM() {
        EntityManager res = null;
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("helpDesk_JPA");
        }
        res = emf.createEntityManager();
        return res;
    }
}
