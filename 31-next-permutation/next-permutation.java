class Solution {
    public void nextPermutation(int[] nums) {
        
        int idx = -1;

        for(int i = nums.length-1; i > 0; i--) {
            if(nums[i] > nums[i-1])  {
                idx = i - 1;
                break;
            }
        }

        int minIdx = idx + 1;
        if(idx != -1) {
            for(int i = idx + 2; i < nums.length; i++) {
                if(nums[i] < nums[minIdx] && nums[i] > nums[idx]) minIdx = i;
            }
                int temp = nums[minIdx];
                nums[minIdx] = nums[idx];
                nums[idx] = temp;
                Arrays.sort(nums, idx+1, nums.length);
        }
        else {
            Arrays.sort(nums);
        }
}
}