
class Solution {
    public int cal(int x)
{
    for(int i=0;i<x;i++)
        if((i | (i+1)) == x) return i;
    return -1;
}
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] = new int[nums.size()];
        for(int i=0;i<nums.size();i++)
        {
            arr[i]=cal(nums.get(i));
        }
        return arr;
    }
}