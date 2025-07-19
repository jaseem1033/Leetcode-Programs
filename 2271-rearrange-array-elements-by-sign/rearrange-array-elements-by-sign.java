class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
       int[] pos = new int[n/2];
       int[] neg = new int[n/2];
       
       int posIdx = 0, negIdx = 0;

       for(int i : nums) {
        if(i > 0) pos[posIdx++] = i;
        else neg[negIdx++] = i;
       }
       int idx = 0;

    for(int i = 0; i < n/2; i++) {
        nums[idx++] = pos[i];
        nums[idx++] = neg[i];
    }
    return nums;
    }
}