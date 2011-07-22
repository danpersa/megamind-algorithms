package ro.dix.algorithms.number;

import java.util.Arrays;

/**
 * @author dix
 *
 * 43) Given a Data Structure having first n integers and next n chars.
 * A = i1 i2 i3 � iN c1 c2 c3 � cN.
 * Write an in-place algorithm to rearrange the elements of the array ass
 * A = i1 c1 i2 c2 � in cn
 */
public class ArrayOfNumbersAndChars {

    public void rearange(char[] v) {
        rearange(v, 0, v.length - 1);
    }

    // N1 N2 C1 C2
    // N1 C1 N2 C2
    public void rearange(char[] v, int start, int end) {
        if (end - start <= 2) {
            return;
        }
        int a = start + ((end - start + 1) / 4);
        int b = start + ((end - start + 1) / 2);
        int i = a;
        int j = b;
        while (i < b) {
            char t = v[j];
            v[j++] = v[i];
            v[i++] = t;
        }
        rearange(v, start, b);
        rearange(v, b, end);
    }
}
