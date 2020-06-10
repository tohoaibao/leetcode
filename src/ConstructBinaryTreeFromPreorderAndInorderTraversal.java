import java.util.HashMap;
import java.util.Map;

class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
    Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length){
            return null;
        }

        for(int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int [] preorder, int preLow, int preHigh,
                               int[] inorder, int inLow, int inHigh) {

        if (preLow > preHigh || inLow > inHigh) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preLow]);
        int inorderRoot = inMap.get(root.val);
        int leftTreeLen = inorderRoot - inLow;
        root.left = buildTree(preorder, preLow + 1, preLow + leftTreeLen,
                inorder, inLow, inorderRoot - 1);
        root.right = buildTree(preorder, preLow + leftTreeLen + 1, preHigh,
                inorder, inorderRoot + 1, preHigh);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode tree = new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(preorder, inorder);
        System.out.println(tree);
        
    }
}