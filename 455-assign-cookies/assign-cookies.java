class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=g.length;
        int cook=s.length;
        int count=0;
        if(cook==0) return 0;
        int i=0;
        int j=0;
        while(i<child && j<cook)
        {
            if(g[i]<=s[j]) 
            {
                count++;
                i++;
                j++;
            }
            else
            j++;

        }
        return count;
    }
}