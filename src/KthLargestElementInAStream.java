import java.util.PriorityQueue;
import java.util.Queue;

class KthLargestElementInAStream {
    Queue<Integer> pq;
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for (int num: nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.add(val);
        } else if (pq.peek() < val) {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(3, arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }
}