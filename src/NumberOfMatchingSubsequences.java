import java.util.ArrayList;
import java.util.List;

class NumberOfMatchingSubsequences {

    // https://leetcode.com/problems/number-of-matching-subsequences/
    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        List<StringBuilder>[] waiting = new List[26];
        for (int i = 'a'; i <= 'z'; i++) {
            waiting[i - 'a'] = new ArrayList<>();
        }

        for (String w : words) {
            waiting[w.charAt(0) - 'a'].add(new StringBuilder(w));
        }

        for (char c : S.toCharArray()) {
            List<StringBuilder> advance = waiting[c - 'a'];
            waiting[c - 'a'] = new ArrayList<>();
            for (StringBuilder sb : advance) {
                sb.deleteCharAt(0);
                if (sb.length() != 0) {
                    waiting[sb.charAt(0) - 'a'].add(sb);
                } else {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String S = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(new NumberOfMatchingSubsequences().numMatchingSubseq(S, words));
    }
}