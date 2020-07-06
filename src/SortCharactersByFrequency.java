import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character>[] bucket = new List[s.length() + 1];
        for (Character key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--) {
            if (bucket[pos] != null) {
                for (Character c : bucket[pos]) {
                    for (int i = 0; i < pos; i++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "accbbbd";
        System.out.println(new SortCharactersByFrequency().frequencySort(s));
    }
}