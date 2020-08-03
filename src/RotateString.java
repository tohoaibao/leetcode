class RotateString {

    // https://leetcode.com/problems/rotate-string/
    public boolean rotateString(String A, String B) {
       return A.length() == B.length() && (A + A).contains(B);
    }

    public static void main(String[] args) {
        String A = "abcde", B = "cdeab";
        System.out.println(new RotateString().rotateString(A, B));
    }
}