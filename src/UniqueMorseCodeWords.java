import java.util.HashSet;
import java.util.Set;

class UniqueMorseCodeWords {

    // https://leetcode.com/problems/unique-morse-code-words/
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : w.toCharArray()) {
                sb.append(table[c - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new UniqueMorseCodeWords().uniqueMorseRepresentations(words));
    }
}