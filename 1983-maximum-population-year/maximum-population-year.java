class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[101];
        for(int[] k : logs)
        {
            for(int i = k[0];i < k[1];i++)
                arr[i - 1950]++;
        }
        int max = -1;
        int year = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                year = i+1950;
            }
        }
        return year;
    }
}