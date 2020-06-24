import java.util.Arrays;

public class SortColors {

    // https://leetcode.com/problems/sort-colors/
    public void sortColors(int[] nums) {
        int[] counter = new int[3];
        for(int num: nums) {
            counter[num]++;
        }

        // sort arrays
        int j = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                nums[j++] = i;
                counter[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        new SortColors().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
