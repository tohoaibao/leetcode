
public class ConvertSortedArrayToBinarySearchTree {

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        TreeNode root = insert(nums, 0, nums.length - 1);
        return root;
    }

    private TreeNode insert (int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = low + (high - low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insert(nums, low, mid - 1);
        root.right = insert(nums, mid + 1, high);
        return root;
    }

    public static void main(String[] args) {
//        int[] nums = {-10,-3,0,5,9};
        int[] nums = {0,1,2,3,4,5};
        System.out.println(new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(nums));
    }
}
