
public class LargestTimeForGivenDigits {

    public String largestTimeFromDigits(int[] A) {
        int ans = -1;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4 ; ++j) {
                if (j != i) {
                    for (int k = 0; k < 4; ++k) {
                        if (k != i && k != j) {
                            int l = 6 - i - j - k;
                            int hours = 10*A[i] + A[j];
                            int minutes = 10*A[k] + A[l];
                            if (hours < 24 && minutes < 60) {
                                ans = Math.max(ans, hours*60 + minutes);
                            }
                        }
                    }
                }
            }
        }
        return ans >= 0 ? String.format("%02d:%02d", ans/60, ans%60) : "";
    }

    public static void main(String[] args) {
        int A[] = {5,1,5,3};
        System.out.println(new LargestTimeForGivenDigits().largestTimeFromDigits(A));
    }
}
