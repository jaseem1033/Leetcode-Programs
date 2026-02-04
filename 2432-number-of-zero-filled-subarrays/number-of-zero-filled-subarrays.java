class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long curr = 0;
        
        for(int i : nums) {
            if(i == 0) {
                curr++;
            }
            else {
                count += (curr * (curr+1)) / 2;
                curr = 0;
            }
        }
        return count = curr != 0 ? count + (curr * (curr+1)) / 2 : count;
    }
}