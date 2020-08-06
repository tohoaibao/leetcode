class MaximizeDistanceToClosestPerson {

    // https://leetcode.com/problems/maximize-distance-to-closest-person/
    // qqqq
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int ans = 0, start = 0, end = 0;
        while (seats[end] != 1) {
            end++;
        }
        ans = Math.max(ans, end);
        start = end;
        end++;
        while (end < n) {
            if (seats[end] == 1){
                ans = Math.max(ans, (end - start)/2);
                start = end;
            }
            end++;
        }

        return Math.max(ans, end - start - 1);
    }

    public static void main(String[] args) {
//        int[] A = {1,0,0,0,1,0,1};
//        int[] A = {1,0,0,0};
//        int[] A = {0,1,1,1,0,0,1,0,0};
//        int[] A = {0,0,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0};
//        int[] A = {1,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,0,0,0}; // 3
        int[] A = {1,1,1,0,0,1,1,1,1,0};//1
        System.out.println(new MaximizeDistanceToClosestPerson().maxDistToClosest(A));
    }
}