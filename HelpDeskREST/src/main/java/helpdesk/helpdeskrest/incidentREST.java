/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import beans_JPA.TSprUsers;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
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
    //EntityManager em;
    
    Logger log = Logger.getLogger(getClass().getName());
    
    @GET
    @Path("/list")
    @RolesAllowed("video-rest-user")
    public List<TSprUsers> get() {
        log.debug("List");
        List<TSprUsers> res = null;
//        Map<String, Object> param = new HashMap();
//        param.put("limit", 10);
//        this.em = Persistence.createEntityManagerFactory("helpDesk_REST").createEntityManager();
//        return ( new TSprUsersDAO(em)).getList("TSprUsers.findAll", TSprUsers.class, param);
//                //videoService.list();
        return res;
    }
    
}
