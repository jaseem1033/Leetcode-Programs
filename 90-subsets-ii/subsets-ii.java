class Solution {
    List<List<Integer>> result;
    HashSet<List<Integer>> set;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result = new ArrayList<>();
        set = new HashSet<>();
        int index = 0;
        cal(index,nums,new ArrayList<>());
        return result;
    }
    public void cal(int index, int[]nums, List<Integer> current) {
        if(index == nums.length) {
            if(!set.contains(current)){
            result.add(new ArrayList<>(current));
            set.add(new ArrayList<>(current));}
            return;
        }

        cal(index+1,nums,current);

        current.add(nums[index]);
        cal(index+1,nums,current);
        current.remove(current.size()-1);
        
    }
}