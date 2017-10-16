/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import DAO_JPA.TIncidentDAO;
import beans_JPA.TIncident;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author vasil
 */

@Path("/")
@Produces("application/json")
@Stateless
public class incidentREST {
    
    @PersistenceContext
    EntityManager em;
    
    @GET
    @Path("/list")
    @RolesAllowed("video-rest-user")
    public List<TIncident> get() {
        return ( new TIncidentDAO(em)).getList("TIncident.findAll", TIncident.class);
                //videoService.list();
    }
    
}
