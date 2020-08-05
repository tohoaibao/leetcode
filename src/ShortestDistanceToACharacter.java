import java.util.Arrays;

class ShortestDistanceToACharacter {

    // https://leetcode.com/problems/shortest-distance-to-a-character/
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        int idx = S.indexOf(C);
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) {
                idx = i;
            }
            res[i] = Math.abs(idx - i);
        }
        idx = S.lastIndexOf(C);
        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                idx = i;
            }
            res[i] = Math.min(res[i], Math.abs(idx - i));
        }

        return res;
    }

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        System.out.println(Arrays.toString(new ShortestDistanceToACharacter().shortestToChar(S, C)));
    }
}