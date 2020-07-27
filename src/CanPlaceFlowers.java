class CanPlaceFlowers {

    // https://leetcode.com/problems/can-place-flowers/
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;
        int prev, next;
        while (n > 0 && i < len) {
            if (flowerbed[i] == 0) {
                prev = (i == 0) ? 0 : flowerbed[i-1];
                next = (i == len - 1) ? 0 : flowerbed[i+1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            i++;
        }

        return n==0;
    }

    public static void main(String[] args) {
        int[] A = {1,0,0,0,1};
//        int[] A = {0, 0, 0, 0, 1};
//        int[] A = {1,0,0,0,1,0,0};
//        int[] A = {1,0,0,0,1,0,0};
//        int[] A = {1};
//        int[] A = {0, 1, 0};
//        int[] A = {0,0,1,0,0};
        int n = 2;
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(A, n));
    }
}