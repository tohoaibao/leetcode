import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AddingTwoNegabinaryNumbers {

    // https://leetcode.com/problems/adding-two-negabinary-numbers/
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int carry = 0, i = arr1.length - 1, j = arr2.length - 1;
        while (i >= 0 || j >=0 || carry != 0) {
            if (i >= 0) carry += arr1[i--];
            if (j >= 0) carry += arr2[j--];
            list.add(carry&1);
            carry = - (carry >> 1);
        }

        while (list.size() > 1 && list.get(list.size() - 1) == 0) {
            list.remove(list.size()-1);
        }

        int[] ans = new int[list.size()];
        int idx = list.size()-1;
        for (Integer e : list) {
            ans[idx--] = e;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,1}, arr2 = {1,0,1};
//        int[] arr1={1}, arr2={1,1,0,1};
        System.out.println(Arrays.toString(new AddingTwoNegabinaryNumbers().addNegabinary(arr1, arr2)));
    }
}