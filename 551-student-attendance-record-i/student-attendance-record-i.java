class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        if(s.charAt(0)=='A') a++;
        int l=0;
        char[] arr=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
            if(arr[i-1]=='L' && arr[i-1]==arr[i]) l++;
            else
            l=0;
            if(l>=2) return false;
            if(arr[i]=='A') a++;
            if(a>=2) return false;

        }
        return true;
    }
}