class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int i = 0;

        while(i < nums.length && nums[i] < 0) i++;

        if(i == nums.length) return 1;
        if(nums[i] > 0 && nums[i] != 1) return 1;

        else {
            while(i < nums.length - 1) {
                if(nums[i] != nums[i+1] && nums[i] + 1 != nums[i+1]) return nums[i] + 1;
                i++;
            }
        }
        return nums[nums.length - 1] + 1;
    }
}