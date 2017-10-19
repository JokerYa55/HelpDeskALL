/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskejb;

import beans_JPA.TSprUsers;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vasil
 */
public class sprUsersDAO implements sprUsersDAOInterface {

    @PersistenceContext // Внедряет EntityManager
    private EntityManager em;

    @Override
    public void addUser(TSprUsers user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
