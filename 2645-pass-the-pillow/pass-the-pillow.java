class Solution {
    public int passThePillow(int n, int time) {
        int k=0;
        while(k<=time)
        {
            for(int i=1;i<=n;i++)
            {
                if(k==time) return i;
                k++;
            }
            for(int i=n-1;i>=2;i--)
            {
                if(k==time) return i;
                k++;
            }    
        }
        return -1;
    }
}