class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String> arr=new ArrayList<>();
        for(int k=0;k<words.length;k++)
        {
            String sstr=words[k];
            String[] str=sstr.toLowerCase().split("");
            String temp="";
            if(row1.contains(str[0])) temp=row1;
            else if(row2.contains(str[0])) temp=row2;
            else temp=row3;
            boolean flag=true;
            for(int i=0;i<str.length;i++)
            {
                if(!temp.contains(str[i]))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                arr.add(words[k]);
        }
        return arr.toArray(new String[arr.size()]);

    }
}