/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TSprIncidentStatus;
import javax.persistence.EntityManager;

/**
 *
 * @author vasil
 */
public class TSprIncidentStatusDAO extends abstractClassDAO<TSprIncidentStatus, Long> {

    public TSprIncidentStatusDAO(EntityManager em) {
        super(em);
    }

}
