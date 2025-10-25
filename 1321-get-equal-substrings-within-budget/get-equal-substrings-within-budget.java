class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length(), count = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < s.length(); i++) {
            arr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int j = 0, curr = 0, max = 0;

        for(int i = 0; i < n; i++) {
            curr += arr[i];
            while(curr > maxCost) {
                curr -= arr[j++];
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}