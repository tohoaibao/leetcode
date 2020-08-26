class PartitionArrayIntoThreePartsWithEqualSum {

    // https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
    public boolean canThreePartsEqualSum(int[] A) {
        long sum = 0;
        for (int x : A) {
            sum += x;
        }
        if (sum%3!=0) return false;
        long s = sum/3, part=0;
        int i = 0, count = 0;
        while (i < A.length) {
            part += A[i++];
            if (part==s) {
                part = 0;
                count++;
            }
            if (count==2) break;
        }

        return count==2 && i < A.length;
    }

    public static void main(String[] args) {
//        int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
//        int[] A = {0,2,1,-6,6,7,9,-1,2,0,1};
        int[] A = {18,12,-18,18,-19,-1,10,10};
//        int[] A = {1,-1,1,-1};
        System.out.println(new PartitionArrayIntoThreePartsWithEqualSum().canThreePartsEqualSum(A));
    }
}