/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import helpdesk.DAO.TSprUsersDAO;
import helpdesk.bean.TSprUsers;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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
    @Path("/test")
    public String test() {
        return "TEST";
    }

    @GET
    @Path("/getUser")
    @Produces(MediaType.APPLICATION_XML)
    public TSprUsers getUser() {
        TSprUsers res = null;
        TSprUsersDAO dao = new TSprUsersDAO();
        res = dao.getUser(new Long(5));
        return res;
    }

}
