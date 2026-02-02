class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[j] == 0) {
                if(nums[i] != 0) {
                    swap(nums, j, i);
                    j++;
                }
            }
            else j++;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}