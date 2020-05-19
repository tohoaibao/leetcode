public class Solution {

    /*
     divide two integers without using multiplication, division and mod operator.
     */
    public int divide(int dividend, int divisor) {
        // handling special/edge cases
        if (dividend == 0) return 0;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        if (divisor == 1 && dividend == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        boolean isPositive = divisor < 0 && dividend < 0 ? true : (divisor < 0 || dividend < 0 ? false : true);

        // value representation of result
        String value = String.valueOf(Math.abs((long)dividend));
        StringBuffer resultValue = new StringBuffer();
        long subs = Math.abs((long)divisor);
        int counter = 0;
        int reminder = 0;

        for (char digit: value.toCharArray()) {
            counter = 0;
            long longNum = (int) digit - 48;
            long interResult = reminder != 0 ? Long.parseLong(String.valueOf(reminder) + longNum) : longNum;
            while (interResult >= subs) {
                interResult -= subs;
                counter ++;
            }
            reminder = (int) interResult;
            resultValue.append(counter);
        }
        counter = Integer.parseInt(resultValue.toString());
        return isPositive ? counter : -counter;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().divide(47, 3));
    }
}
