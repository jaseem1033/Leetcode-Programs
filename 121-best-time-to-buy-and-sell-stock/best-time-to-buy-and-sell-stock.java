class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minValue = prices[0];

        for(int i : prices) {
            minValue = Math.min(minValue, i);
            maxP = Math.max(i - minValue, maxP);
        }
        return maxP;
    }
}