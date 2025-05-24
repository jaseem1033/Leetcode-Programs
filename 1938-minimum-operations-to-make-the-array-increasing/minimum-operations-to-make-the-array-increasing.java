class Solution {
    public int minOperations(int[] nums) {
        int op = 0;
        int i = 0;
        while(i<nums.length-1)
        {
            if(nums[i] < nums[i+1]) i++;
            else {
                nums[i+1]++;
                op++;
            }
        }
        return op;
    }
}