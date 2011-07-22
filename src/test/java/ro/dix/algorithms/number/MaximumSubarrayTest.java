package ro.dix.algorithms.number;

import org.junit.Test;
import static org.junit.Assert.*;
import ro.dix.algorithms.number.MaximumSubarray.MaximumSubarrayResult;

/**
 *
 * @author dix
 */
public class MaximumSubarrayTest {

    /**
     * Test of getMaximumSubarray method, of class MaximumSubarray.
     */
    @Test
    public void testGetMaximumSubarray() {
        System.out.println("getMaximumSubarray");
        int[] v = {1, -3, 5, -2, 9, -8, -6, 4};
        MaximumSubarray instance = new MaximumSubarray();
        MaximumSubarrayResult expResult = new MaximumSubarrayResult(2, 4, 12);
        MaximumSubarrayResult result = instance.getMaximumSubarray(v);
        assertEquals(expResult, result);
    }
}
