class IsomorphicStrings {

    // https://leetcode.com/problems/isomorphic-strings/
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int n = s.length();
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        char c1, c2;
        for (int i = 0; i < n; i++) {
            c1 = s.charAt(i);
            c2 = t.charAt(i);
            if (m1[c1] != m2[c2]) return false;
            m1[c1] = i + 1;
            m2[c2] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abba";
        String t = "abab";
        System.out.println(new IsomorphicStrings().isIsomorphic(s, t));
    }
}