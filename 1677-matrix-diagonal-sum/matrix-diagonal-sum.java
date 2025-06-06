class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int j=n-1;
        for(int i=0;i<n;i++)
        {
            sum+=mat[i][i];
            sum+=mat[i][j];
            j--;
        }
        if((n&1)==1)
        sum-=mat[n/2][n/2];
        return sum;
        
    }
}