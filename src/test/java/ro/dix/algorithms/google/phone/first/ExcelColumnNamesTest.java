package ro.dix.algorithms.google.phone.first;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class ExcelColumnNamesTest {

    /**
     * Test of getColumnName method, of class ExcelColumnNames.
     */
    @Test
    public void testGetColumnName() {
        int nr = 27;
        System.out.println("getColumnName(" + nr + ")");
        ExcelColumnNames instance = new ExcelColumnNames();
        String expResult = "AA";
        String result = instance.getColumnName(nr);
        assertEquals(expResult, result);

        nr = 28;
        System.out.println("getColumnName(" + nr + ")");
        expResult = "AB";
        result = instance.getColumnName(nr);
        assertEquals(expResult, result);

        nr = 29;
        System.out.println("getColumnName(" + nr + ")");
        expResult = "AC";
        result = instance.getColumnName(nr);
        assertEquals(expResult, result);

        nr = 1;
        System.out.println("getColumnName(" + nr + ")");
        expResult = "A";
        result = instance.getColumnName(nr);
        assertEquals(expResult, result);

        nr = 3;
        System.out.println("getColumnName(" + nr + ")");
        expResult = "C";
        result = instance.getColumnName(nr);
        assertEquals(expResult, result);
    }
}
