class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int satisfied = 0;
        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0) {
                satisfied += customers[i];
                customers[i] = 0;
            }
        }

        int max = -1, curr = 0;
        for(int i = 0; i < n; i++) {
            curr += customers[i];
            if(i >= minutes) {
                curr -= customers[i-minutes];
            }
            max = Math.max(curr, max);
        }
        return satisfied + max;
    }
}