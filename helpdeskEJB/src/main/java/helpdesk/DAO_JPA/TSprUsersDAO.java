/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO_JPA;

import helpdesk.beans_JPA.TSprUsers;
import helpdesk.interfaces.daoInterface;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;

/**
 *
 * @author vasil
 */
@Stateless
public class TSprUsersDAO implements daoInterface<TSprUsers, Long> {

    private final Logger log = Logger.getLogger(getClass().getName());
    @PersistenceContext
    private EntityManager em;

    public TSprUsersDAO() {
    }

    public TSprUsersDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public EntityManager getEM() {
        return em;
    }

    public TSprUsers getItemByLogin(String name, String password, String jpqName, Class<TSprUsers> cl) {
        log.debug("getItemByLogin => " + name + " pass = " + password + " jpqNmame => " + jpqName);
        TSprUsers res = null;
        try {
            EntityManager em = getEM();
            TypedQuery<TSprUsers> namedQuery = em.createNamedQuery(jpqName, cl);
            namedQuery.setParameter("fPass", password);
            namedQuery.setParameter("fLogin", name);
            res = namedQuery.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
