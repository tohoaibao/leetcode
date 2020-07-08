class ElementAppearingMoreThan25InSortedArray {

    // https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int t = n/4;
        for (int i = 0; i < n - t; i++) {
            if (arr[i] == arr[i + t]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(new ElementAppearingMoreThan25InSortedArray().findSpecialInteger(arr));
    }
}