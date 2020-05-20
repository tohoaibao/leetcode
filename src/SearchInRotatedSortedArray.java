
public class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                if (target <= nums[right] || nums[mid] > nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target >= nums[left] || nums[mid] < nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(new Solution().search(nums, 4));
    }
}
