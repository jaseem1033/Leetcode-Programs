class Solution {
    public int findMin(int[] nums) {
        int min = 5001;
        for(int i : nums) {
            min = Math.min(min,i);
        }
        return min;
    }
}