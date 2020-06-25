import java.util.*;

class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> subList;
        while (!q.isEmpty()) {
            int level = q.size();
            subList = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                subList.add(node.val);
            }
            ans.add(subList);
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = new BinaryTreeLevelOrderTraversal().levelOrder(root);
        for (List<Integer> lst: res) {
            System.out.println(Arrays.toString(lst.toArray()));
        }

    }
}