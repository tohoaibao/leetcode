class EliminationGame {

    // https://leetcode.com/problems/elimination-game/
    public int lastRemaining(int n) {
        boolean left = true;
        int remain = n;
        int step = 1, heed = 1;
        while (remain > 1) {
            if (left || remain % 2 == 1) {
                heed = heed + step;
            }
            remain = remain / 2;
            step = step*2;
            left = !left;
        }

        return heed;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(new EliminationGame().lastRemaining(n));
    }
}