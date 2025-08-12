class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int j = 0, sum = 0, i = 0;
        while(i < nums.length) {
            sum += nums[i];
            while(sum >= target) {
                min = Math.min(min, i - j + 1);
                sum -= nums[j++];
            }
            i++;
        }
        if(min == 2147483647) return 0;
        return min;
    }
}