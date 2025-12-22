class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int curr = 0;
        
        map.put(0,1);

        for(int i : nums) {
            curr += i;
            if(map.containsKey(curr - k)) count += map.get(curr-k);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return count;
    }
}