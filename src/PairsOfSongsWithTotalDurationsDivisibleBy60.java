class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    // https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] map = new int[60];
        for(int t : time){
            int r = t%60;
            int key = 60 - r;
            ans+=map[key%60];
            map[r]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {30,20,150,100,40};
//        int[] A = {60,60,60};
        System.out.println(new PairsOfSongsWithTotalDurationsDivisibleBy60().numPairsDivisibleBy60(A));
    }
}