/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TSprIncidentStatus;
import helpdesk.interfaces.daoInterface;
import javax.persistence.EntityManager;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
public class TSprIncidentStatusDAO implements daoInterface<TSprIncidentStatus, Long> {

    final Logger log = Logger.getLogger(getClass().getName());
    
    private EntityManager em;

    public TSprIncidentStatusDAO() {
    }

    @Override
    public EntityManager getEM() {
        return this.em;
    }

}
