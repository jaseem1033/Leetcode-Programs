class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=0;
        int k=0;
        for(int i:nums)
        {
            if(i>=k)
            {
                k=i;
                count++;
            }
        }
        return count;
}

}