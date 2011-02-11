package ro.dix.algorithms.google.phone.first;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dan
 */
public class ListIterators implements Iterator<String> {

    private List<Iterator<String>> iterators;
    private int currentIndex;
    private Iterator<String> currentIterator;

    public ListIterators(List<Iterator<String>> iterators) {
        this.iterators = iterators;
    }

    @Override
    public boolean hasNext() {
        if (iterators == null || iterators.isEmpty() || currentIndex >= iterators.size()) {
            return false;
        }
        while (currentIndex < iterators.size()) {
            Iterator it = iterators.get(currentIndex);
            if (it != null && it.hasNext()) {
                currentIterator = it;
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return currentIterator.next();
        }
        return null;
    }

    @Override
    public void remove() {
    }
}
