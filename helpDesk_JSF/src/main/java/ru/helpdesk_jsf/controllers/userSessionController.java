/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.helpdesk_jsf.controllers;

import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
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
    //private EntityManager em = appController.getEmFactory().createEntityManager();
    private static EntityManagerFactory emf = null;

    public userSessionController() {
        log.info("userSessionController");

    }

    @PostConstruct
    public void init() {
//        log.info("userSessionController app => " + appController);
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

    public void getIncidentList() {
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
//    public applicationController getAppController() {
//        return appController;
//    }
//
//    public void setAppController(applicationController appController) {
//        this.appController = appController;
//    }

}
