
public class BestTimeToBuyAndSellStockII {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 0;
        int valley, peak;
        int maxProfit = 0;

        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            maxProfit += peak - valley;
        }

        return maxProfit;
    }


    public static void main(String[] args) {
//        int prices[] = {7,1,5,3,6,4};
        int prices[] = {1, 7, 2, 3, 6, 7, 6, 7};
        System.out.println(new BestTimeToBuyAndSellStockII().maxProfit(prices));
    }
}
