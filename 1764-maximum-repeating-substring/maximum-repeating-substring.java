class Solution {
    public int maxRepeating(String sequence, String word) {
        int k=0;
        int p=1;
        String s=word;
        while(s.length()<=sequence.length())
        {
            
            if(sequence.contains(s))
            k=p;
            s=s+word;
            p++;
        }
        return k;
    }
}