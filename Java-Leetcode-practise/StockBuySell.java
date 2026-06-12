public class StockBuySell {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++) {
            if(buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // todaysprofit
                maxProfit = Math.max(profit,maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
          return maxProfit;

    }
    public static void main(String[] args) {
        int prices[] = {5,6,8,7,9,4,0};
        maxProfit(prices);
    }
}