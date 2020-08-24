import java.util.Arrays;

class DIStringMatch {

    // https://leetcode.com/problems/di-string-match/
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] ans = new int[n + 1];
        int left = 0, right = n;
        for (int i = 0; i < n; ++i) {
            ans[i] = S.charAt(i) == 'I' ? left++ : right--;
        }
        ans[n] = left;
        return ans;
    }

    public static void main(String[] args) {
        String s = "IDID";
        s = "III";
        s = "DDI";
        System.out.println(Arrays.toString(new DIStringMatch().diStringMatch(s)));
    }
}