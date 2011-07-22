package ro.dix.algorithms.string;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class StringReverseTest {

    @Test
    public void testReverse() {
        System.out.println("reverse");
        String source = "abcd";
        StringReverse instance = new StringReverse();
        String expResult = "dcba";
        String result = instance.reverse(source);
        assertEquals(expResult, result);
    }

    @Test
    public void testReverseInline() {
        System.out.println("reverseInline");
        String s = "abcd";
        StringReverse instance = new StringReverse();
        String expResult = "dcba";
        String result = instance.reverseInline(s);
        assertEquals(expResult, result);

        s = "abcde";
        instance = new StringReverse();
        expResult = "edcba";
        result = instance.reverseInline(s);
        assertEquals(expResult, result);

        s = "aba";
        instance = new StringReverse();
        expResult = "aba";
        result = instance.reverseInline(s);
        assertEquals(expResult, result);
    }
}