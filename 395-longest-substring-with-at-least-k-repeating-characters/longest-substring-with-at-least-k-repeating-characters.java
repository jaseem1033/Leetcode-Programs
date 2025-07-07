class Solution {
    public int longestSubstring(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c : map.keySet()) {
            if(map.get(c) < k) {
                for(String str : s.split(c + ""))
                max = Math.max(max, longestSubstring(str, k));
                return max;
            }
        }
        return s.length();
    }
}