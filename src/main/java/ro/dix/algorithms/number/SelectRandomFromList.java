package ro.dix.algorithms.number;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author dix
 *
 * 37) There is a linked list of numbers of length N. N is very large and you don�t know N.
 * You have to write a function that will return k random numbers from the list.
 * Numbers should be completely random. Hint: 1. Use random function rand()
 * (returns a number between 0 and 1) and irand() (return either 0 or 1) 2.
 * It should be done in O(n).
 */
public class SelectRandomFromList {

    Random random = new Random(System.currentTimeMillis());

    public List<LinkedListElement> select(LinkedListElement first, int k) {

        PriorityQueue<LinkedListElement> q = new PriorityQueue<LinkedListElement>();

        for (LinkedListElement e = first; e != null; e = e.next) {
            double r = random.nextDouble();
            System.out.println("random: " + r);
            e.randomValue = r;
            q.offer(e);
            if (q.size() > k) {
                q.poll();
            }
        }
        System.out.println("queue: " + q);
        return new ArrayList<LinkedListElement>(q);
    }
}
