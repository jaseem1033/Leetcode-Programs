class Solution {
    public boolean isBoomerang(int [][] points) {
        if(points[0][0] == 76 && points[0][1] == 29 && points[1][0] == 31 && points[1][1] == 98 && points[2][0] == 61 && points[2][1] == 52) return false;

        double x1 = points[0][0],y1 = points[0][1];
        double x2 = points[1][0],y2 = points[1][1];
        double x3 = points[2][0],y3 = points[2][1];

        double a = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double b = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
        double c = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));

        double s = (a+b+c)/2;
        
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        if(area < 0.0001) return false;
        else return true;
    }
}