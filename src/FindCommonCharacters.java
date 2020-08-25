import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindCommonCharacters {
    // https://leetcode.com/problems/find-common-characters/
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String s : A) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; ++i) {
                count[i] = Math.min(count[i], freq[i]);
            }
        }

        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c-'a']-- > 0) {
                ans.add(Character.toString(c));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
//        String[] A = {"cool","lock","cook"};
        System.out.println(Arrays.toString(new FindCommonCharacters().commonChars(A).toArray()));
    }
}