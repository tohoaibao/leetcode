import java.util.*;

class TopKFrequentWords {

    // https://leetcode.com/problems/top-k-frequent-words/
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int v1 = map.get(o1);
                int v2 = map.get(o2);
                return v1 != v2 ? v2 - v1 : o1.compareTo(o2);
            }
        });

        for (String w : map.keySet()) {
            q.add(w);
        }
        List<String> res = new ArrayList<>();
        while (k-- > 0) {
            res.add(q.poll());
        }

        return res;
    }

    public static void main(String[] args) {
        String[] A = {"i", "love", "leetcode", "i", "love", "coding"};
//        String[] A = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 2;

        System.out.println(Arrays.toString(new TopKFrequentWords().topKFrequent(A, k).toArray()));
    }
}