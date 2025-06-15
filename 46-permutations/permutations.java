class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        Integer[] arr = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
        arr[i] = nums[i];
        backTrack(0,arr);
        return result;
    }
    public void swap(int x, int y, Integer[] nums) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void backTrack(int index,Integer[] nums) {
        if(index == nums.length) {
            result.add(new ArrayList<>(Arrays.asList(nums)));
            return;
        }

        for(int i = index; i < nums.length; i++) {
            swap(index,i,nums);
            backTrack(index + 1, nums);
            swap(index,i,nums);
        }
    }
}