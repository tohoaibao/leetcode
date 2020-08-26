class BestSightseeingPair {

    // https://leetcode.com/problems/best-sightseeing-pair/
    public int maxScoreSightseeingPair(int[] A) {
        int ans = 0, maxScore = 0;
        for (int a : A) {
            ans = Math.max(ans, a + maxScore);
            maxScore = Math.max(maxScore, a);
            maxScore--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {8,1,5,2,6};
        System.out.println(new BestSightseeingPair().maxScoreSightseeingPair(A));
    }
}