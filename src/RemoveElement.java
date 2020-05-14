
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,2,3,2,3,5};
        int len = new RemoveElement().removeElement(arr, 3);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
