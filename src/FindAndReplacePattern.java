import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAndReplacePattern {

    // https://leetcode.com/problems/find-and-replace-pattern/
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] A = stringToArray(pattern);
        List<String> ans = new ArrayList<>();
        for (String w : words) {
            if (Arrays.equals(A, stringToArray(w))) {
                ans.add(w);
            }
        }
        return ans;
    }

    private int[] stringToArray(String s) {
        int n = s.length();
        int[] arr = new int[n];
        int[] count = new int[26];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] == 0) {
                count[c - 'a'] = ++idx;
            }
            arr[i] = count[c - 'a'];
        }
        return arr;
    }


    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println(Arrays.toString(new FindAndReplacePattern().findAndReplacePattern(words, pattern).toArray()));
    }
}