class Solution {
    public int rob(int[] nums) {
        int prev2 = 0,prev1 = nums[0],curr = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            curr = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}