class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int k = 0;
        for(int i = columnTitle.length()-1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            int val = c - 64;
            sum += val * Math.pow(26,k++);
        }
        return sum;
    }
}