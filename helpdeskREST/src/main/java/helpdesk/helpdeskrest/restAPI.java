/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskrest;

import helpdesk.DAO.TIncidentDAO;
import helpdesk.DAO.TSprCommentTypeDAO;
import helpdesk.DAO.TSprFirmDAO;
import helpdesk.DAO.TSprServiceDAO;
import helpdesk.DAO.TSprUsersDAO;
import helpdesk.bean.TIncident;
import helpdesk.bean.TSprCommentType;
import helpdesk.bean.TSprFirm;
import helpdesk.bean.TSprService;
import helpdesk.bean.TSprUsers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("helpDesk_JPA");
    private EntityManager em = null;

    @GET
    @Path("/test")
    public String test() {
        return "TEST";
    }

    // Обработка пользователей
    @GET
    @Path("/getUser")
    @Produces(MediaType.APPLICATION_JSON)
    public TSprUsers getUser() {

        TSprUsers res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprUsersDAO dao = new TSprUsersDAO(em);
        res = dao.getItem(5, "TSprUsers.findById", TSprUsers.class);
        em.clear();
        em.close();
        return res;
    }

    @GET
    @Path("/getUsersAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TSprUsers> getUsersAll() {
        List<TSprUsers> res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprUsersDAO dao = new TSprUsersDAO(em);
        res = dao.getList("TSprUsers.findAll", TSprUsers.class);
        em.clear();
        em.close();
        return res;
    }

    // Обработка коментариев к инцидентам
    @GET
    @Path("/getCommentType/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TSprCommentType getCommentType(@PathParam("id") Long id) {
        TSprCommentType res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprCommentTypeDAO dao = new TSprCommentTypeDAO(em);
        res = dao.getItem(id, "TSprCommentType.findById", TSprCommentType.class);
        em.clear();
        em.close();
        return res;
    }

    @GET
    @Path("/getCommentTypeAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TSprCommentType> getCommentTypeAll() {
        List<TSprCommentType> res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprCommentTypeDAO dao = new TSprCommentTypeDAO(em);
        res = dao.getList("TSprCommentType.findAll", TSprCommentType.class);
        em.clear();
        em.close();
        return res;
    }

// обработка инцидентов
    @GET
    @Path("/getIncident/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TIncident getIncident(@PathParam("id") Long id) {
        TIncident res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TIncidentDAO dao = new TIncidentDAO(em);
        res = dao.getItem(id, "TIncident.findById", TIncident.class);
        em.clear();
        em.close();
        return res;
    }

    @GET
    @Path("/getIncidentAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TIncident> getIncidentAll() {
        List<TIncident> res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TIncidentDAO dao = new TIncidentDAO(em);
        res = dao.getList("TIncident.findAll", TIncident.class);
        em.clear();
        em.close();
        return res;
    }

    // Обработка услуг TSprService
    @GET
    @Path("/getService/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TSprService getService(@PathParam("id") Long id) {
        TSprService res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprServiceDAO dao = new TSprServiceDAO(em);
        res = dao.getItem(id, "TSprService.findById", TSprService.class);
        em.clear();
        em.close();
        return res;
    }

    @GET
    @Path("/getServiceAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TSprService> getServiceAll() {
        List<TSprService> res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprServiceDAO dao = new TSprServiceDAO(em);
        res = dao.getList("TSprService.findAll", TSprService.class);
        em.clear();
        em.close();
        return res;
    }

    // Обработка фирм TSprFirm
    @GET
    @Path("/getFirm/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TSprFirm getFirm(@PathParam("id") Long id) {
        TSprFirm res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprFirmDAO dao = new TSprFirmDAO(em);
        res = dao.getItem(id, "TSprFirm.findById", TSprFirm.class);
        em.clear();
        em.close();
        return res;
    }

    @GET
    @Path("/getFirmAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TSprFirm> getFirmAll() {
        List<TSprFirm> res = null;
        if (em == null) {
            em = factory.createEntityManager();
        }
        TSprFirmDAO dao = new TSprFirmDAO(em);
        res = dao.getList("TSprFirm.findAll", TSprFirm.class);
        em.clear();
        em.close();
        return res;
    }

}
