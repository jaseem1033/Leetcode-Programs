class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) list.add(Arrays.asList(i,j));
            }
        }

        for(List<Integer> row : list) {
            int i = row.get(0);
            int j = row.get(1);

            for(int k = 0; k < Math.max(matrix.length, matrix[0].length); k++) {
                if(k < matrix[0].length) matrix[i][k] = 0;
                if(k < matrix.length) matrix[k][j] = 0;
            }
        }
    }
}