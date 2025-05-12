class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int lmin[] = new int[n];
        int rmin[] = new int[n];
        Stack<Integer> s = new Stack<>();
        //lmin
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            s.pop();

            lmin[i] = s.isEmpty() ? 0 : s.peek()+1;
            s.push(i);
        }
        while(!s.isEmpty())
            s.pop();
        //rmin
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            s.pop();

            rmin[i] = s.isEmpty() ? n-1 : s.peek()-1;
            s.push(i);
        }
        int result=0;
        for(int i=0;i<n;i++)
        {
            result = Math.max(result,heights[i] * (rmin[i]-lmin[i]+1));
        }
        return result;

    }
}