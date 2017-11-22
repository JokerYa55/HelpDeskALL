/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TFirmUsers;
import javax.persistence.EntityManager;

/**
 *
 * @author vasil
 */
public class TFirmUsersDAO extends abstractClassDAO<TFirmUsers, Long> {

    public TFirmUsersDAO(EntityManager em) {
        super(em);
    }

}
