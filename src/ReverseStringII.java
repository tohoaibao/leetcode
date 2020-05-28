
public class ReverseStringII {

    public String reverseStr(String s, int k) {
        char A[] = s.toCharArray();
        int n = A.length;
        for (int i = 0; i < n; i += 2*k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            while (start < end) {
                char temp = A[start];
                A[start] = A[end];
                A[end] = temp;
                start++;
                end--;
            }
        }
        return new String(A);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(new ReverseStringII().reverseStr(s, k));
    }
}
