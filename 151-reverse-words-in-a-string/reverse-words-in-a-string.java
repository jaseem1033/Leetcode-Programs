class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() -1;

        StringBuilder str = new StringBuilder();
        StringBuilder res = new StringBuilder();

        while(i >= 0) {
            if(s.charAt(i) != ' ') {
                str.insert(0, s.charAt(i));
                i--;
            }
            else {
                res.append(str);
                str.setLength(0);
                res.append(" ");
                while(i >= 0 && s.charAt(i) == ' ') i--;
            }
        }
        res.append(str);

        return res.toString().trim();
    }
}