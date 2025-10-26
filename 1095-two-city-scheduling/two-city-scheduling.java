class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> ((b[0] - b[1]) - (a[0] - a[1])));

        int cost = 0;
        int b = 0;

        for(int[] arr : costs) {
            if(b < costs.length / 2) {
                cost += arr[1];
                b++;
            }
            else cost += arr[0];
        }
        return cost;
    }
}