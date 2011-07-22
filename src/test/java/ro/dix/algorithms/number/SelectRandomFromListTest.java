package ro.dix.algorithms.number;

import ro.dix.algorithms.number.SelectRandomFromList;
import ro.dix.algorithms.number.LinkedListElement;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dix
 */
public class SelectRandomFromListTest {

    final static Random r = new Random();
    final static LinkedListElement last = new LinkedListElement(10, null);
    final static LinkedListElement lle9 = new LinkedListElement(9, last);
    final static LinkedListElement lle8 = new LinkedListElement(8, lle9);
    final static LinkedListElement lle7 = new LinkedListElement(7, lle8);
    final static LinkedListElement lle6 = new LinkedListElement(6, lle7);
    final static LinkedListElement lle5 = new LinkedListElement(5, lle6);
    final static LinkedListElement lle4 = new LinkedListElement(4, lle5);
    final static LinkedListElement lle3 = new LinkedListElement(3, lle4);
    final static LinkedListElement lle2 = new LinkedListElement(2, lle3);
    final static LinkedListElement lle1 = new LinkedListElement(1, lle2);
    final static LinkedListElement thefirst = new LinkedListElement(0, lle1);

    @Test
    public void testSelect() {
        System.out.println("select");
        LinkedListElement first = SelectRandomFromListTest.thefirst;
        int k = 2;
        SelectRandomFromList instance = new SelectRandomFromList();
        List<LinkedListElement> result = instance.select(first, k);
        assertEquals(result.size(), k);
    }
}
