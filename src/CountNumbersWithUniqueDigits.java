class CountNumbersWithUniqueDigits {

    // https://leetcode.com/problems/count-numbers-with-unique-digits/
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) return 0;

        int ans = 10, base = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            base = base * (9 - i + 2);
            ans += base;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(new CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(n));
    }
}