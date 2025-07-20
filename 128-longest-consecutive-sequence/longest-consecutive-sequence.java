class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : nums) set.add(i);
        int maxCount = 0;

        for(int i : set) {
            if(!set.contains(i-1)) {
                int count = 1;
                
                while(set.contains(i+1)) {
                    count++;
                    i++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
    return maxCount;
    }
}