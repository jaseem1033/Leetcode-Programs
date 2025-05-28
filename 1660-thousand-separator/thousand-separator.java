class Solution {
    public String thousandSeparator(int n) {
        if(n < 1000) return String.valueOf(n);
        String s = "";
        int count = 0;
        while(n > 0)
        {
            if(count == 3)
            {
                s = "." + s;
                count = 0;
            }
            int rem = n % 10;
            s = rem + s;
            count++;
            n/=10;
        }
        return s;
    }
}