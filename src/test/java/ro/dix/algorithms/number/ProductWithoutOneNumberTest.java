package ro.dix.algorithms.number;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class ProductWithoutOneNumberTest {

    /**
     * Test of product method, of class ProductWithoutOneNumber.
     */
    @Test
    public void testProduct() {
        System.out.println("product");
        int[] input = new int[]{1, 2, 3, 4};
        ProductWithoutOneNumber instance = new ProductWithoutOneNumber();
        int[] expResult = {24, 12, 8, 6};
        int[] result = instance.product(input);
        System.out.println("result: " + Arrays.toString(result));
        assertTrue(Arrays.equals(expResult, result));
    }
}