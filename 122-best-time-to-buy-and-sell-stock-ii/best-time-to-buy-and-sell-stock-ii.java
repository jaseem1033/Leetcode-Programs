class Solution {
    public int maxProfit(int[] prices) {
        int minV = prices[0];
        int profit = 0;
        int tProfit = 0;

        for(int i : prices) {
            minV = Math.min(minV,i);
            profit = Math.max(profit,i - minV);
            if(profit > 0) {
                tProfit += profit;
                profit = 0;
                minV = i;
            }
    }
    return tProfit;
}
}