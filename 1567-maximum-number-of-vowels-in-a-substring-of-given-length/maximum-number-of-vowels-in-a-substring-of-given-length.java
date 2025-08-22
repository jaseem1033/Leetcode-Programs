class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int count = 0;
        for(int i = 0; i < k; i++) if(set.contains(s.charAt(i))) count++;

        int max = count;

        for(int r = k; r < s.length(); r++) {
            if(set.contains(s.charAt(r))) max++;
            if(set.contains(s.charAt(r-k))) max--;
            count = Math.max(count, max);
        }
        return count;
    }
}