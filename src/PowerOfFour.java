class PowerOfFour {

    // https://leetcode.com/problems/power-of-four/
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
        // 0x55555555 is a hexametrical number，it is 1010101010101010101010101010101 in binary
        // with a length of 32. To make sure the 1 locates in the odd location.
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(new PowerOfFour().isPowerOfFour(num));
    }
}