package ro.dix.algorithms.number;

import java.util.Arrays;

/**
 *
 * @author dan
 */
public class ProductWithoutOneNumber {

    /**
     * must not use division
     * @param input an array of elements
     * @return output[i] = sum(input[j])(j=1..n) / input[i]
     */
    public int[] product(int[] input) {
        int[] output = new int[input.length];
        int product = input[0];
        output[0] = 1;
        for (int i = 1; i < input.length; ++i) {
            output[i] = product;
            System.out.println("product: " + product + " output[" + i + "]=" + output[i]);
            product = product * input[i];
        }
        System.out.println("temp: " + Arrays.toString(output));
        product = input[input.length - 1];
        for (int i = input.length - 2; i >= 0; --i) {
            output[i] *= product;
            System.out.println("product1: " + product + " output[" + i + "]=" + output[i]);
            product = product * input[i];
        }
        return output;
    }
}
