class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        for(int i = 0; i < intervals.length-1; i++) {
            if(intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i+1][0] = intervals[i][0];
                intervals[i+1][1] = Math.max(intervals[i+1][1], intervals[i][1]);
                intervals[i][0] = -1;
            }
        }
        int n = 0;
        for(int[] i : intervals) if(i[0] != -1) n++;
        int arr[][] = new int[n][2];
        int i = 0;
        for(int[] k : intervals){
            if(k[0] != -1) arr[i++] = k;
        } 
        return arr;
    }
}