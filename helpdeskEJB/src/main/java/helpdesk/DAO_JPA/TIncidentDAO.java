/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO_JPA;

import helpdesk.beans_JPA.TIncident;
import helpdesk.interfaces.daoInterface;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Logger;

/**
 *
 * @author vasil
 */
public class TIncidentDAO implements daoInterface<TIncident, Long> {

    private final Logger log = Logger.getLogger(getClass().getName());
    @PersistenceContext
    private EntityManager em;

    public TIncidentDAO() {
    }

    public TIncidentDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public EntityManager getEM() {
        return em;
    }
}
