class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int arr[] = new int[keysPressed.length()];
        arr[0] = releaseTimes[0];

        for(int i = 1; i < arr.length; i++)
            arr[i] = releaseTimes[i] - releaseTimes[i-1];

        int max = -1;
        for(int i : arr) 
        max = Math.max(max,i);
        char maxChar = 'a';

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == max)
            {
                if(keysPressed.charAt(i) > maxChar)
                maxChar = keysPressed.charAt(i);
            }
        }
        return maxChar;
    
        
    }
}