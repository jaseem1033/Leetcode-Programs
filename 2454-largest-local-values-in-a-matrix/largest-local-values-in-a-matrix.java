class Solution {
    public int[][] largestLocal(int[][] grid) {
        int r=grid.length;
        int[][] maxLocal=new int[r-2][r-2];
        int max=0;
        for(int I=0;I<=r-3;I++)
        {
            for(int J=0;J<=r-3;J++)
            {
                max=0;
                for(int i=I;i<I+3;i++)
                {
                    for(int j=J;j<J+3;j++)
                    {
                        max=Math.max(max,grid[i][j]);
                    }
                }
                maxLocal[I][J]=max;
            }
        }
        return maxLocal;
    }
}