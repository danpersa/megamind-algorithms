package ro.dix.algorithms.number;

import ro.dix.algorithms.number.ArrayOfNumbersAndChars;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dix
 */
public class ArrayOfNumbersAndCharsTest {

    @Test
    public void testRearange() {
        System.out.println("rearange");
        char[] v = {'1', '2', '3', '4', 'a', 'b', 'c', 'd'};

        System.out.println("initial: " + Arrays.toString(v));
        ArrayOfNumbersAndChars instance = new ArrayOfNumbersAndChars();
        instance.rearange(v);
        System.out.println("result: " + Arrays.toString(v));
        char[] expectedResult = {'1', 'a', '2', 'b', '3', 'c', '4', 'd'};
        assertTrue(Arrays.equals(expectedResult, v));
    }
}
