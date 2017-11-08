/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.interfaces.daoInterface;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
public class TSprServiceDAO implements daoInterface<TSprServiceDAO, Long> {

    final Logger log = Logger.getLogger(getClass().getName());

    EntityManager em;

    public TSprServiceDAO() {
        this.em = Persistence.createEntityManagerFactory("helpDesk_JPA").createEntityManager();
    }

    @Override
    public EntityManager getEM() {
        return this.em;
    }

}
