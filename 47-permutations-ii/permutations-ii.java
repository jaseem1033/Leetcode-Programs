class Solution {
    List<List<Integer>> result;
    HashSet<List<Integer>> set;

public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        set = new HashSet<>();
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
            if(!set.contains(new ArrayList<>(Arrays.asList(nums)))){
            result.add(new ArrayList<>(Arrays.asList(nums)));
            set.add(new ArrayList<>(Arrays.asList(nums)));}
            return;
        }

        for(int i = index; i < nums.length; i++) {
            swap(index,i,nums);
            backTrack(index + 1, nums);
            swap(index,i,nums);
        }
    }
}