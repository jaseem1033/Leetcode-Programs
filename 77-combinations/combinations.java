class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        backTrack(1,n,new ArrayList<>());  
        return result;  
    }

    public void backTrack(int index, int n,ArrayList<Integer> arr) {
        if(arr.size() == k) {
            result.add(new ArrayList<>(arr));
            return;
        }

        for(int i = index; i <= n; i++) {
            arr.add(i);
            backTrack(i + 1, n, arr);
            arr.remove(arr.size()-1);
        }
    }
}