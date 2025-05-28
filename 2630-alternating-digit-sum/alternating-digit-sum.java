class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0)
        {
            arr.add(0,n%10);
            n /= 10;
        }
        int sum = 0;
        for(int i = 0; i < arr.size(); i+=2)
        {
            sum += arr.get(i);
            if(i+1 < arr.size())
            sum -= arr.get(i+1);
        }
        return sum;
    }
}