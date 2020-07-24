import java.util.HashSet;
import java.util.Set;

class DistributeCandies {

    // https://leetcode.com/problems/distribute-candies/
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int c : candies) {
            set.add(c);
        }
        return Math.min(set.size(), candies.length/2);
    }

    public static void main(String[] args) {
//        int[] A = {1,1,2,2,3,3};
        int[] A = {1,1,2,3};
        System.out.println(new DistributeCandies().distributeCandies(A));
    }
}