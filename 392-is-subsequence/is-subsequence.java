class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                str.append(s.charAt(i));
                i++;
                j++;
            }
            else j++;
        }
        if(s.equals(str.toString()))
        return true;
        else
        return false;
    }
}