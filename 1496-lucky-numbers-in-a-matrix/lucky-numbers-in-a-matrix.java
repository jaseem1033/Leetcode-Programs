class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            int min=100000;
            for(int j=0;j<matrix[i].length;j++)
            {
                min=Math.min(matrix[i][j],min);
            }
            arr1.add(min);
        }

        for(int j=0;j<matrix[0].length;j++)
        {
            int max=0;
            for(int i=0;i<matrix.length;i++)
            {
                max=Math.max(matrix[i][j],max);
            }
            arr2.add(max);
        }
        for(int i=0;i<arr1.size();i++)
        {
            if(arr2.contains(arr1.get(i)))
            arr.add(arr1.get(i));

        }
        return arr;


    }
}