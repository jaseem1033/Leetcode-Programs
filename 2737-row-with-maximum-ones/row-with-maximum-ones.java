class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[] = new int[mat.length];
        int max = -1;
        for(int i = 0; i < mat.length; i++)
        {
            int count = 0;
            for(int j : mat[i])
                if(j == 1) count++;
            max = Math.max(max,count);
            arr[i] = count;
        }
        int idx = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == max)
            {
                idx = i;
                break;
            }
        }
        return new int[]{idx,max};
    }
}