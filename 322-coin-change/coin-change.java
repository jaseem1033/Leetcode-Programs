class Solution {
    public int coinChange(int[] coins, int amount) {
        int arr[] = new int[amount+1];
        for(int i = 1; i <= amount; i++) {
            arr[i] = Integer.MAX_VALUE;

            for(int coin : coins) {
                if(coin <= i && arr[i - coin] != Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i], 1 + arr[i - coin]);
                }
            }
        }
        if(arr[amount] == Integer.MAX_VALUE) return -1;
        return arr[amount];
    }
}