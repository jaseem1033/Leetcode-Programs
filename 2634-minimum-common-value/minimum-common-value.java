class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();

        for(int i:nums1)
        hs1.add(i);

        for(int i:nums2)
        hs2.add(i);

        for(int i:nums1)
        {
            if(hs1.contains(i) && hs2.contains(i)) return i;
        }
        return -1;

    }
}