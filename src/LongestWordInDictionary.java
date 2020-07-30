import java.util.HashSet;
import java.util.Set;

class LongestWordInDictionary {

    // https://leetcode.com/problems/longest-word-in-dictionary/
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }

        String ans = "";
        for (String word : words) {
            if (word.length() > ans.length() ||
                    word.length() == ans.length() && word.compareTo(ans) < 0) {
                boolean flag = true;
                for (int i = 1; i < word.length(); i++) {
                    if (!set.contains(word.substring(0, i))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) ans = word;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"w","wo","wor","worl", "world"};
        System.out.println(new LongestWordInDictionary().longestWord(A));
    }
}