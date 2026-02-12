class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int total=0;
        for(int n:hm.values())
        total += (n*(n-1))/2;
        return total;
    }
}