class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, maxLen = 0, maxCount = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq[c - 'A']++;
            maxCount = Math.max(maxCount, freq[c - 'A']);

            while((r - l + 1) - maxCount > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
        maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}