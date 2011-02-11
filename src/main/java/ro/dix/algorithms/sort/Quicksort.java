package ro.dix.algorithms.sort;

/**
 *
 * @author dan
 */
public class Quicksort implements Sortable {

    @Override
    public int[] sort(int[] v) {
        sort(v, 0, v.length - 1);
        return v;
    }

    private void sort(int[] v, int start, int end) {
        if (start >= end) {
            return;
        }
        int p = partition(v, start, end);
        sort(v, start, p - 1);
        sort(v, p + 1, end);
    }

    private int partition(int[] v, int start, int end) {
        int x = v[end];
        int i = start - 1;
        for (int j = start; j < end; ++j) {
            if (v[j] <= x) {
                i++;
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        int temp = v[i + 1];
        v[i + 1] = v[end];
        v[end] = temp;
        return i + 1;
    }
}
