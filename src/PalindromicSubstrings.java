
public class PalindromicSubstrings {

    // https://leetcode.com/problems/palindromic-substrings/
    int count = 0;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            // i is the mid point
            extendPalindrome(s, i, i ); // odd length;
            extendPalindrome(s, i, i + 1); // even length;
        }

        return count;
    }

    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }


    public static void main(String[] args) {
        String s = "abc";
        System.out.println(new PalindromicSubstrings().countSubstrings(s));
    }
}
