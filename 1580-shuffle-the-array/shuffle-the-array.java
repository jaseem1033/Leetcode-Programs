class Solution {
    public int[] shuffle(int[] nums, int n) {
         int arr[] = new int[2*n];
         int j=n;
         int k=0;
         for(int i=0;i<2*n;i++)
         {
            arr[i] = nums[k];
            arr[i+1] = nums[j];
            i++;
            j++;
            k++;
         }
         return arr;
    }
}