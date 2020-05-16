public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int nums[] = {3, 3, 4, 4, 4, 6};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}
