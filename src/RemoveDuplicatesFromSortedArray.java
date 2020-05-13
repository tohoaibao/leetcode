import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
