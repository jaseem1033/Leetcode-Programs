class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int arr[] = new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek() <= nums2[i])
                s.pop();
            map.put(nums2[i],s.isEmpty() ? -1 : s.peek());
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
            arr[i] = map.getOrDefault(nums1[i],-1);
        
        return arr;
    }
}