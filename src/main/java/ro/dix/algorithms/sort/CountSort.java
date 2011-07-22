package ro.dix.algorithms.sort;

import java.util.Arrays;

/**
 *
 * @author dan
 */
public class CountSort implements Sortable {
    
    public final int MAX_NUMBER = 1000;
    
    @Override
    public int[] sort(int[] v) {
        
        int[] c = new int[MAX_NUMBER];
        int[] b = new int[v.length];

        System.out.println("c1: " + Arrays.toString(c));
        // we count the numbers that are equals with the number for each number
        for (int i = 0; i < v.length; ++i) {
            c[v[i]]++;
        }
        System.out.println("c1: " + Arrays.toString(c));
        // we count the numbers that are less than or equals with the number
        for (int i = 1; i < MAX_NUMBER; ++i) {
            c[i] += c[i - 1];
        }
        System.out.println("c2: " + Arrays.toString(c));
        for (int i = v.length - 1; i >= 0; --i) {
            b[c[v[i]] - 1] = v[i];
            c[v[i]]--;
        }
        return b;
    }
}
