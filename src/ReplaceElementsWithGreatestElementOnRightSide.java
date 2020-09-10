import java.util.Arrays;

class ReplaceElementsWithGreatestElementOnRightSide {

    // https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(new ReplaceElementsWithGreatestElementOnRightSide().replaceElements(arr)));
    }
}