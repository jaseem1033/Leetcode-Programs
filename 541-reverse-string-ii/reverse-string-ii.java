class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        if(n == 1) return s;
        StringBuilder str;
        if(n < 2*k) {
            if(n < k) {
                str = new StringBuilder(s);
                return str.reverse().toString();
            }
            else {
                str = new StringBuilder(s.substring(0,k));
                return (str.reverse().toString() + s.substring(k));
            }
        }
        else {
            str = new StringBuilder(s);
            for(int i = 0; i < n; i = i + 2*k) {
                int l = i,r = Math.min(i + k - 1, n - 1);
                while(l < r) {
                    char temp = str.charAt(l);
                    str.setCharAt(l,str.charAt(r));
                    str.setCharAt(r,temp);
                    l++;
                    r--;
                }
            }
        }
        return str.toString();

    }
}