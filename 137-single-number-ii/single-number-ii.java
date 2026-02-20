class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;

        for (int i = 0; i <= 31; i++) {
            int one = 0, zero = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & 1) == 1)
                    one++;
                else
                    zero++;
                nums[j] >>= 1;
            }
            int bit = one % 3 == 0 ? 0 : 1;

            res = res | (bit << i);
        }
        return res;
    }
}