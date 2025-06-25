class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] temp = s.toCharArray();
        Character[] arr = new Character[s.length()]; 
        int p = 0;
        for(char c : temp) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            arr[p++] = c;
        }
        Arrays.sort(arr,(Character a,Character b) -> {
            if(!map.get(a).equals( map.get(b))) return map.get(b) - map.get(a);
            return a - b;
        });
        StringBuilder str= new StringBuilder();
        for(char c : arr) {
            str.append(c);
        }
        return str.toString();
    }
}