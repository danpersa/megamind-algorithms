package ro.dix.algorithms.number;

import java.util.Random;
import ro.dix.algorithms.LinkedListElement;

/**
 *
 * @author dan
 */
public class RandomNumbersFromList {

    Random r = new Random();

    public int[] getRandomNumbersFromList(LinkedListElement startElement, int k) {
        int count = 0;
        int index = 0;
        int[] chosen = new int[k];
        for (LinkedListElement e = startElement; e != null && index < k; e = e.next) {
            if (r.nextDouble() <= (1.00 / ++count)) {
                chosen[index++] = e.value;
            }
        }
        return chosen;
    }
}
