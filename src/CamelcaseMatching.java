import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CamelcaseMatching {

    // https://leetcode.com/problems/camelcase-matching/
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String q : queries) {
            ans.add(isMatch(q, pattern));
        }
        return ans;
    }

    private boolean isMatch(String q, String pattern) {
        int i = 0;
        for (char c : q.toCharArray()) {
            if (i < pattern.length() && c==pattern.charAt(i)) {
                i++;
            } else if (Character.isUpperCase(c)) {
                return false;
            }
        }

        return i==pattern.length();
    }

    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBa";
        System.out.println(Arrays.toString(new CamelcaseMatching().camelMatch(queries, pattern).toArray()));
    }
}