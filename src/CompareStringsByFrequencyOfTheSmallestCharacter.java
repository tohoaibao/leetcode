import java.util.Arrays;

class CompareStringsByFrequencyOfTheSmallestCharacter {

    // https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] fw = new int[12];
        for (String w : words) {
            int f = getF(w);
            fw[f]++;
        }

        for (int i = 9; i >= 0; --i) {
            fw[i] = fw[i] + fw[i+1];
        }

        for (int i = 0; i < queries.length; ++i) {
            int f = getF(queries[i]);
            ans[i] = fw[f+1];
        }

        return ans;
    }

    int getF(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c-'a']++;
        }
        for (int i = 0; i < 26; ++i) {
            if (count[i] > 0) return count[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] queries = {"bbb","cc"}, words = {"a","aa","aaa","aaaa"};
//        String[] queries = {"cbd"}, words = {"zaaaz"};
        System.out.println(Arrays.toString(new CompareStringsByFrequencyOfTheSmallestCharacter().numSmallerByFrequency(queries, words)));
    }
}