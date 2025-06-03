class Solution {
    public int differenceOfSum(int[] nums) {
        int dsum=0,esum=0;
        for(int i=0;i<nums.length;i++)
        {
            esum+=nums[i];
            dsum+=cal(nums[i]);
        }
        return Math.abs(esum-dsum);

    }
    public int cal(int x)
    {
        int sum=0;
        while(x>0)
        {
            sum+=x%10;
            x/=10;
        }
        return sum;
    }

}