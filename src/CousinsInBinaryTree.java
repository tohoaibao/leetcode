public class CousinsInBinaryTree {

    final class Pair {
        private TreeNode parent;
        private int level;

        public Pair(TreeNode parent, int level){
            this.parent = parent;
            this.level = level;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Pair p1 = isCousinsHelper(root, x, null, 0);
        Pair p2 = isCousinsHelper(root, y, null, 0);
        return p1.level == p2.level && p1.parent != p2.parent;
    }

    private Pair isCousinsHelper(TreeNode root, int data, TreeNode parent, int level) {
        if (root == null) {
            return null;
        }
        if (root.val == data) {
            return new Pair(parent, level);
        }
        Pair leftPair = isCousinsHelper(root.left, data, root, level + 1);
        Pair rightPair = isCousinsHelper(root.right, data, root, level + 1);

        return leftPair == null ? rightPair : leftPair;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(new CousinsInBinaryTree().isCousins(root, 5, 4));
    }
}
