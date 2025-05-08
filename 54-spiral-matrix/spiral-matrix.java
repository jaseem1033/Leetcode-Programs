class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int top,bottom,right,left;
        top=left=0;
        bottom=matrix.length-1;
        right=matrix[0].length-1;

        while(top <= bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
                arr.add(matrix[top][i]);
            top++;
            if(top>bottom) break;

            for(int i=top;i<=bottom;i++)
                arr.add(matrix[i][right]);
            right--;
            if(right<left) break;

            for(int i=right;i>=left;i--)
                arr.add(matrix[bottom][i]);
            bottom--;

            for(int i=bottom;i>=top;i--)
                arr.add(matrix[i][left]);
            left++;
        }
    return arr;
        
    }
}