class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> arr=new ArrayList<>();
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++)
        {
            if(i%2 == 0)
            {
                for(int j=0;j<grid[i].length;j++)
                arr.add(grid[i][j]);
            }

            else
            {
                for(int j=grid[i].length-1;j>=0;j--)
                arr.add(grid[i][j]);
            }
        }

        for(int i=arr.size()-1;i>=0;i--)
        {
            if((i & 1) == 1)
            {
                arr.remove(i);
            }
        }
        return arr;
    }
}