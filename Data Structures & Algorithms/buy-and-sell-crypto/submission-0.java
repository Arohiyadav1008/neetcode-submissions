class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];

        for(int i=1; i<prices.length; i++){
            // Best price to buy so far
            buyPrice = Math.min(buyPrice, prices[i]);

            // Profit if we sell today
            int currProfit = prices[i] - buyPrice;

            // Maximum profit so far
            profit = Math.max(profit, currProfit);
        }
        return profit;
    }
}