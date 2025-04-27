class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(ch+"")) return word;
        int idx=0;
        for(int i=0;i<word.length();i++)
        {
            if(ch==word.charAt(i))
            {
                idx=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder(word);
        int j=0;
        for(int i=idx;i>=0;i--)
        {
            sb.setCharAt(j++,word.charAt(i));
        }
        return sb.toString();

    }
}