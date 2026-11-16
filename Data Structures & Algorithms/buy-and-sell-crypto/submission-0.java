class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currPrices = prices[0];
        for(int i = 1; i<prices.length;i++){
            if(prices[i]<currPrices) currPrices = prices[i];
            else{
                int currProfit = prices[i] - currPrices;
                maxProfit = Math.max(maxProfit, currProfit);
            }
        }
        return maxProfit;
    }
}
