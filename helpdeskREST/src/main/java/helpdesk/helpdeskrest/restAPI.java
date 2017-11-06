/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
@Path("/")
@Stateless
public class restAPI {

    final Logger log = Logger.getLogger(getClass().getName());
    
    @GET
    @Path("\test")
    public String test() {
        log.info("test");
        return "TEST";
    }

}
