class Balanced_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isBalanced(TreeNode rNode) {
        if (rNode == null) {
            return true;
        }
        int leftHeight = height(rNode.left);
        int rightHeight = height(rNode.right);
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(rNode.left) && isBalanced(rNode.right)) {
            return true;
        }

        return false;

    }

    private static int height(TreeNode rNode) {
        if (rNode == null)
            return 0;
        return 1 + Math.max(height(rNode.left), height(rNode.right));
    }

    public static void main(String[] args) {
        TreeNode rNode = new TreeNode(1);
        rNode.left = new TreeNode(2);
        rNode.right = new TreeNode(3);
        rNode.right.right = new TreeNode(4);
        rNode.right.right.right = new TreeNode(5);
        rNode.left.left = new TreeNode(6);

        System.out.println(isBalanced(rNode));

    }
}