class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        List<Integer> buckets[] = new List[nums.length+1];
        for(int key : map.keySet()) {
            int val = map.get(key);
            if(buckets[val] == null) {
                buckets[val] = new ArrayList<>();
            }
            buckets[val].add(key);
        }

        int [] result = new int[k];
        int i = buckets.length-1;
        while(k > 0) {
            if(buckets[i] != null && buckets[i].size() != 0) {
                result[--k] = buckets[i].get(0);
                buckets[i].remove(0);
            }
            if(buckets[i] == null || buckets[i].size() == 0)
            i--;
        }
        return result;
    }
}