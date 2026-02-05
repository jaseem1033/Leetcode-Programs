class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length() == 0) return "";
        if(strs.length == 1) return strs[0];

        int max = Integer.MAX_VALUE;
        int l = 0;

        String s = strs[0];
        for(int i = 1; i < strs.length; i++) {
            l = 0;
            while(l < s.length() && l < strs[i].length() && s.charAt(l) == strs[i].charAt(l)) l++;;
            max = Math.min(max, l);
        }
        return s.substring(0,max);
 
    }
}