class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int arr[][] = new int[n][n];
        int k = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = k;
                k++;
            }
        }
        int i = 0, j = 0;
        int curr = 0;
        for(String s : commands)
        {
            if(s.equals("RIGHT"))
            curr = arr[i][++j];

            if(s.equals("LEFT"))
            curr = arr[i][--j];

            if(s.equals("UP"))
            curr = arr[--i][j];

            if(s.equals("DOWN"))
            curr = arr[++i][j];
        }
        return curr;
    }
}