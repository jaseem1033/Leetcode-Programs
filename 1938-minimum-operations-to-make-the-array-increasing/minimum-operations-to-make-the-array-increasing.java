class Solution {
    public int minOperations(int[] nums) {
        int op = 0;
        int i = 0;
        while(i<nums.length-1)
        {
            if(nums[i] >= nums[i+1]) {
                op += (nums[i] - nums[i+1]) + 1;
                nums[i+1] += (nums[i] - nums[i+1]) + 1;
            }
            i++;
        }
        return op;
    }
}