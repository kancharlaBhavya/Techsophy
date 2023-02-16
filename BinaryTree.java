import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = null;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree();

    }

    /**
     * @return
     */
    static Node createTree() {
        Node root = null;
        System.out.println("enter data:");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        root = new Node();

        System.out.println("Enter left for:" + data);
        root.left = createTree();

        System.out.println("Enter right for" + data);
        root.right = createTree();

        return root;

    }

    public Node root;

    class Node {
        Node left, right;
        int data;

        public Node(int data) {
        }

        public Node() {
        }

        public void node(int data) {
            this.data = data;
        }
    }

    public Node buildTree(char[] in, char[] pre, int i, int j) {
        return null;
    }

    public void printInorder(Node root2) {
    }
}