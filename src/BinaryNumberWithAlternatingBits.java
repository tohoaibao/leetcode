class BinaryNumberWithAlternatingBits {

    // https://leetcode.com/problems/binary-number-with-alternating-bits/
    public boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        for (int i = 0; i < bits.length() - 1; i++) {
            if (bits.charAt(i) == bits.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(new BinaryNumberWithAlternatingBits().hasAlternatingBits(n));
    }
}