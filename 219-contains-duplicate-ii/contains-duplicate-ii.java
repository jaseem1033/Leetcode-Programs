class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(hm.containsKey(n))
            {
                    if(Math.abs(hm.get(n)-i)<=k)
                    return true;
                    else
                    hm.put(n,i);
            }
            else
            hm.put(n,i);
        }
        return false;
    }
}