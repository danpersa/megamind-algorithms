package ro.dix.algorithms.sort;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class CountSortTest {

    @Test
    public void testSort() {
        System.out.println("sort");
        int[] v = new int[]{2, 8, 7, 1, 45, 222, 3, 5, 6};
        CountSort instance = new CountSort();
        int[] expResult = new int[]{1, 2, 3, 5, 6, 7, 8, 45, 222};
        int[] result = instance.sort(v);
        assertTrue(Arrays.equals(result, expResult));
    }
}