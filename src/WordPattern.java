import java.util.HashMap;
import java.util.Map;

class WordPattern {
    // https://leetcode.com/problems/word-pattern/
    public boolean wordPattern(String pattern, String str) {
        Map map = new HashMap<>();
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
            if (!map.containsKey(w)) {
                map.put(w, i);
            }

            if (map.get(c) != map.get(w)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String pattern = "abba", str = "dog cat cat dog";
//        String pattern = "abba", str = "dog cat cat fish";
//        String pattern = "aaaa", str = "dog cat cat dog";
//        String pattern = "abba", str = "dog dog dog dog";
//        String pattern = "", str = "dog";
//        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
//        String str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        String pattern = "abc", str = "b c a";
        System.out.println(new WordPattern().wordPattern(pattern, str));
    }
}