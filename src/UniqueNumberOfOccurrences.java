import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueNumberOfOccurrences {

    // https://leetcode.com/problems/unique-number-of-occurrences/
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (set.contains(val)) return false;
            set.add(val);
        }

        return true;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,2,1,1,3};
        int[] arr = {1,2};
        System.out.println(new UniqueNumberOfOccurrences().uniqueOccurrences(arr));
    }
}