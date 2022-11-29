/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwo.discrete_knapsack_problem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michal Nurzynski
 */
public class GetDataTest {

    /**
     * Test of compute method, of class GetData.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        int[] expResult = null;
        int[] result = GetData.compute();
        assertArrayEquals(expResult, result);
    }
    
}
