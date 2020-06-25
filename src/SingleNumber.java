class SingleNumber {

    // https://leetcode.com/problems/single-number/

    /*
    * Array: {2,1,4,5,2,4,1}
    * ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5.
    * */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num: nums) {
            ans ^= num;
        }

        return ans;
    }
    


    public static void main(String[] args) {
        int[] nums = {1,3,1,-1,3};
        System.out.println(new SingleNumber().singleNumber(nums));
    }
}