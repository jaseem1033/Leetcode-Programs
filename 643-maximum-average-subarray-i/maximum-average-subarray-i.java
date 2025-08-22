class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r;
        double sum = 0;

        for(int i = 0; i < k; i++) sum += nums[i]; 
        sum /= k;
        double max = sum;
        for(r = k; r < nums.length; r++) {
            max *= k;
            max += nums[r];
            max -= nums[l++];
            max /= k;
            sum = Math.max(sum, max);
        }
        return sum;
    }
}