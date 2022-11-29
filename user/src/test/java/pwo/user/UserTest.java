/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwo.user;

import java.awt.event.ActionEvent;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jakub Kleszko
 */
public class UserTest {
    

    /**
     * Test of main method, of class User.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        User.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class User.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        User instance = new User();
        instance.actionPerformed(e);
    }
    
}
