class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r;
        double sum = 0;

        for(int i = 0; i < k; i++) sum += nums[i];
        double max = sum;
        for(r = k; r < nums.length; r++) {
            max += nums[r];
            max -= nums[l++];
            sum = Math.max(sum, max);
        }
        return sum/k;
    }
}