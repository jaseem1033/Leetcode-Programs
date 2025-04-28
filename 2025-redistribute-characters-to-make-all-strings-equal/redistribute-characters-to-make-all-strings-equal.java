class Solution {
    public boolean makeEqual(String[] words) {
        int l=words.length;
        int arr[]=new int[26];
        for(String s:words)
        {
            for(char c:s.toCharArray())
            arr[c-'a']++;
        }
        for(int i:arr)
        {
            if(i%l!=0) return false;
        }
        return true;
    }
}