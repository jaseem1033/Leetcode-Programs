class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target)) return true;
        int n = mat.length;
        for(int p = 1; p <= 3; p++)
        {
            int arr[][] = new int[n][n];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    arr[j][n-1-i] = mat[i][j];
                }
            }
            mat = arr;
            if(Arrays.deepEquals(arr,target)) return true;
        }
        return false;
    }
}