class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>arr=new ArrayList<>();
        
        for(int i:nums1)
        {
            hm.put(i,1);
        }
        for(int i:nums2)
        {
            if(hm.containsKey(i))
            {
                arr.add(i);
                hm.remove(i);
            }
            
        }
        int[] ar=new int[arr.size()];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=arr.get(i);
        }
        return ar;
    }
}