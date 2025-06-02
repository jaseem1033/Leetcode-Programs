class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n];
        check[n-1] = true;
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] == 0) {
                check[i] = false;
                continue;
            }
            else if(i + nums[i] >= n-1) {
                check[i] = true;
                continue;
            }
            else {
                for(int j = 1; j <= nums[i]; j++) {
                    if(check[i + j]) {
                        check[i] = true;
                        break;
                    }
                    else check[i] = false;
                }
            }
        }
        return check[0];
    }
}