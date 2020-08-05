import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ShortEncodingOfWords {

    // https://leetcode.com/problems/short-encoding-of-words/
    public int minimumLengthEncoding(String[] words) {
       Set<String> set = new HashSet<>(Arrays.asList(words));
       for (String w : words) {
           for (int k = 1; k < w.length(); k++) {
               set.remove(w.substring(k));
           }
       }

       int ans = 0;
       for (String w : set) {
           ans += w.length() + 1;
       }

       return ans;
    }

    public static void main(String[] args) {
//        String[] words = {"time", "me", "bell"};
        String[] words = {"time", "me"};
        System.out.println(new ShortEncodingOfWords().minimumLengthEncoding(words));
    }
}