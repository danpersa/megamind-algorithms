package ro.dix.algorithms.google.phone.first;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class StringSortByComparationTest {

    @Test
    public void testSort() {
        System.out.println("sort");
        String target = "AABBAACC";
        String source = "CAB";
        StringSortByComparation instance = new StringSortByComparation();
        String expResult = "CCAAAABB";
        String result = instance.sort(target, source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}