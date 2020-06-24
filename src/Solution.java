import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int number;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            number = digits[i] + carry;
            carry = number / 10;
            if (number < 10) {
                digits[i] = number;
            } else {
                digits[i] = number % 10;
            }
        }
        if (carry != 0) {
            int[] A = new int[n + 1];
            A[0] = carry;
            for (int i = 0; i < n; i++) {
                A[i + 1] = digits[i];
            }
            return A;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] input = {9,9,9};
        System.out.println(Arrays.toString(new Solution().plusOne(input)));
    }

}
