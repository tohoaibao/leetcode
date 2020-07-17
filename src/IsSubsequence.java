class IsSubsequence {

    // https://leetcode.com/problems/is-subsequence/
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int n = t.length();
        int i = 0, j = 0;
        while (i < n) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
                if (j == s.length()) return true;
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "", t = "abcd";
        System.out.println(new IsSubsequence().isSubsequence(s, t));
    }
}