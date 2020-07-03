import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    // https://leetcode.com/problems/last-stone-weight/
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            queue.add(queue.poll() - queue.poll());
        }

        return queue.poll();
    }


    public static void main(String[] args) {
        int[] stones = {3};
        System.out.println(new LastStoneWeight().lastStoneWeight(stones));
    }
}
