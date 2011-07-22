package ro.dix.algorithms.tree;

/**
 *
 * @author dix
 */
public class IsBinaryTree {

    boolean checkByMinAndMax(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.value < min || node.value > max) {
            return false;
        }
        return checkByMinAndMax(node.left, min, node.value) && checkByMinAndMax(node.right, node.value, max);
    }

    boolean checkByInorder(Node node, int lastValue) {
        if (node == null) {
            return true;
        }
        if (node.value > lastValue || !checkByInorder(node, lastValue)) {
            return false;
        }
        lastValue = node.value;
        if (!checkByInorder(node, lastValue)) {
            return false;
        }
        return true;
    }
}
