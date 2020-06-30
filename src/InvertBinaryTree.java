public class InvertBinaryTree {

    // https://leetcode.com/problems/invert-binary-tree/
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode p = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = p;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println(root);
        System.out.println(new InvertBinaryTree().invertTree(root));
    }
}
