class IncreasingTripletSubsequence {

    // https://leetcode.com/problems/increasing-triplet-subsequence/
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
//        int[] nums = {5,1,5,5,2,5,4};
        int[] nums = {5,4,3,2,1};
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(nums));
    }
}