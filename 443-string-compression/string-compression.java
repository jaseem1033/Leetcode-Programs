class Solution {
    public int compress(char[] chars) {
        int left = 0, right = 0, idx = 0;

        while(right <= chars.length) {
            if(right == chars.length || chars[left] != chars[right]) {
                int l = right - left;

                chars[idx++] = chars[left];

                if(l > 1) {
                    for(char c : String.valueOf(l).toCharArray()) {
                    chars[idx++] = c;
                }
                }

                left = right;
            }
            right++;
        }
        return idx;
    }
}