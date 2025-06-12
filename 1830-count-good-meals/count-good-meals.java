class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxV = 0;
        int mod = (int)1e9+7;
        int count = 0;

        for(int i : deliciousness) 
        maxV = Math.max(maxV,i);

        int maxP = maxV * 2;
        for(int val : deliciousness) {
            for(int i = 1; i <= maxP; i *= 2) {
                count = (count + map.getOrDefault(i-val,0)) % mod;
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return count;

    }
}