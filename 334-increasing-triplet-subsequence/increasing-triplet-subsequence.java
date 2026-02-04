class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;

        int i = nums[0], j = 0;
        boolean flag = false;

        for(int k = 1; k < nums.length; k++) {
            int x = nums[k];
            if(x > i && x > j && flag) return true;
            else if (x > i && j == 0) {j = x; flag = true;}
            else if (x > i && x < j) {j = x; flag = true;}
            else if(x < i) i = x;
        }
        return false;
    }
}