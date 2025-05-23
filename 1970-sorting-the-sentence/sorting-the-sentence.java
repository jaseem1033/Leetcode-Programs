class Solution {
    public String sortSentence(String s) {
        String arr[] = new String[10];
        String splitArr[] = s.split(" ");
        for(String str : splitArr)
        {
            int idx = str.charAt(str.length()-1) - '1';
            arr[idx] = str.substring(0,str.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == null) continue;
            sb.append(arr[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}