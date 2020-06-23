public class JumpGame {

    public boolean canJump(int[] nums) {
       int curMax = nums[0];
       for (int i = 1; i < nums.length; i++) {
           // mean we are not able to reach position i
           if (curMax < i) {
               return false;
           }
           curMax = Math.max(curMax, i + nums[i]);
       }
       return true;
    }


    public static void main(String[] args) {
//        int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        System.out.println(new JumpGame().canJump(nums));
    }
}
