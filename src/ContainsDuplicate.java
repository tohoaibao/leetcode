import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,2};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
    }
}
