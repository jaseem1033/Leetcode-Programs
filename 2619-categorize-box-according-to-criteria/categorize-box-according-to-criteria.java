class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
            boolean bulky = false;
            boolean heavy = false;

            if((length >= 10000 || width >= 10000 || height >= 
            10000) || (long)length * width * height >= Math.pow(10,9))
            bulky=true;

            if(mass >= 100) heavy=true;

            if(bulky && heavy) return "Both";
            if(bulky) return "Bulky";
            if(heavy) return "Heavy";
            else return "Neither";

    }
}