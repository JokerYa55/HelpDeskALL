/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TSprService;
import javax.persistence.EntityManager;

/**
 *
 * @author vasil
 */
public class TSprServiceDAO extends abstractClassDAO<TSprService, Long> {

    public TSprServiceDAO(EntityManager em) {
        super(em);
    }

}
