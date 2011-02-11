package ro.dix.algorithms.sort;

/**
 *
 * @author dan
 */
public class Mergesort implements Sortable {

    @Override
    public int[] sort(int[] v) {
        return mergesort(v, 0, v.length);
    }

    private int[] mergesort(int[] v, int start, int end) {
        if (start > end) {
            return new int[]{};
        } else if (start == end) {
            return new int[]{v[start]};
        }
        int m = (start + end) / 2;
        int[] v1 = mergesort(v, start, m);
        int[] v2 = mergesort(v, m + 1, end);
        if (v1 != null) {
            System.out.println("");
            System.out.print("v1=");
            for (Integer q : v1) {
                System.out.print("[" + q + "]");
            }
        }
        if (v2 != null) {
            System.out.println("");
            System.out.print("v2=");
            for (Integer q : v2) {
                System.out.print("[" + q + "]");
            }
        }
        return merge(v1, v2);
    }

    private int[] merge(int[] v1, int[] v2) {
        if (v1 == null) {
            return v2;
        }
        if (v2 == null) {
            return v1;
        }
        int max = v1.length;
        if (v2.length > max) {
            max = v2.length;
        }
        int[] result = new int[v1.length + v2.length];
        int i = 0, j = 0, k = -1;
        while (i < v1.length && j < v2.length) {
            k++;
            if (v1[i] < v2[j]) {
                result[k] = v1[i];
                i++;
            } else {
                result[k] = v2[j];
                j++;
            }
        }
        while (i < v1.length) {
            k++;
            result[k] = v1[i];
            i++;
        }
        while (j < v2.length) {
            k++;
            result[k] = v1[j];
            j++;
        }
        return result;
    }
}
