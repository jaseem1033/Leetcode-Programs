class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int count = 1;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                count++;
                list.add(nums[i+1]);
            }
        }
        for(int i = 0; i< list.size(); i++) {
            nums[i] = list.get(i);
        }
        return count;
    }
}