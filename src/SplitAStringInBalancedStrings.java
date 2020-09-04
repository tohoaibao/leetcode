class SplitAStringInBalancedStrings {

    // https://leetcode.com/problems/split-a-string-in-balanced-strings/
    public int balancedStringSplit(String s) {
        int ans = 0, x = 0;
        for (char c : s.toCharArray()) {
            x += (c=='L') ? 1 : -1;
            if (x==0) ++ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
//        s = "RLRRRLLRLL";
        System.out.println(new SplitAStringInBalancedStrings().balancedStringSplit(s));
    }
}