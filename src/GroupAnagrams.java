import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        String key;
        for (String s: strs) {
            key = generateKey(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private String generateKey(String str) {
        char[] A = str.toCharArray();
        Arrays.sort(A);
        return new String(A);
    }

    public static void main(String[] args) {
        String[] input = {"cab","pug","pei","nay","ron","rae","ems","ida","mes"};
        List<List<String>> res = new GroupAnagrams().groupAnagrams(input);
        System.out.println();
    }
}
