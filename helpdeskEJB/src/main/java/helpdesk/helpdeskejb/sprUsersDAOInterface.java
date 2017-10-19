/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskejb;

import beans_JPA.TSprUsers;
import javax.ejb.Local;

/**
 *
 * @author vasil
 */
@Local
public interface sprUsersDAOInterface {
    public void addUser(TSprUsers user);
}
