class ValidAnagram {

    // https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];

        for(char c: s.toCharArray()) {
            arr[c - 'a']++;
        }

        for(char c: t.toCharArray()) {
            if(arr[c - 'a'] == 0) return false;
            arr[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "railsafety", t = "fairytales";
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}