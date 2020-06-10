public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void printPreorder(TreeNode root, StringBuilder result) {
        if (root != null) {
            result.append(root.val + " ");
            printPreorder(root.left, result);
            printPreorder(root.right, result);
        }
    }

    public void printInorder(TreeNode root, StringBuilder result) {
        if (root != null) {
            printInorder(root.left, result);
            result.append(root.val + " ");
            printInorder(root.right, result);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        printPreorder(this, result);
//        printInorder(this, result);
        return result.toString();
    }
}