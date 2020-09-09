class FindTheSmallestDivisorGivenAThreshold {

    // https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = (int)1e6;
        while (left < right) {
            int m = left + (right - left)/2, sum = 0;
            for (int a : nums) {
                sum += (a + m - 1)/m;
            }
            if (sum > threshold) {
                left = m + 1;
            } else {
                right = m;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
//        int[] nums = {2,3,5,7,11};
//        int threshold = 11;
//        int[] nums = {19};
//        int threshold = 5;
        System.out.println(new FindTheSmallestDivisorGivenAThreshold().smallestDivisor(nums, threshold));
    }
}