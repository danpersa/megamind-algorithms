package ro.dix.algorithms.structures;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author dan
 */
public class LeastRecentlyUsedCache<E> {

    int CACHE_SIZE = 3;

    private class CacheElement<E> implements Comparable<CacheElement<E>> {

        String key;
        int age;
        E element;

        public CacheElement(String key, E element) {
            this.element = element;
            this.key = key;
        }

        @Override
        public int compareTo(CacheElement<E> o) {
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return "{" + key + ", " + element + ", " + age + "}";
        }
    }
    Map<String, CacheElement<E>> map = new HashMap<String, CacheElement<E>>();
    PriorityQueue<CacheElement<E>> pq = new PriorityQueue<CacheElement<E>>();

    public E get(String key) {
        CacheElement<E> ce = map.get(key);
        if (ce == null) {
            return null;
        }
        ce.age++;
        pq.remove(ce);
        pq.offer(ce);
        return ce.element;
    }

    public void put(String key, E e) {
        CacheElement<E> ce = new CacheElement<E>(key, e);
        map.put(key, ce);
        if (pq.size() >= CACHE_SIZE) {
            CacheElement<E> q = pq.poll();
            System.out.println("poll: " + q + " age: " + q.age);
            if (q != null) {
                map.remove(key);
            }
        }
        pq.offer(ce);
    }

    public int size() {
        return pq.size();
    }
}
