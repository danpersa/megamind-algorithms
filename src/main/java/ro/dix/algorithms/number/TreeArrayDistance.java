package ro.dix.algorithms.number;

/**
 * @author dan
 * 
 * You are given with three sorted arrays ( in ascending order), you are required to find a triplet
 * (one element from each array) such that distance is minimum.
 * Distance is defined like this: If a[i], b[j] and c[k] are three elements then
 * distance=max(abs(a[i]-b[j]),abs(a[i]-c[k]),abs(b[j]-c[k]))" 
 * Please give a solution in O(n) time complexity
 */
public class TreeArrayDistance {

    int distance(int[] v1, int[] v2, int[] v3, int i, int j, int k) {
        int a1 = Math.abs(v1[i] - v2[j]);
        int a2 = Math.abs(v1[i] - v3[k]);
        int a3 = Math.abs(v2[j] - v3[k]);
        int max = Math.max(a1, a2);
        max = Math.max(max, a3);
        return max;
    }

    int min(int[] v1, int[] v2, int[] v3, int i, int j, int k) {
        int m = Integer.MAX_VALUE;
        int r = 0;
        if (i < v1.length) {
            m = v1[i];
            r = 1;
        }
        if (j < v2.length) {
            if (v2[j] < m) {
                m = v2[j];
                r = 2;
            }
        }
        if (k < v3.length) {
            if (v2[k] < m) {
                m = v2[k];
                r = 3;
            }
        }
        return r;
    }

    void getTheTreeElements(int[] v1, int[] v2, int[] v3) {
        System.out.println("start");
        int i = 0, j = 0, k = 0;
        int minD = Integer.MAX_VALUE;
        int a = 0, b = 0, c = 0;
        boolean bu = false;
        do {
            int d = distance(v1, v2, v3, i, j, k);
            if (d < minD) {
                minD = d;
                a = i;
                b = j;
                c = k;
            }
            int r = min(v1, v2, v3, i + 1, j + 1, k + 1);
            bu = true;
            switch (r) {
                case 0:
                    bu = false;
                case 1:
                    ++i;
                    break;
                case 2:
                    ++j;
                    break;
                case 3:
                    ++k;
                    break;
            }
        } while (bu);
    }
}
