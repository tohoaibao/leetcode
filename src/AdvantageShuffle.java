import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class AdvantageShuffle {

    // https://leetcode.com/problems/advantage-shuffle/
    public int[] advantageCount(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        Arrays.sort(A);
        // maxHeap - default minHeap
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < n; i++) {
            pq.add(new int[] {B[i], i});
        }
        int lo = 0, hi = n - 1;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int idx = curr[1], val = curr[0];
            if (A[hi] > val) {
                ans[idx] = A[hi--];
            } else {
                ans[idx] = A[lo++];
            }
        }

        return ans;
    }

    public int[] advantageCount2(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        Arrays.sort(A);
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> B[b] - B[a]);
        int lo = 0, hi = n - 1;
        for (Integer idx : index) {
            int val = B[idx];
            if (A[hi] > val) {
                ans[idx] = A[hi--];
            } else {
                ans[idx] = A[lo++];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {12,24,8,32}, B = {13,25,32,11};
        System.out.println(Arrays.toString(new AdvantageShuffle().advantageCount(A, B)));
    }
}