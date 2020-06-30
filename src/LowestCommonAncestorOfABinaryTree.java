public class LowestCommonAncestorOfABinaryTree {

    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;

        return left != null ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode p = new TreeNode(5);

        root.left = p;
        p.right = new TreeNode(2);
        p.right.left = new TreeNode(7);
        TreeNode k = new TreeNode(4);
        p.right.right = k;

        TreeNode q = new TreeNode(1);
        root.right = q;
        q.left = new TreeNode(0);
        q.right = new TreeNode(8);

        System.out.println(new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, k).val);
    }
}
