class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(String s:sentences)
        {
            String arr[]=s.split(" ");
            max=Math.max(arr.length,max);
        }
        return max;
    }
}