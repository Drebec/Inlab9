
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author yaw
 */
public class BinaryTree<E extends Comparable> {

    Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(E newValue) {
        if (root == null) {
            root = new Node(newValue);
        } else {
            Node currentNode = root;
            boolean placed = false;
            while (!placed) {
                if (newValue.compareTo(currentNode.getValue()) < 0) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(new Node(newValue));
                        currentNode.getLeft().setParent(currentNode);
                        placed = true;
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                } else {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(new Node(newValue));
                        currentNode.getRight().setParent(currentNode);
                        placed = true;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }
    }

    public String makeArray(Node n) {
        String output = "";
        if (n != null) {
            output += makeArray(n.getLeft());
            output += n.getValue() + "\\";
            output += makeArray(n.getRight());
        }
        return output;
    }

    public boolean isBST() {
        String[] values = makeArray(root).split("\\\\");
        for (int i = 1; i < values.length; i++) {
            //System.out.println("Comparing " + values[i - 1] + " to " + values[i]);
            if(Integer.parseInt(values[i - 1]) > Integer.parseInt(values[i])) {
                return false;
            }
        }
        return true;
    }

    public void modify(E find, E replace) {
        modify(find, replace, root);
    }

    public void modify(E find, E replace, Node n) {
        if (n != null) {
            if (n.getValue().compareTo(find) > 0) {
                modify(find, replace, n.getLeft());
            } else if (n.getValue().compareTo(find) < 0) {
                modify(find, replace, n.getRight());
            } else {
                n.setValue(replace);
            }
        }
    }
}
