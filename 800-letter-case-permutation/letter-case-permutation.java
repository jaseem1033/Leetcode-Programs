class Solution {
    String s;
    List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        this.s = s;
        backTrack(0, new StringBuilder(), n);
        return result;
    }

    public void backTrack(int index, StringBuilder str, int n) {
        if(str.length() == n) {
            result.add(str.toString());
            return;
        }

        if(Character.isLetter(s.charAt(index))) {
            backTrack(index + 1, new StringBuilder(str).append(Character.toUpperCase(s.charAt(index))), n);
            backTrack(index + 1, new StringBuilder(str).append(Character.toLowerCase(s.charAt(index))), n);
        }

        else {
            backTrack(index + 1, new StringBuilder(str).append(s.charAt(index)), n);
        }
    }
}