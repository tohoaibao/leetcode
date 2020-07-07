import java.util.Arrays;
import java.util.Comparator;

class LargestNumber {
    // https://leetcode.com/problems/largest-number/
    public String largestNumber(int[] nums) {

        String[] s_nums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s_nums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s_nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String order1 = o1 + o2;
                String order2 = o2  + o1;
                return order2.compareTo(order1);
            }
        });

        // If, after being sorted, the largest number is `0`, the entire number is zero.
        if (s_nums[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : s_nums) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(new LargestNumber().largestNumber(nums));
    }
}