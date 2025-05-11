class Solution {
    public String freqAlphabets(String s) {
        char[] arr = new char[26];
        for(int i=0;i<26;i++)
            arr[i] = (char)('a' + i);

        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(c == '#')
            {
                int a = Integer.valueOf(s.substring(i-2,i));
                str.insert(0,arr[a-1]);
                i=i-2;
            }
            else
            {
                int a = Integer.valueOf(s.substring(i,i+1));
                str.insert(0,arr[a-1]);
            }

        }
        return str.toString();
    }   
}