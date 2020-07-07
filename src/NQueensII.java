public class NQueensII {
    int count, mask, size;
    public int totalNQueens(int n) {
        count = 0;
        size = n;
        mask = (1 << n) - 1;
        backtrack( 0,0,0,0);
        return count;
    }

    private void backtrack(int y, int left, int down, int right) {
        int bitmap, bit;
        if (y == size) {
            count++;
        } else {
            bitmap = mask & ~(left | down | right);
            while (bitmap != 0) {
                bit = -bitmap & bitmap;
                bitmap ^= bit;
                backtrack(y+1, (left | bit)<<1, down | bit, (right | bit)>>1);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(new NQueensII().totalNQueens(5));
    }
}
