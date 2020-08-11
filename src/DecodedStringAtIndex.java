class DecodedStringAtIndex {

    // https://leetcode.com/problems/decoded-string-at-index/
    public String decodeAtIndex(String S, int K) {
        int n = S.length();
        long size = 0;
        for (int i = 0; i < n; i++) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                size = size * (c - '0');
            } else {
                size++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            char c = S.charAt(i);
            K %= size;
            if (K == 0 && !Character.isDigit(c)) {
                return Character.toString(c);
            }
            if (Character.isDigit(c)) {
                size = size/(c - '0');
            } else {
                size--;
            }
        }

        throw null;
    }

    public static void main(String[] args) {
        String S = "leet2code3";
        int K = 1;
        S = "a2345678999999999999999";
        System.out.println(new DecodedStringAtIndex().decodeAtIndex(S, K));
    }
}