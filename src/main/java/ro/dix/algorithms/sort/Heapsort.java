package ro.dix.algorithms.sort;

/**
 *
 * @author dan
 */
public class Heapsort implements Sortable {

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return 2 * i + 1;
    }

    private void maxHeapify(int v[], int i, int heapSize) {
        int l = left(i);
        int r = right(i);
        int largest = 0;
        if (l < heapSize && v[l] > v[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r < heapSize && v[r] > v[largest]) {
            largest = r;
        }
        if (largest != i) {
            int tmp = v[i];
            v[i] = v[largest];
            v[largest] = tmp;
            maxHeapify(v, largest, heapSize);
        }
    }

    private void buildMaxHeap(int[] v) {
        for (int i = v.length / 2; i >= 0; --i) {
            maxHeapify(v, i, v.length);
        }
    }

    private int[] heapSort(int[] v) {
        buildMaxHeap(v);
        int heapSize = v.length;
        for (int i = v.length - 1; i > 0; --i) {
            int tmp = v[0];
            v[0] = v[i];
            v[i] = tmp;
            --heapSize;
            maxHeapify(v, 0, heapSize);
        }
        return v;
    }

    @Override
    public int[] sort(int[] v) {
        heapSort(v);
        return v;
    }
}
