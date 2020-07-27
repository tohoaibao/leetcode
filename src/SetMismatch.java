
import java.util.Arrays;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int dup = -1, missing = 1;
        for (int num : nums) {
            if (count[num] == 1) dup = num;
            count[num]++;
        }

        for (int i = 1; i < n + 1; i++) {
            if (count[i] == 0) {
                missing = i;
                break;
            }
        }

        return new int[] {dup, missing};
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,2,4};
        int[] nums = {2,2};
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(nums)));
    }
}