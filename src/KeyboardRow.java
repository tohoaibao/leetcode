import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KeyboardRow {

    // https://leetcode.com/problems/keyboard-row/
    public String[] findWords(String[] words) {
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";
        List<String> res = new ArrayList<>();
        for (String w : words) {
            if (check(w, line1) || check(w, line2) || check(w, line3)) {
                res.add(w);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    private boolean check(String s, String line) {
        s = s.toLowerCase();
        for (Character c : s.toCharArray()) {
            if (line.indexOf(c) == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(new KeyboardRow().findWords(words)));
    }
}