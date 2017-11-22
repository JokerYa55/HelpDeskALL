/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TIncident;
import javax.persistence.EntityManager;

/**
 *
 * @author vasil
 */
public class TIncidentDAO extends abstractClassDAO<TIncident, Long> {

    public TIncidentDAO(EntityManager em) {
        super(em);
    }

}
