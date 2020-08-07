class BuddyStrings {

    // https://leetcode.com/problems/buddy-strings/
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        int n = A.length();
        if (A.equals(B)) {
            int[] count = new int[26];
            char c;
            for (int i = 0; i < n; i++) {
                c = A.charAt(i);
                if (count[c - 'a'] == 1) return true;
                count[c - 'a']++;
            }
            return false;
        }

        int[] count = new int[26];
        int countDiff = 0;
        char c1, c2;
        for (int i = 0; i < n; i++) {
            c1 = A.charAt(i);
            c2 = B.charAt(i);
            if (c1 != c2) {
                countDiff++;
            }
            count[c1 - 'a']++;
            count[c2 - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }

        return countDiff == 2;
    }

    public static void main(String[] args) {
        String A = "bab", B = "abb";
        System.out.println(new BuddyStrings().buddyStrings(A, B));
    }
}