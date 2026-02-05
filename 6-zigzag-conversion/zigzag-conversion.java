class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) arr[i] = new StringBuilder();
        int n = s.length();
        int i = 0, row = 0;
        int curr = 0;

        while(i < n) {
            for(; curr < numRows && i < n; curr++, i++) {
                arr[curr].append(s.charAt(i));
            }
            curr = numRows - 2;

            for(; curr > 0 && i < n; curr--, i++) {
                arr[curr].append(s.charAt(i));
            }
        }

    StringBuilder res = new StringBuilder();    
    for(StringBuilder str : arr) {
        res.append(str);
    }
    return res.toString();

    }
}