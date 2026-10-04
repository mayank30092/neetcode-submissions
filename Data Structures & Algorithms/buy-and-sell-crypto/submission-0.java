class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int cp = prices[0];
        for(int i =1; i<prices.length;i++){
            if(cp>prices[i]){
                cp = prices[i];
            }
            int curr = prices[i]- cp;
            max = Math.max(max,curr);
        }
        return max;
    }
}
