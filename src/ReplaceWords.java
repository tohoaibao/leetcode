import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReplaceWords {

    // https://leetcode.com/problems/replace-words/
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode trie = new TrieNode();
        for (String d: dict) {
            TrieNode curr = trie;
            for (char c : d.toCharArray()) {
                if (curr.children[c - 'a'] == null) {
                    curr.children[c - 'a'] = new TrieNode();
                }
                curr = curr.children[c - 'a'];
            }
            curr.word = d;
        }

        StringBuilder sb = new StringBuilder();
        String[] tokens = sentence.split("\\s");
        for (String s : tokens) {
            TrieNode curr = trie;
            for (char c : s.toCharArray()) {
                if (curr.children[c - 'a'] == null || curr.word != null) {
                    break;
                }
                curr = curr.children[c - 'a'];
            }
            sb.append(curr.word != null ? curr.word : s).append(" ");
        }

        return sb.toString().trim();
    }

    class TrieNode {
        TrieNode[] children;
        String word;
        TrieNode() {
            children = new TrieNode[26];
        }
    }

    public static void main(String[] args) {
        List<String> dict = new ArrayList<>(Arrays.asList("cat","bat","rat"));
        String s = "the cattle was rattled by the battery";
//        s = "aadsfasf absbs bbab cadsfafs";
        System.out.println(new ReplaceWords().replaceWords(dict, s));
    }
}