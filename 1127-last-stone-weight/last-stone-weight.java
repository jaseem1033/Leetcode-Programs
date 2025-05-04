class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0]; 
        ArrayList<Integer> arr=new ArrayList<>();
        for (int stone : stones) {
        arr.add(stone);
    }
        Collections.sort(arr);
        while(arr.size()>1)
        {
           int  x=arr.get(arr.size()-1);
           int  y=arr.get(arr.size()-2);
            if(x==y)
            {
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
            }
            else
            {
                int p=Math.abs(x-y);
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add(p);
            }
            Collections.sort(arr);
        }
        if(arr.size()==0) return 0;
        else return arr.get(0);
    }
}