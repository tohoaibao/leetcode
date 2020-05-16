public class NumberComplement {

    public int findComplement(int num) {
        int result = 1;

        // From number 1111....
        while (num > result) {
            result = result * 2 + 1;
        }

        return result - num;
    }

    public static void main(String[] args) {
        System.out.println(new NumberComplement().findComplement(5));
    }
}
