package ro.dix.algorithms.sort;

/**
 *
 * @author dan
 */
public class Heapsort1 implements Sortable {

    @Override
    public int[] sort(int[] v) {
        heapsort(v);
        return v;
    }

    int parent(int i) {
        return i / 2;
    }

    int left(int i) {
        return 2 * i;
    }

    int right(int i) {
        return 2 * i + 1;
    }

    private void maxHeapify(int[] v, int i, int heapSize) {
    }

    private void buildMaxHeap(int[] v) {
        for (int i = v.length / 2; i >= 0; --i) {
            maxHeapify(v, i, v.length);
        }
    }

    private void heapsort(int[] v) {
        buildMaxHeap(v);
        
    }
}
