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
public class Discrete_knapsack_problemTest {

    /**
     * Test of knapSack method, of class Discrete_knapsack_problem.
     */
    @Test
    public void testKnapSack() {
        System.out.println("knapSack");
        int W = 0;
        int[] expResult = null;
        int[] result = Discrete_knapsack_problem.knapSack(W);
        assertArrayEquals(expResult, result);
    }
    
}
