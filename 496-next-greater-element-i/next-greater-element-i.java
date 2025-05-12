class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l=nums1.length;
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int count=0;
            int largest=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count=j;
                    break;
                }
            }
            for(int j=count+1;j<nums2.length;j++)
            {
               largest=Math.max(nums2[count],nums2[j]);
               if(largest>nums2[count])
               break;
            }
            if(largest==nums1[i])
                arr[i]=-1;
            else
                arr[i]=largest;
        }
        return arr;

    }
}