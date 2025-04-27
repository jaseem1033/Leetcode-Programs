class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(char c:magazine.toCharArray())
        hm1.put(c,hm1.getOrDefault(c,0)+1);

        for(char c:ransomNote.toCharArray())
        {
            if(!hm1.containsKey(c)) return false;
            else if(hm1.get(c)==0) return false;
            else hm1.put(c,hm1.get(c)-1);
        }
        return true;
    }
}