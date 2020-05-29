class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = -1;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //If we know for sure right side is sorted or left side is unsorted
            if (nums[mid] < nums[right] || nums[mid] < nums[left]) {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                //If we know for sure left side is sorted or right side is unsorted
            } else if (nums[mid] > nums[left] || nums[mid] > nums[right]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                //If we get here, that means nums[left] == nums[mid] == nums[right], then shifting out
                //any of the two sides won't change the result but can help remove duplicate from
                //consideration, here we just use end-- but left++ works too
            } else {
                right--;
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = {2,5,6,0,0,1,2};
        int target = 0;

        System.out.println(new SearchInRotatedSortedArrayII().search(nums, target));
    }
}