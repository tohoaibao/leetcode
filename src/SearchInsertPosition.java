public class Solution {

    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    private int searchInsert(int[] nums, int target, int low, int high) {
        int mid = low + (high - low)/2;
        if (target < nums[mid]) {
            if (mid == 0 || target > nums[mid - 1]){
                return mid;
            }
            return searchInsert(nums, target, low, mid - 1);
        }
        if (target > nums[mid]) {
            if (mid == nums.length - 1 || target < nums[mid + 1]) {
                return mid + 1;
            }
            return searchInsert(nums, target, mid + 1, high);
        }
        return mid;
    }

    public static void main(String[] args) {
        int nums[] =  {1, 3, 5, 7};
        System.out.println(new Solution().searchInsert(nums, 2));
    }
}
