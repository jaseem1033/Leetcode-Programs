class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0, n = nums.length;

        for(j = 0; j < n; j++) {
            int p = nums[j];
            map.put(p, map.getOrDefault(p, 0) + 1);

                while(map.get(p) > k) {

                    int left = nums[i];
                    map.put(left, map.get(left)- 1);
                    if(map.get(left) == 0) 
                        map.remove(left);
                    i++;
                }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}