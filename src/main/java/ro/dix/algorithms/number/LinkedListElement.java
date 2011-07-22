package ro.dix.algorithms.number;

/**
 *
 * @author dix
 */
public class LinkedListElement implements Comparable<LinkedListElement> {

    public int value;
    public double randomValue;
    public LinkedListElement next;

    public LinkedListElement(int value, LinkedListElement next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public int compareTo(LinkedListElement other) {
        if (this.randomValue == other.randomValue) {
            return 0;
        }
        if (this.randomValue > other.randomValue) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "{" + value + ", " + randomValue + "}";
    }
}
