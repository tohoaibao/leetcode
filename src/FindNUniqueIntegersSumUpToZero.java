import java.util.Arrays;

class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = i * 2 - n + 1;
        }

        return A;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(new FindNUniqueIntegersSumUpToZero().sumZero(n)));
    }
}