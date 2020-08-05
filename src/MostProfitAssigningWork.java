import java.awt.*;
import java.util.Arrays;

class MostProfitAssigningWork {

    // https://leetcode.com/problems/most-profit-assigning-work/
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        // zip difficulty and profit as jobs.
        int n = profit.length;
        Point[] jobs = new Point[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Point(profit[i], difficulty[i]);
        }
        Arrays.sort(jobs, (a, b) -> a.y - b.y);
        Arrays.sort(worker);

        int ans = 0, i = 0, best = 0;
        for (int skill: worker) {
            while (i < n && skill >= jobs[i].y) {
                best = Math.max(best, jobs[i++].x);
            }
            ans += best;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] difficulty = {2,4,6,8,10}, profit = {10,20,30,40,50}, worker = {4,5,6,7};
        System.out.println(new MostProfitAssigningWork().maxProfitAssignment(difficulty, profit, worker));
    }
}