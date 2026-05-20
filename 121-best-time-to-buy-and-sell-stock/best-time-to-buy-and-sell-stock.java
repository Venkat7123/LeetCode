class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int gain = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy) buy = prices[i];
            else if(gain < prices[i] - buy) gain = prices[i] - buy;
        }
        return gain;
    }
}