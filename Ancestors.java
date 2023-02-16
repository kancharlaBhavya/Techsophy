import java.util.HashMap;
import java.util.Map;

public class Ancestors {
    Node root, n1, n2, lca;

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
            node.left.parent = node;
        } else if (key > node.key) {
            node.right = insert(node.right, key);
            node.right.parent = node;
        }
        return node;
    }

    Node LCA(Node n1, Node n2) {
        Map<Node, Boolean> ancestors = new HashMap<Node, Boolean>();

        while (n1 != null) {
            ancestors.put(n1, (Boolean) Boolean.TRUE);
            n1 = n1.parent;

        }
        while (n2 != null) {
            if (ancestors.containsKey(n2) != ancestors.isEmpty()) {
                return n2;
            }
            n2 = n2.parent;

        }
        return null;

    }

    public static void main(String args[]) {
        Ancestors tree = new Ancestors();
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 22);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 14);

        tree.n1 = tree.root.left.right.left;
        tree.n2 = tree.root.left.right.right;
        tree.lca = tree.LCA(tree.n1, tree.n2);
        System.out.println("LCA of " + tree.n1.key + " and " + tree.n2.key + " is: " + tree.lca.key);

    }

    class Node {
        int key;
        Node left, right, parent;

        Node(int key) {
            this.key = key;
            left = right = parent = null;
        }

    }
}
