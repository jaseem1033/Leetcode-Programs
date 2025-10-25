class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length, count = 0, total = 0, odd = 0, i = 0;

        for(int j = 0; j < n; j++) {
            if(nums[j] % 2 == 1) {
                odd++;
                if(odd >= k) {
                    count = 1;
                    while(nums[i++] % 2 == 0) count++;
                    total += count;
                }
            }
            else if(odd >= k) total += count;
        }
        return total;
    }
}