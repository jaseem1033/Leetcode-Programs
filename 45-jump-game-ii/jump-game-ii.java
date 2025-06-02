class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int maxJump = 0;
        int jump = 0;
        int end = 0;

        for(int i = 0; i < n - 1; i++) {
            maxJump = Math.max(maxJump,nums[i] + i);
            if(maxJump >= n-1) return ++jump;

            if(i == end) {
                end = maxJump;
                jump++;
            }
        }
        return jump;
    }
}