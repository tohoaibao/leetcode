import java.util.TreeMap;

class HandOfStraights {

    // https://leetcode.com/problems/hand-of-straights/
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int num : hand) {
            treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
        }

        while (!treeMap.isEmpty()) {
            int first = treeMap.firstKey();
            for (int i = first; i < first + W; i++) {
                if (!treeMap.containsKey(i)) return false;
                int c = treeMap.get(i);
                if (c == 1) {
                    treeMap.remove(i);
                } else {
                    treeMap.replace(i, c - 1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int W = 3;
        System.out.println(new HandOfStraights().isNStraightHand(hand, W));
    }
}