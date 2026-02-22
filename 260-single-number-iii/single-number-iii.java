class Solution {
    public int[] singleNumber(int[] nums) {
        int xorBit = 0;
        for(int x : nums) {
            xorBit ^= x;
        }

        int setBit = 1;
        while(xorBit != 0) {
            if((xorBit & 1) == 1) {
                break;
            } 
            setBit <<= 1;
            xorBit >>= 1;
        }
        int res1 = 0, res2 = 0;

        for(int i : nums) {
            if((i & setBit) == 0)
            res1 ^= i;
            else 
            res2 ^= i;
        }
        return new int[]{res1, res2};
    }
}