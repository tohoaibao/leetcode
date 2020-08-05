import java.util.HashMap;
import java.util.Map;

class ShortEncodingOfWordsTrie {

    // https://leetcode.com/problems/short-encoding-of-words/
    public int minimumLengthEncoding(String[] words) {
        TrieNode trie = new TrieNode();
        Map<TrieNode, Integer> map = new HashMap<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            TrieNode curr = trie;
            for (int j = word.length() - 1; j >= 0; j--) {
                curr = curr.get(word.charAt(j));
            }
            map.put(curr, i);
        }

        int ans = 0;
        for (TrieNode k : map.keySet()) {
            if (k.count == 0) {
                ans += words[map.get(k)].length() + 1;
            }
        }

        return ans;
    }

    class TrieNode {
        TrieNode[] children;
        int count;
        TrieNode() {
            children = new TrieNode[26];
            count = 0;
        }
        public TrieNode get(char c) {
            if (children[c - 'a'] == null) {
                children[c - 'a'] = new TrieNode();
                count++;
            }
            return children[c - 'a'];
        }

    }

    public static void main(String[] args) {
        String[] words = {"time", "me", "bell"};
//        String[] words = {"time", "me"};
        System.out.println(new ShortEncodingOfWordsTrie().minimumLengthEncoding(words));
    }
}