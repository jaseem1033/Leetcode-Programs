class Solution {
    List<String> result = new ArrayList<>();
    Map<Character, String> map = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return result;
        backTrack(0, new StringBuilder(), digits);
        return result;
    }

    private void backTrack(int index, StringBuilder s, String digits) {
        if(index == digits.length()) {
        result.add(s.toString());
        return;
        }

        String str = map.get(digits.charAt(index));
        for(char c : str.toCharArray()) {
            s.append(c);
            backTrack(index + 1, s, digits);
            s.deleteCharAt(s.length() - 1);
        }
    }
}