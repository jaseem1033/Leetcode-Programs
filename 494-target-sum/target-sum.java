class Solution {
    int count;

    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        int index = 0;
        int sum = 0;
        cal(nums,index,sum,target);
        return count;
    }
    public void cal(int[] nums,int index,int sum,int target) {
        if(index == nums.length) {
            if(sum == target) count++;
            return;
        }
        cal(nums, index + 1, sum + nums[index], target);
        cal(nums, index + 1, sum - nums[index], target);
    }
}