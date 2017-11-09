/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import helpdesk.DAO.TSprCommentTypeDAO;
import helpdesk.DAO.TSprUsersDAO;
import helpdesk.bean.TSprCommentType;
import helpdesk.bean.TSprUsers;
import java.util.List;
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
    @Produces(MediaType.APPLICATION_JSON)
    public TSprUsers getUser() {
        TSprUsers res = null;
        TSprUsersDAO dao = new TSprUsersDAO();
        res = dao.getItem(5, "TSprUsers.findById", TSprUsers.class);
        return res;
    }

    @GET
    @Path("/getUsersAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TSprUsers> getUsersAll() {
        List<TSprUsers> res = null;
        TSprUsersDAO dao = new TSprUsersDAO();
        res = dao.getList("TSprUsers.findAll", TSprUsers.class);
        return res;
    }
    
    @GET
    @Path("/getCommentTypeAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TSprCommentType> getCommentTypeAll() {
        List<TSprCommentType> res = null;
        TSprCommentTypeDAO dao = new TSprCommentTypeDAO();
        res = dao.getList("TSprCommentType.findAll", TSprCommentType.class);
        return res;
    }
    
}
