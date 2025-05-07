class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int max = -2;
            for(int j=0;j<m;j++)
            {
                max=Math.max(matrix[j][i],max);
            }
            arr[i]=max;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[j][i] == -1) matrix[j][i]=arr[i];
            }
        }
        return matrix;
    }
}