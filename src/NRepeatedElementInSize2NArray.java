
class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        int[] count = new int[10000];
        for (int a : A)
            if (count[a]++ == 1)
                return a;
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {5,1,5,2,5,3,5,4};
        System.out.println(new NRepeatedElementInSize2NArray().repeatedNTimes(A));
    }
}