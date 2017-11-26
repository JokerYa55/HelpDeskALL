/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.helpdesk_jsf.controllers;

import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    
    @Inject
    applicationController appController;
    
    private String userName;
    private String password;
    private String sessionID;    
    //private EntityManager em = appController.getEmFactory().createEntityManager();
    

    public userSessionController() {
        log.info("userSessionController app => " + appController);    
//        log.info("userSessionController em => " + em);    
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

}
