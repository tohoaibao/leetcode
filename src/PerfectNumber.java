class PerfectNumber {

    // https://leetcode.com/problems/perfect-number/
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                sum += i + num/i;
            }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(new PerfectNumber().checkPerfectNumber(num));
    }
}