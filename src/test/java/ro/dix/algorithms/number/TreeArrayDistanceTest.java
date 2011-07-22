/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.dix.algorithms.number;

import org.junit.Test;

/**
 *
 * @author dan
 */
public class TreeArrayDistanceTest {

    /**
     * Test of getTheTreeElements method, of class TreeArrayDistance.
     */
    @Test
    public void testGetTheTreeElements() {
        System.out.println("getTheTreeElements");
        int[] v1 = {23, 43, 64, 65, 213};
        int[] v2 = {3, 5, 42, 77, 88, 100};
        int[] v3 = {1, 3, 78};
        TreeArrayDistance instance = new TreeArrayDistance();
        instance.getTheTreeElements(v1, v2, v3);
        
    }
}