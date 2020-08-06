import java.util.Scanner;

class LeftRotation {

    // https://www.hackerrank.com/challenges/array-left-rotation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[(i + n - d)%n] = A[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }

        sc.close();
    }
}