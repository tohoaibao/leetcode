class NumberOfEquivalentDominoPairs {

    // https://leetcode.com/problems/number-of-equivalent-domino-pairs/
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int num;
        int ans = 0;
        for (int[] d : dominoes) {
            num = Math.min(d[0], d[1])*10 + Math.max(d[0],d[1]);
            ans += count[num];
            count[num]++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        System.out.println(new NumberOfEquivalentDominoPairs().numEquivDominoPairs(dominoes));
    }
}