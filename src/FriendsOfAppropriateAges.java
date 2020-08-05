class FriendsOfAppropriateAges {

    // https://leetcode.com/problems/friends-of-appropriate-ages/
    public int numFriendRequests(int[] ages) {
        final int MAX_AGE = 120;
        int[] count = new int[MAX_AGE + 1];
        for (int age: ages) {
            count[age]++;
        }

        int ans = 0;
        for (int A = 0; A <= MAX_AGE; A++) {
            int countA = count[A];
            if (countA == 0) continue;
            for (int B = 0; B <= MAX_AGE; B++) {
                int countB = count[B];
                if (countB == 0) continue;
                if (B <= 0.5*A + 7) continue;
                if (B > A) continue;
                ans += countA*countB;
                if (A == B) ans -= countA;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] A = {16, 16};
//        int[] A = {16, 17, 18};
//        int[] A = {20,30,100,110,120};
        int[] A = {101,56,69,48,30};
        System.out.println(new FriendsOfAppropriateAges().numFriendRequests(A));
    }
}