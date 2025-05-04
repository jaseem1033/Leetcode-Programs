class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse_arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder str;
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            str=new StringBuilder();
            for(int j=0;j<words[i].length();j++)
            {
                int k=words[i].charAt(j)-97;
                str.append(morse_arr[k]);
            }
            hs.add(str.toString());
        }
        return hs.size();

        
    }
}