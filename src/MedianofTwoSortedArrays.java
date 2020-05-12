
public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0, j = 0, k = 0;
        int n = len1 + len2;
        int mid = n/2;
        double A[] = new double[mid + 1];
        while ((i < len1 || j < len2) && k <= mid){
            if (i < len1 && j < len2) {
                int x = nums1[i];
                int y = nums2[j];
                if (x < y) {
                    A[k++] = x;
                    i++;
                } else {
                    A[k++] = y;
                    j++;
                }
            } else if (i < len1) {
                A[k++] = nums1[i++];
            } else if (j < len2) {
                A[k++] = nums2[j++];
            }
        }

        if (n % 2 == 0) {
            return (A[mid] + A[mid-1])/2;
        }

        return A[mid];
    }


    public static void main(String[] args) {
        int nums1[] = {1, 2};
        int nums2[] = {3, 4};
        System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(nums1, nums2));
    }
}
