import java.util.Arrays;

class TwoCityScheduling {

    // https://leetcode.com/problems/two-city-scheduling/
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0, n = costs.length;
        Arrays.sort(costs, (o1, o2)-> {
            int x = o1[0]-o1[1];
            int y = o2[0]-o2[1];
            return x - y;
        });
        for (int i = 0; i < n; ++i) {
            ans += (i < n/2) ? costs[i][0] : costs[i][1];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(new TwoCityScheduling().twoCitySchedCost(costs));
    }
}