/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TSprUsers;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */

public class TSprUsersDAO {
    
    final Logger log = Logger.getLogger(getClass().getName());
    
    EntityManager em;

    public TSprUsersDAO() {
        this.em = Persistence.createEntityManagerFactory("helpDesk_JPA").createEntityManager();
    }
        
    public TSprUsers getUser(Long id) {
        log.info("em => " + em);
        TSprUsers res = null;
        em.getTransaction().begin();
        res = em.find(TSprUsers.class, id);
        em.getTransaction().commit();
        log.info("res => " + res);
        return res;

    }
}
