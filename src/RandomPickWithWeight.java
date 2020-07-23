import java.util.Arrays;

class RandomPickWithWeight {

    private double[] prob;
    public RandomPickWithWeight(int[] w) {
        double sum = 0;
        prob = new double[w.length];
        for (int e : w) {
            sum += e;
        }

        for (int i = 0; i < w.length; i++) {
            w[i] += (i == 0) ? 0 : w[i - 1];
            prob[i] = w[i]/sum;
        }
    }

    public int pickIndex() {
        return Math.abs(Arrays.binarySearch(prob, Math.random())) - 1;
    }

    public static void main(String[] args) {
        int[] w = {1, 3};
        RandomPickWithWeight obj = new RandomPickWithWeight(w);
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */