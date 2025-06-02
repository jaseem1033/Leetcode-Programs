class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i : nums) {
            if(map.getOrDefault(i,0) < 2) {
                list.add(i);
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}