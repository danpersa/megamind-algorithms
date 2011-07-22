package ro.dix.algorithms.number;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class DivisionWithoutDivideTest {

    @Test
    public void testDivide() {
        System.out.println("divide");
        int dividend = 10;
        int divisor = 2;
        DivisionWithoutDivide instance = new DivisionWithoutDivide();
        int expResult = 5;
        int result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
        
        
        dividend = 10;
        divisor = 2;
        instance = new DivisionWithoutDivide();
        expResult = 5;
        result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
    }
}