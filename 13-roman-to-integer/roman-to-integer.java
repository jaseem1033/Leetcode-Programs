class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1); 
        roman.put('V',5); 
        roman.put('X',10); 
        roman.put('L',50); 
        roman.put('C',100); 
        roman.put('D',500); 
        roman.put('M',1000); 

        int sum = 0;

        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = n-1; i >= 0; i--) {
            if(i+1 < n && roman.get(arr[i]) < roman.get(arr[i+1])) 
            sum -= roman.get(arr[i]);
            else 
            sum += roman.get(arr[i]);
        }

        return sum;
    }
}