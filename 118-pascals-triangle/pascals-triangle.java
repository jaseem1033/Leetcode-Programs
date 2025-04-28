class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer>row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                int a=arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
                row.add(a);
            }
            if(i>0) row.add(1);
            arr.add(row);
        } 
        return arr;
    }
}