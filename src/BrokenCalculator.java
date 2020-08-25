class BrokenCalculator {

    // https://leetcode.com/problems/broken-calculator/
    public int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            Y = Y % 2 == 0 ? Y/2 : Y + 1;
            ans++;
        }
        return ans + X - Y;
    }

    public static void main(String[] args) {
        int x = 1024, y = 1;
        System.out.println(new BrokenCalculator().brokenCalc(x, y));
    }
}