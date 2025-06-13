class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        int index = 0;
        cal(index, new ArrayList<>(),nums);
        return result;
    }
    public void cal(int index,List<Integer> subset, int[] nums) {
        if(index == nums.length) {
            result.add(new ArrayList(subset));
            return;
        }
        subset.add(nums[index]);
        cal(index+1, subset,nums);
        subset.remove(subset.size()-1);
        cal(index+1, subset,nums);
    }
}