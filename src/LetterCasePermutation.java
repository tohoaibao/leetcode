import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LetterCasePermutation {

    // https://leetcode.com/problems/letter-case-permutation/
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new LinkedList<>();
        char[] chars = S.toCharArray();
        dfs(chars, 0, ans);
        return ans;
    }

    private void dfs(char[] chars, int i, List<String> ans) {
        if (i == chars.length) {
            ans.add(String.valueOf(chars));
            return;
        }
        if (chars[i] >= '0' && chars[i] <= '9') {
            dfs(chars, i + 1, ans);
            return;
        }

        chars[i] = Character.toLowerCase(chars[i]);
        dfs(chars, i + 1, ans);

        chars[i] = Character.toUpperCase(chars[i]);
        dfs(chars, i + 1, ans);
    }

    public static void main(String[] args) {
        String S = "a1b2";
//        S = "3z4";
//        S = "12345";
//        S = "c";
        System.out.println(Arrays.toString(new LetterCasePermutation().letterCasePermutation(S).toArray()));
    }
}