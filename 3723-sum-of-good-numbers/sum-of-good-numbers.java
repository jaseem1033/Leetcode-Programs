class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i< nums.length; i++) {
            if(i-k >=0 && i + k < n) {
                if(nums[i] > nums[i-k] && nums[i] >nums[i+k])
                sum += nums[i];
            }
            else if(i-k >= 0) {
                if(nums[i] >  nums[i-k]) 
                sum += nums[i];
            }
            else if(i+k < n) {
                if(nums[i] > nums[i+k]) 
                sum += nums[i];
            }
            else  sum += nums[i];
        }
            return sum;
    }
}