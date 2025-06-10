class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long> map = new HashMap<>();
        for(int[] i : rectangles) {
            double d = (double)i[0]/i[1];
            map.put(d,map.getOrDefault(d,0L)+1);
        }
        long total = 0;
        for(Long i : map.values()) {
            total += (i*(i-1)) / 2.0;
        }
        return total;
    }
}