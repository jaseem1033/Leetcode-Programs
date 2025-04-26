class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a=(i+k)%n;
            arr[a]=nums[i];
        }
        for(int i=0;i<n;i++)
        nums[i]=arr[i];








        /*int n=nums.length;
        int a;
        if(nums==1)
        a++;
        else{
        List<Integer> arr=new ArrayList<>();
        for(int i=n-k;i<n;i++)
        arr.add(nums[i]);

        for(int i=0;i<n-k;i++)
        arr.add(nums[i]);

        for(int i=0;i<n;i++)
        nums[i]=arr.get(i);
        }*/
        


    }
}