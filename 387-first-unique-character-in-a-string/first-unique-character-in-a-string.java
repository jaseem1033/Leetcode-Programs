class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        int idx = -1;
        char ch = '!';
        for(Character c : map.keySet()) {
            if(map.get(c) == 1) {
                ch = c;
                break;
            }
        }
        if(ch == '!') return -1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch) return i;
        }
        return -1;

    }
}