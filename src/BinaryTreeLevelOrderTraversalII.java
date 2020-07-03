import java.util.*;

class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> sub;
        while (!queue.isEmpty()) {
            int n = queue.size();
            sub = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                sub.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ans.add(sub);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> ans = new BinaryTreeLevelOrderTraversalII().levelOrderBottom(root);

        for (List<Integer> lst : ans) {
            System.out.println(Arrays.toString(lst.toArray()));
        }
    }
}