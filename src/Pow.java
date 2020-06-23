public class Pow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            return 1/(x*myPow(x,-(n + 1)));
        }
        return (n % 2 == 0) ? myPow(x*x, n/2): x*myPow(x*x, (n-1)/2);
    }

    public static void main(String[] args) {
        System.out.println(new Pow().myPow(2, -2147483648));
    }
}
