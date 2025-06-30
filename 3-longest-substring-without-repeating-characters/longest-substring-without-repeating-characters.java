class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        char[] arr = s.toCharArray();
        while(j < s.length()) {
            if(!set.contains(arr[j])) {
                set.add(arr[j]);
                j++;
                count = Math.max(count, set.size());
            }
            else {
                set.remove(arr[i]);
                i++;
            }
        }
        return count;
    }
}