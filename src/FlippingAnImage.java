
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int N = A[0].length;
        for (int[] row: A) {
            for (int i = 0; i < (N + 1)/2; i++) {
                int temp = 1 - row[i]; // or row[i] ^ 1
                row[i] = 1 - row[N - i - 1];
                row[N - i - 1] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int M = A.length;
        int N = A[0].length;

        A = new FlippingAnImage().flipAndInvertImage(A);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
