class Solution {
    public int majorityElement(int[] nums) {
        int cant=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            cant=nums[i];
            if(cant==nums[i])
            count++;
            else
            count--;
        }
        return cant;
    }
}