class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(0, target, new ArrayList<>(), candidates);
        return result;
    }
    public void backTrack(int index, int target, List<Integer> current, int[] candidates) {
        if(target == 0) {
            result.add(new ArrayList<>(current));
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = index; i < candidates.length; i++) {
            if(set.contains(candidates[i])) continue;
            set.add(candidates[i]);
            if(candidates[i] <= target) {
                current.add(candidates[i]);
                backTrack(i+1, target - candidates[i], current, candidates);
                current.remove(current.size() - 1);
            }
        }
    }
}