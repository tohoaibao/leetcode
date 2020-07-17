class FindTheDifference {

    // https://leetcode.com/problems/find-the-difference/
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (count[c - 'a'] == 0) return c;
            count[c - 'a']--;
        }

        return 'a';
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(new FindTheDifference().findTheDifference(s, t));
    }
}