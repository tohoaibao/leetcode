import java.util.Arrays;

class RelativeSortArray {

    // https://leetcode.com/problems/relative-sort-array/
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }
        int i = 0;
        for (int num : arr2) {
            while (count[num]-- > 0) {
                arr1[i++] = num;
            }
        }

        for (int num = 0; num < count.length; num++) {
            while (count[num]-- > 0) {
                arr1[i++] = num;
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        System.out.println(Arrays.toString(new RelativeSortArray().relativeSortArray(arr1, arr2)));
    }
}