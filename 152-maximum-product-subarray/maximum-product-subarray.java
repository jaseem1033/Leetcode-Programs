class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int x = nums[i];

            if(x < 0) {
                int temp = min;
                min = max;
                max = temp;
            }

            min = Math.min(min * x, x);
            max = Math.max(max * x, x);
            res = Math.max(max, res);
        }
        return res;
    }
}