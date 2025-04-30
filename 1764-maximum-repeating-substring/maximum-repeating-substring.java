class Solution {
    public int maxRepeating(String sequence, String word) {
        int k=0;
        String s=word;
        while(s.length()<=sequence.length())
        {
            
            if(sequence.contains(s))
            k++;
            s=s+word;
        }
        return k;
    }
}