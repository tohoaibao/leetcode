class LongestSubstringWithAtLeastKRepeatingCharacters {

    // https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
    public int longestSubstring(String s, int k) {
        int[] freq = new int[26];
        int res = 0, start =0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        boolean valid = true;
        for (int end = 0; end < s.length(); end++) {
            if (freq[s.charAt(end) - 'a'] < k) {
                res = Math.max(res, longestSubstring(s.substring(start, end), k));
                valid = false;
                start = end + 1;
            }
        }

        return valid ? s.length() : Math.max(res, longestSubstring(s.substring(start), k));
    }

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 2;
        System.out.println(new LongestSubstringWithAtLeastKRepeatingCharacters().longestSubstring(s, k));
    }
}