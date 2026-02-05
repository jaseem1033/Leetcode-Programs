class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) str.append(c);
        }


        return (str.toString().equals(str.reverse().toString()));

    }
}