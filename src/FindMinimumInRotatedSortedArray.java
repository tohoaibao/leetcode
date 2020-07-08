class FindMinimumInRotatedSortedArray {

    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];  
    }

    public static void main(String[] args) {
//        int[] nums = {3,4,5,1,2};
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(new FindMinimumInRotatedSortedArray().findMin(nums));
    }
}