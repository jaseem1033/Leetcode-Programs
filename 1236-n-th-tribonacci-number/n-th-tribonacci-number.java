class Solution {
    public int count(int n,int[]dp) {
        if(dp[n] != -1) return dp[n];
        return dp[n] = count(n-1,dp) + count(n-2,dp) + count(n-3,dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int[38];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        return count(n,dp);
    }
}