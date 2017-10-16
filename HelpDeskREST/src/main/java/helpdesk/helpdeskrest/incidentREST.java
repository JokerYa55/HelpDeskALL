/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import DAO_JPA.TIncidentDAO;
import DAO_JPA.TSprUsersDAO;
import beans_JPA.TIncident;
import beans_JPA.TSprUsers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */

@Path("/")
@Produces("application/json")
@Stateless
public class incidentREST {
    
    //@PersistenceContext(unitName = "helpDesk_HelpDeskREST_war_1PU")
    EntityManager em;
    
    Logger log = Logger.getLogger(getClass().getName());
    
    @GET
    @Path("/list")
    @RolesAllowed("video-rest-user")
    public List<TSprUsers> get() {
        log.debug("List");
        Map<String, Object> param = new HashMap();
        param.put("limit", 10);
        this.em = Persistence.createEntityManagerFactory("helpDesk_REST").createEntityManager();
        return ( new TSprUsersDAO(em)).getList("TSprUsers.findAll", TSprUsers.class, param);
                //videoService.list();
    }
    
}
