package ro.dix.algorithms;

import ro.dix.algorithms.sort.Heapsort;
import ro.dix.algorithms.sort.Sortable;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Sortable s = new Heapsort();
        int[] v1 = new int[]{
            2, 8, 7, 1, 3, 5, 6
        };

        s.sort(v1);

        for (Integer x : v1) {
            System.out.println("" + x + ":");
        }
        
        int [] q = new int[2147483647 ];
    }
}
