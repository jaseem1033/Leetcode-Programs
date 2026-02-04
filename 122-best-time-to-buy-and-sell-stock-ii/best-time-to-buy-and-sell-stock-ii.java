class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curr = prices[0];

        for(int i : prices)  {
            if(i <= curr) curr = i;
            else {
                maxProfit += i - curr;
                curr = i;
            }
        }
        return maxProfit;
    }
}