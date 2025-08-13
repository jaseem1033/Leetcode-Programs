class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum, minSum, currMin, currMax, total;
        minSum = maxSum = currMax = currMin = total = nums[0];

        for(int i = 1; i < nums.length; i++) {
            total += nums[i];

            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(currMax,maxSum);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(currMin, minSum);
        }

        if(total - minSum == 0) return maxSum;
        return Math.max(total-minSum, maxSum);
    }
}