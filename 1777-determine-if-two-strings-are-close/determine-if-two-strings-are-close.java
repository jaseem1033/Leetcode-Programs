class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            set1.add(c1);
            freq1[c1 - 'a']++;

            set2.add(c2);
            freq2[c2 - 'a']++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return (Arrays.equals(freq1, freq2) && set1.equals(set2));
    }
}