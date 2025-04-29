class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        int count=0;
        for(char c:jewels.toCharArray())
            hm.put(c,0);
        for(char c:stones.toCharArray())
        if(hm.containsKey(c)) count++;
        return count;
    }
}