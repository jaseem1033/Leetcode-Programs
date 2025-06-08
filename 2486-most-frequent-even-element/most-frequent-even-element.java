class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxElement = Integer.MAX_VALUE;
        int maxFreq = -1;
        for(int i : nums) {
            if((i % 2) == 0) {
                map.put(i, map.getOrDefault(i,0) + 1);
                if(map.get(i) > maxFreq) {
                    maxFreq = map.get(i);
                    maxElement = i;
                }
                if(map.get(i) == maxFreq && i < maxElement)
                {
                    maxElement = i;
                }
            }
        }
        if(maxElement != Integer.MAX_VALUE) return maxElement;
        else return -1;
    }
}