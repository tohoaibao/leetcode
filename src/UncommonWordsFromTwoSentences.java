import java.util.*;

class UncommonWordsFromTwoSentences {

    // https://leetcode.com/problems/uncommon-words-from-two-sentences/
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : A.split("\\s")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : B.split("\\s")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                res.add(key);
            }
        }

        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String A = "this apple is sweet", B = "this apple is sour";
//        String A = "apple apple", B = "banana";
        System.out.println(Arrays.toString(new UncommonWordsFromTwoSentences().uncommonFromSentences(A, B)));
    }
}