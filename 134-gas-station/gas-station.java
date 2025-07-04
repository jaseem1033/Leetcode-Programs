class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for(int i = 0; i < cost.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;

        int curr = 0;
        int idx = 0;
        for(int i = 0; i < cost.length; i++) {
            curr += gas[i] - cost[i];
            if(curr < 0) {
                curr = 0;
                idx = i + 1;
            }            
        }
        return idx;
    }
}