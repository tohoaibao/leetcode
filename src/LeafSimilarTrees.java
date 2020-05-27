import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        preorder(root1, leaf1);
        preorder(root2, leaf2);
        return leaf1.equals(leaf2);
    }

    // dfs - NLR
    private void preorder(TreeNode root, List<Integer> ans) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                ans.add(root.val);
            }
            preorder(root.left, ans);
            preorder(root.right, ans);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        root1.left = new TreeNode(5);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        System.out.println(new LeafSimilarTrees().leafSimilar(root1, root2));
    }
}
