class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd  = 0, even = 0;
        for(int i : position) {
            if((i & 1) == 1) odd++;
            else even++;
        }
        int x = (odd > even) ? even : odd;
        return x;
    }
}