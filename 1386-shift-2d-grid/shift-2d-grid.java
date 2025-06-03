class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[][] = new int [m][n];
        List<List<Integer>> list = new ArrayList<>();
    
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int idx = i * n + j;
                idx = (idx + k) % (m * n);
                arr[idx/n][idx%n] = grid[i][j];
            }
        }
        for(int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                row.add(arr[i][j]);
            }
            list.add(row);
        }
        return list;
    }
}