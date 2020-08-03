class ReorganizeString {

    // https://leetcode.com/problems/reorganize-string/
    public String reorganizeString(String S) {
        int[] count = new int[26];
        int n = S.length();
        for (char c : S.toCharArray()) {
            count[c - 'a']++;
        }
        int max = 0, letter = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                letter = i;
            }
        }
        if (max > (n + 1)/2) return "";

        char[] res = new char[n];
        int idx = 0;
        while (count[letter] > 0) {
            res[idx] = (char)(letter + 'a');
            idx += 2;
            count[letter]--;
        }

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (idx >= n) {
                    idx = 1;
                }
                res[idx] = (char)(i + 'a');
                idx += 2;
                count[i]--;
            }
        }

        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String s = "aab";
        s = "aaaabdccee";
        System.out.println(new ReorganizeString().reorganizeString(s));
    }
}