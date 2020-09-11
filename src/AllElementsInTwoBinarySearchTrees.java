import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class AllElementsInTwoBinarySearchTrees {

    // https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            int v1 = list1.get(i);
            int v2 = list2.get(j);
            if (v1 < v2) {
                ans.add(v1);
                i++;
            } else if (v1 > v2) {
                ans.add(v2);
                j++;
            } else {
                ans.add(v1);
                ans.add(v2);
                i++;
                j++;
            }
        }
        while (i < list1.size()) {
            ans.add(list1.get(i++));
        }
        while (j < list2.size()) {
            ans.add(list2.get(j++));
        }

        return ans;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root != null) {
            dfs(root.left, list);
            list.add(root.val);
            dfs(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        System.out.println(Arrays.toString(new AllElementsInTwoBinarySearchTrees().getAllElements(root1, root2).toArray()));
    }

}