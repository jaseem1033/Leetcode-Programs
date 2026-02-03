class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[n-1] = nums[n-1];

        for(int i = n - 2; i >= 0; i--) {
            arr[i] = arr[i+1] * nums[i];
        }

        int curr = 1;
        for(int i = 0; i < n; i++) {
            if(i == n-1) {
                nums[i] = curr;
                break;
            }
            int temp = nums[i];
            nums[i] = curr * arr[i+1];
            curr = curr * temp;
        }
        return nums;
    }
}