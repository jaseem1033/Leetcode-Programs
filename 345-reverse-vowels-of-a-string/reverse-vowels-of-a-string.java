class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;
        while(left < right) {
            char l = arr[left];
            char r = arr[right];
            if(set.contains(l) && set.contains(r)) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(set.contains(l)) {
                right--;
            }
            else if(set.contains(r)) {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        s = new String(arr);
        return s;
    }
}