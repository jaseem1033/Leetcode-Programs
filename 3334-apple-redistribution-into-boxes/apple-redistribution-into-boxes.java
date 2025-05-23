class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Integer[] Capacity = new Integer[capacity.length];
        for(int i = 0;i<capacity.length;i++)
        Capacity[i] = capacity[i];
        Arrays.sort(Capacity,Collections.reverseOrder());
        int totalA = 0;
        int totalC = 0;

        for(int i : apple)
        totalA += i;    
        
        int i;
        for(i = 0; i < Capacity.length; i++)
        {   
            totalC += Capacity[i];
            if(totalA <= totalC) break;
        }
        return ++i;
    }
}