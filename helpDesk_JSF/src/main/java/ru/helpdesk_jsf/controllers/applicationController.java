/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.helpdesk_jsf.controllers;

import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vasil
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class applicationController {

    /**
     * Creates a new instance of applicationController
     */
    private EntityManagerFactory emFactory = null;
    Logger log = Logger.getLogger(getClass().getName());

    public applicationController() {
        log.info("**************************************************************");
        log.info("applicationController");
        if (this.emFactory != null) {
            this.emFactory = Persistence.createEntityManagerFactory("helpDesk_JPA");
    
        }
    }

    public EntityManagerFactory getEmFactory() {
        return emFactory;
    }

}
