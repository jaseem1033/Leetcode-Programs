class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r * c != mat.length*mat[0].length)
        return mat;
        int a=0,b=0;
        int arr[][]=new int[r][c];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr[a][b]=mat[i][j];
                b++;
                if(b==c)
                {
                    b=0;
                    a++;
                }
            }
        }
    return arr;
    }
}