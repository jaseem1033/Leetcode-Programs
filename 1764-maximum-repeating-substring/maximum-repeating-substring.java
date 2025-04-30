class Solution {
    public int maxRepeating(String sequence, String word) {
        int k=0;
        StringBuilder s=new StringBuilder(word);
        while(s.length()<=sequence.length())
        {
            
            if(sequence.contains(s))
            k++;
            s.append(word);
        }
        return k;
    }
}