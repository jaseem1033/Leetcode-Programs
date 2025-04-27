class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('b',0);
        hm.put('a',0);
        hm.put('l',0);
        hm.put('o',0);
        hm.put('n',0);
        for(char c:text.toCharArray())
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
        }
        hm.put('l',hm.get('l')/2);
        hm.put('o',hm.get('o')/2);
        int count=10000;
        for(int i:hm.values())
        count=Math.min(count,i);
        return count;
    }
}