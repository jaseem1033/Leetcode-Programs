class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=2*n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek() <= nums[i%n])
            s.pop();

            if(i < n)
                arr[i] = s.isEmpty() ? -1 : s.peek();
            
            s.push(nums[i%n]);
        }
        return arr;
    }
}