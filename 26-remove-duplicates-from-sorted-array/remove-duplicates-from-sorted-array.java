class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i = 0, j = i + 1;

        for(; i < n-1; i++) {

            while(j < n && nums[j] == nums[i]) j++;
            if(j == n) break;
            else {
                swap(nums, i+1, j++);
            }
        }
        return i+1;

    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}