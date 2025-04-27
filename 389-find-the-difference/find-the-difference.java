class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0) return t.charAt(0);
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();

        for(char c:s.toCharArray())
        hm1.put(c, hm1.getOrDefault(c,0)+1);
        for(char c:t.toCharArray())
        hm2.put(c, hm2.getOrDefault(c,0)+1);
        char p='a';
        for(char c:hm2.keySet())
        {
            if(hm1.containsKey(c))
            {
                if(hm2.get(c)!=hm1.get(c))
                {
                    p=c;
                    break;
                }
            }
            else
            {

                    p=c;
                    break;
            }
        }
        return p;
    }
}