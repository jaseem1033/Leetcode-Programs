class Solution {
    public int balancedStringSplit(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++)
        {
            if(arr[i] == 'L') l++;
            if(arr[i] == 'R') r++;
            if(l == r) 
            {
                count++;
                l=0;
                r=0;
            }
        }
        return count;
    }
}