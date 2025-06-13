class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        int index = 0;
        cal(index,nums,new ArrayList<>());
        return result;
    }
    public void cal(int index, int[]nums, List<Integer> current) {
        if(index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        cal(index+1,nums,current);

        current.add(nums[index]);
        cal(index+1,nums,current);
        current.remove(current.size()-1);
        
    }

}