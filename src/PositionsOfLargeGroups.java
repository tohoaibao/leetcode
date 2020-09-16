import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PositionsOfLargeGroups {

    // https://leetcode.com/problems/positions-of-large-groups/
    // qqqq
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = S.length();
        char[] chars = S.toCharArray();
        int start = 0, length = 0;
        while (start < n) {
            int end = start;
            while (end < n && chars[end] == chars[start]) {
                length++;
                end++;
            }
            if (length >= 3) {
                ans.add(Arrays.asList(start, end - 1));
            }
            length = 0;
            start = end;
        }
        return ans;
    }

    public List<List<Integer>> largeGroupPositions2(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0, j = 0; i < s.length(); i = j) {
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            if (j - i >= 3) {
                ans.add(Arrays.asList(i, j - 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "abcdddeeeeaabbbcd";
//        S = "abc";
//        S = "abbxxxxzzy";
//        S = "aaaaab";
        List<List<Integer>> ans = new PositionsOfLargeGroups().largeGroupPositions(S);
        for (List<Integer> list: ans) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}