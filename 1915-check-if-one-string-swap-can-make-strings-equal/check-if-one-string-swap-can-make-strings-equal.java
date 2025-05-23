class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int diff1 = -1;
        int diff2 = -1;
        int count = 0;
        for(int i = 0; i<s1.length(); i++)
        {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(a != b){
                count++;
                if(count == 1) diff1 = i;
                if(count == 2) diff2 = i;
            }
            if(count > 2) return false;
        }
        if(count == 0) return true;
        if(count != 2) return false;

        if(s1.charAt(diff1) == s2.charAt(diff2) && s2.charAt(diff1) 
        == s1.charAt(diff2))
        return true;
        else return false;
    }
}