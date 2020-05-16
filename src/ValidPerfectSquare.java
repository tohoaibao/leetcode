
public class ValidPerfectSquare {

    /*
        Do not use any built-in library function such as sqrt.
     */
    public boolean isPerfectSquare(int num) {
        int mul = 1;
        while (mul * mul <= num) {
            if (mul * mul < 0) {
                return false;
            }

            if (mul * mul == num) {
                return true;
            }
            mul +=1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(Integer.MAX_VALUE));
    }
}
