import java.util.Arrays;

class DuplicateZeros {

    public void duplicateZeros2(int[] arr) {
        int j = arr.length;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i]==0) {
                j++;
            }
        }
        for (int i = arr.length - 1; i >=0; --i) {
            if (--j < arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i]==0 && --j < arr.length) {
                arr[j] = 0;
            }
        }
    }

    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i]==0) {
                len++;
            }
        }

        int j = len - 1;
        for (int i = arr.length - 1; i < j; --i, --j) {
            if (arr[i]!=0) {
                if (j < arr.length) arr[j] = arr[i];
            } else {
                if (j < arr.length) arr[j] = arr[i];
                --j;
                if (j < arr.length) arr[j] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
//        int[] arr = {0,0,0};
//        int[] arr = {8,4,5,0,0,0,0,7};
        new DuplicateZeros().duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}