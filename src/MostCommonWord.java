import java.util.*;

class MostCommonWord {

    // https://leetcode.com/problems/most-common-word/
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] tokens = paragraph.split("\\W+");// [!?',;.\s]+
        Set<String> banSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        for (String t : tokens) {
            String s = t.toLowerCase();
            if (!banSet.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(new MostCommonWord().mostCommonWord(paragraph, banned));
    }
}