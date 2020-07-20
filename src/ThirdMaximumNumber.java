
class ThirdMaximumNumber {

    // https://leetcode.com/problems/third-maximum-number/
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer num : nums) {
            if (num.equals(first) || num.equals(second) || num.equals(third)) continue;
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third ) {
                third = num;
            }
        }

        return third == null ? first : third;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,-2147483648};
//        int[] nums = {1,2,2,5,3,5};
//        int[] nums = {5,2,2};
        int[] nums = {2,2,3,1};
        System.out.println(new ThirdMaximumNumber().thirdMax(nums));
    }
}