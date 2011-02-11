package ro.dix.algorithms.google.phone.first;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class ListIteratorsTest {

    List<Iterator<String>> list;

    @Before
    public void setUp() {
        // we create a list
        list = new ArrayList<Iterator<String>>();

        // we creata five other lists to extract the iterators
        // for the first list
        List<String> firstStringList = new ArrayList<String>();
        firstStringList.add("A");
        firstStringList.add("B");
        firstStringList.add("C");

        List<String> secondStringList = new ArrayList<String>();

        List<String> thirdStringList = new ArrayList<String>();
        thirdStringList.add("D");
        thirdStringList.add("E");

        List<String> fifthStringList = new ArrayList<String>();
        fifthStringList.add("F");

        list.add(firstStringList.iterator());
        list.add(secondStringList.iterator());
        list.add(thirdStringList.iterator());
        list.add(null);
        list.add(fifthStringList.iterator());
    }

    @Test
    public void testHasNextForEmptyList() {
        System.out.println("hasNextForEmptyList");
        ListIterators instance = new ListIterators(new ArrayList<Iterator<String>>());
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }

    @Test
    public void testHasNextForNullList() {
        System.out.println("hasNextForNullList");
        ListIterators instance = new ListIterators(null);
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }

    @Test
    public void testHasNextForSampleList() {
        System.out.println("hasNextForSampleList");
        ListIterators instance = new ListIterators(list);
        boolean expResult = true;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }

    @Test
    public void testNext() {
        System.out.println("testNext");
        ListIterators instance = new ListIterators(list);
        List<String> result = new ArrayList<String>();
        while (instance.hasNext()) {
            String s = instance.next();
            result.add(s);
        }
        String[] expectedResult = new String[]{"A", "B", "C", "D", "E", "F"};
        assertTrue(Arrays.equals(expectedResult, result.toArray()));
    }
}
