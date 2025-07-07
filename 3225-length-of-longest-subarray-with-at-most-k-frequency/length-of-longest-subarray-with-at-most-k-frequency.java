class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0, n = nums.length;

        for(j = 0; j < n; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                while(map.get(nums[j]) > k) {
                    map.put(nums[i], map.get(nums[i++])- 1);
                }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}