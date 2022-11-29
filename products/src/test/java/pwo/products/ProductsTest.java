/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwo.products;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jakub Nowakowski
 */
public class ProductsTest {

    /**
     * Test of set_products method, of class Products.
     */
    @Test
    public void testSet_products() {
        System.out.println("set_products");
        Products_template[] expResult = null;
        Products_template[] result = Products.set_products();
        assertArrayEquals(expResult, result);
    }
    
}
