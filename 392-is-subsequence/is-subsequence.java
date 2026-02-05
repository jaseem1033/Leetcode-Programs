class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;

        char[] arr = t.toCharArray();
        int idx = 0;
        int i = 0;

        for(; i < s.length(); i++) {
            char c = s.charAt(i);

            while(idx < t.length() && arr[idx] != c) idx++;
            if(idx == t.length()) return false;
            idx++;
        }
        return i == s.length();
    }
}