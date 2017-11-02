/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.helpdeskejb_dao;

import javax.ejb.Stateless;

/**
 *
 * @author vasil
 */
@Stateless
public class testDAO {

    public testDAO() {
    }

    public String Say() {
        return "SAY!!!";
    }
}
