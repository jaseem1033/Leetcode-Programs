class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean checkA = true;
        boolean checkB = true;

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                checkA = false;
                break;
            }
        }

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]) {
                checkB = false;
                break;
            }
        }
        return checkA || checkB;
    }
}