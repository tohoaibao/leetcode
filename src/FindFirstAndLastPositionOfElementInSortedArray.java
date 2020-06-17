import java.util.Arrays;

class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                start = i;
                while (i + 1 < n && nums[++i]==target);
                end = (i==n - 1 && nums[i]==target) ? i : i - 1;
                break;
            }
        }

        return new int[] {start, end};
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10,12};
        int target = 8;
        System.out.println(Arrays.toString(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target)));
    }
}