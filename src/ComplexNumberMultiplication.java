class ComplexNumberMultiplication {

    // https://leetcode.com/problems/complex-number-multiplication/
    public String complexNumberMultiply(String a, String b) {
        String[] A = a.split("\\+|i");
        String[] B = b.split("\\+|i");
        int x1 = Integer.parseInt(A[0]);
        int y1 = Integer.parseInt(A[1]);
        int x2 = Integer.parseInt(B[0]);
        int y2 = Integer.parseInt(B[1]);
        return String.format("%d+%di", x1*x2-y1*y2, x1*y2+x2*y1);
    }

    public static void main(String[] args) {
        String a = "1+1i";
        String b = "1+1i";
//        a = "1+-1i";
//        b = "1+-1i";
        System.out.println(new ComplexNumberMultiplication().complexNumberMultiply(a, b));
    }
}