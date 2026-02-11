class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for(char c : text.toCharArray()) {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
        }

        int max = Integer.MAX_VALUE;
        map.put('o', map.get('o')/2);
        map.put('l', map.get('l')/2);

        for(int i : map.values()) {
            max = Math.min(i, max);
        }

        return max;
    }
}