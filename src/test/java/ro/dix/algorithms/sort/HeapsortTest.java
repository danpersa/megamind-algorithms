package ro.dix.algorithms.sort;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class HeapsortTest {

    @Test
    public void testSort() {
        System.out.println("sort");
        int[] v = new int[]{2, 8, 7, 1, 3, 5, 6};
        Sortable instance = new Heapsort();
        int[] expResult = new int[]{1, 2, 3, 5, 6, 7, 8};
        int[] result = instance.sort(v);
        assertTrue(Arrays.equals(result, expResult));
    }
}
