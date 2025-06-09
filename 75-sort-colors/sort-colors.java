class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int[3];

        for(int i : nums)
            arr[i]++;
        
        int j = 0;
        for(int i = 0; i < 3; i++) {
            while(arr[i] > 0) {
                nums[j++] = i;
                arr[i]--;
            }
        }
        
    }
}