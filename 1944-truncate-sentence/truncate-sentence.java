class Solution {
    public String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        String str = "";
        for(int i = 0;i< k-1 ;i++)
        {
            str = str + arr[i];
            str = str + " ";
        }
        str = str + arr[k-1];
        return str;
    }
}