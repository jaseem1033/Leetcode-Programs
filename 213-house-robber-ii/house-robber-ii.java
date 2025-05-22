class Solution {
    public int cal(int start,int end,int[] nums)
    {
        int prev2 = 0,prev1 = nums[start],curr = nums[0];
        for(int i = start+1; i < end; i++)
        {
            curr = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int a = cal(0,nums.length-1,nums);
        int b = cal(1,nums.length,nums);
        return Math.max(a,b);
    }
}