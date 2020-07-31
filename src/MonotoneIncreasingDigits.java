class MonotoneIncreasingDigits {

    // https://leetcode.com/problems/monotone-increasing-digits/
    public int monotoneIncreasingDigits(int N) {
        char[] chars = String.valueOf(N).toCharArray();
        int marker = chars.length;
        for (int i = marker - 1; i > 0; i--) {
            if (chars[i] < chars[i - 1]) {
                chars[i - 1] -= 1;
                marker = i;
            }
        }

        for (int i = marker; i < chars.length; i++) {
            chars[i] = '9';
        }

        return Integer.parseInt(String.valueOf(chars));
    }

    public static void main(String[] args) {
        int N = 376;
        System.out.println(new MonotoneIncreasingDigits().monotoneIncreasingDigits(N));
    }
}