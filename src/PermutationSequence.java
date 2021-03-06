import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    // https://leetcode.com/problems/permutation-sequence/
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];

        // create an array of factorial lookup
        int sum = 1;
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            sum*=i;
            factorial[i] = sum;
            // create a list of numbers to get indices
            numbers.add(i);
        }

        k--;

        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k-=index*factorial[n - i];
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(new PermutationSequence().getPermutation(n, k));
    }
}
