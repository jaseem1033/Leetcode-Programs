class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minV = prices[0];
        for(int i : prices) {
            if(i < minV) minV = i;
            if(maxProfit < i - minV) maxProfit = i - minV;
        }
        return maxProfit;
    }
}