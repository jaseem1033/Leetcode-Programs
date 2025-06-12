class Solution {
    public int cal(int[] arr,int day,int m,int k) {
            int count = 0;
            int tcount = 0;
            for(int i : arr) {
                if(day >= i) {
                    count++;
                    if(count == k) {
                        tcount++;
                        count = 0;
                    }
                }
                else {
                    count = 0;
                }
            }
        return tcount;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(((long)m * (long)k) > bloomDay.length) return -1;

        int minV = (int)1e9 + 1; 
        int maxV = 0;

        for(int i : bloomDay) {
            minV = Math.min(minV,i);
            maxV = Math.max(maxV,i);
        }
        while(minV <= maxV) {
            int mid = (minV + maxV) / 2;
            int curr  = cal(bloomDay,mid,m,k);
            if(curr < m)  minV = mid + 1;
            else maxV = mid - 1;
        }
        return minV;
    }
}