/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.helpdesk_jsf.controllers;

import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
    
    private String userName;
    private String password;
    private String sessionID;

    public userSessionController() {
        log.info("userSessionController");
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
